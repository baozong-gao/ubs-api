package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.UserProdInfo;
import models.dto.UserProdInfoDTO;
import models.vo.UserProdInfoVo;
import play.mvc.With;

/**
 * @Author: gaobaozong
 * @Description: 用户产品
 * @Date: Created in 2017/11/10 - 15:17
 * @Version: V1.0
 */
@With({RequestFilter.class, AuthController.class})
public class UserProdInfoController extends BaseController<UserProdInfoDTO, UserProdInfo,UserProdInfoVo>{
}
