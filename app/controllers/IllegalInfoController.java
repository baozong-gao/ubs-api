package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.IllegalInfo;
import models.dto.IllegalInfoDTO;
import models.vo.IllegalInfoVo;
import models.vo.ResultVo;
import org.apache.commons.lang.exception.ExceptionUtils;
import play.Logger;
import play.mvc.With;
import util.ApiException;
import util.BeanUtil;

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
public class IllegalInfoController extends  BaseController<IllegalInfoDTO, IllegalInfo, IllegalInfoVo>{

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
            Optional.ofNullable(result).ifPresent(s ->{
                s.stream().forEach(_s ->{
                    //TODO 费率
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
