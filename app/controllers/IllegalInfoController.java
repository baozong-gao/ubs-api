package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
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
import util.Money;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            Optional.ofNullable(result).ifPresent(s -> {
                s.stream().forEach(_s -> {
                    UCFeePK pk = new UCFeePK();
                    pk.userType = "3";
                    pk.userCode = dto.userId;
                    pk.category = "0";
                    pk.categoryId = "P001";
                    pk.feeType = "ER";
                    UCFee er = UCFee.findById(pk);
                    pk.feeType = "EF";
                    UCFee ef = UCFee.findById(pk);
                    Optional.ofNullable(er)
                            .filter(_er -> StringUtils.isNotBlank(_er.feeMode))
                            .filter(_er -> NumberUtils.isNumber(_er.feeMode))
                            .ifPresent(_er -> {
                                BigDecimal erMode = new BigDecimal(_er.feeMode).divide(new BigDecimal(100));
                                _s.payFee = new BigDecimal(_s.payFee).multiply(erMode).toString();
                            });
                    Optional.ofNullable(ef)
                            .filter(_er -> StringUtils.isNotBlank(_er.feeMode))
                            .filter(_er -> NumberUtils.isNumber(_er.feeMode))
                            .ifPresent(_er -> {
                                _s.payFee = new BigDecimal(_s.payFee).add(new BigDecimal(_er.feeMode)).toString();
                            });
                    Optional.ofNullable(_s.payFee)
                            .filter(_fee -> NumberUtils.isNumber(_fee))
                            .ifPresent(_fee ->{
                                double x = Double.parseDouble(_fee);
                                long y = (long)x;
                                double z = x - y;
                                long l = z > 0 ? 1 : 0;
                                _s.payFee = (y + l)+"";
                            });
                });
            });
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            Logger.error("查询 异常 %s  \n %s", body, ExceptionUtils.getStackTrace(e));
            renderJSON(ResultVo.error("查询 异常"));
        }
        renderJSON(ResultVo.succeed(result));
    }
}
