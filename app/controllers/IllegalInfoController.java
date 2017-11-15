package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.IllegalInfo;
import models.dto.IllegalInfoDTO;
import models.vo.IllegalInfoVo;
import play.mvc.With;

/**
 * @Author: gaobaozong
 * @Description: 违章
 * @Date: Created in 2017/11/13 - 11:06
 * @Version: V1.0
 */
@With({RequestFilter.class, AuthController.class})
public class IllegalInfoController extends  BaseController<IllegalInfoDTO, IllegalInfo, IllegalInfoVo>{
}
