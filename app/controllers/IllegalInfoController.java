package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.Car;
import models.IllegalInfo;
import models.UCFee;
import models.UCFeePK;
import models.dto.IllegalInfoDTO;
import models.vo.IllegalInfoVo;
import models.vo.ResultVo;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.math.NumberUtils;
import play.Logger;
import play.mvc.With;
import util.ApiException;
import util.BeanUtil;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: gaobaozong
 * @Description: 违章
 * @Date: Created in 2017/11/13 - 11:06
 * @Version: V1.0
 */
@With({RequestFilter.class, AuthController.class})
public class IllegalInfoController extends BaseController<IllegalInfoDTO, IllegalInfo, IllegalInfoVo> {

    /**
     * @Author: gaobaozong
     * @Description: 查询
     * @Date: Created in 2017/9/23 - 14:58
     * @param:
     * @return:
     */
    public void seach(String body) throws ApiException {
        List<IllegalInfoVo> result = new ArrayList<>();
        try {
            IllegalInfoDTO dto = BeanUtil.jsonToBean(body, IllegalInfoDTO.class, "yyyy-MM-dd");
            BeanUtil.checkBody(dto, validation);
            List list = new IllegalInfo().findByDTO(dto);
            result = BeanUtil.copyList(list, VClass);
            countFree(result, dto.userId);
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            Logger.error("查询 异常 %s  \n %s", body, ExceptionUtils.getStackTrace(e));
            renderJSON(ResultVo.error("查询 异常"));
        }
        renderJSON(ResultVo.succeed(result));
    }

    private static void countFree(List<IllegalInfoVo> result, String userId) {
        Optional.ofNullable(result).ifPresent(s -> {
            s.stream().forEach(_s -> {
                UCFeePK pk = new UCFeePK();
                pk.userType = "3";
                pk.userCode = userId;
                pk.category = "0";
                pk.categoryId = "P001";
                pk.feeType = "ER";
                UCFee er = UCFee.findById(pk);
                UCFeePK pk1 = new UCFeePK();
                pk1.userType = "3";
                pk1.userCode = userId;
                pk1.category = "0";
                pk1.categoryId = "P001";
                pk1.feeType = "EF";
                UCFee ef = UCFee.findById(pk1);
                Optional.ofNullable(er)
                        .filter(_er -> StringUtils.isNotBlank(_er.feeMode))
                        .filter(_er -> NumberUtils.isNumber(_er.feeMode))
                        .ifPresent(_er -> {
                            BigDecimal erMode = new BigDecimal(_er.feeMode).divide(new BigDecimal(100));
                            _s.serviceFee += new BigDecimal(_s.serviceFee).multiply(erMode).toString();
                        });
                Optional.ofNullable(ef)
                        .filter(_er -> StringUtils.isNotBlank(_er.feeMode))
                        .filter(_er -> NumberUtils.isNumber(_er.feeMode))
                        .ifPresent(_er -> {
                            _s.serviceFee += new BigDecimal(_s.serviceFee).add(new BigDecimal(_er.feeMode)).toString();
                        });
                Optional.ofNullable(_s.serviceFee)
                        .filter(_fee -> NumberUtils.isNumber(_fee))
                        .ifPresent(_fee -> {
                            double x = Double.parseDouble(_fee);
                            long y = (long) x;
                            double z = x - y;
                            long l = z > 0 ? 1 : 0;
                            _s.serviceFee = (y + l) + "";
                        });
            });
        });
    }

    /**
     * @Author: gaobaozong
     * @Description: 用户违章
     * @Date: Created in 2017/11/23 - 11:47
     * @param:
     * @return:
     */
    public static void findByUser(String userId) {
        Map<String, List<IllegalInfoVo>> result = new HashMap<>();
        try {
            List<String> carNo = new ArrayList<>();
            List<Car> cars = Car.findCarByUserId(userId);
            Optional.ofNullable(cars).ifPresent(_cars -> {
                _cars.stream().forEach(car -> {
                    carNo.add(car.carPlateNo);
                    result.put(car.carPlateNo, null);
                });
            });
            List<IllegalInfo> illegalInfos = IllegalInfo.findByCarNo(carNo);
            Optional.ofNullable(illegalInfos).ifPresent(list ->{
                list.stream().forEach(illegal ->{
                    try {
                        List<IllegalInfoVo> illegals = Optional.ofNullable(result.get(illegal.carNumber))
                                .orElseGet(() -> {
                                    result.put(illegal.carNumber, new ArrayList<IllegalInfoVo>());
                                    return result.get(illegal.carNumber);
                                });
                        IllegalInfoVo desc = new IllegalInfoVo();
                        BeanUtil.copy(illegal, desc);
                        illegals.add(desc);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                });
            });
            result.keySet().stream().forEach(_key ->{
                try {
                    countFree(result.get(_key), userId);
                }catch (Exception e){}
            });
        }catch (Exception e){
            Logger.error("查询用户违章异常\n %s", ExceptionUtils.getStackTrace(e));
            renderJSON(ResultVo.error("查询 异常"));
        }
        renderJSON(ResultVo.succeed(result));
    }

}
