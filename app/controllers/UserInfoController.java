package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.UserInfo;
import models.dto.UserInfoDTO;
import models.vo.UserInfoVo;
import play.mvc.With;

/**
 * @Author: gaobaozong
 * @Description: 用户基本信息
 * @Date: Created in 2017/9/23 - 14:56
 * @Version: V1.0
 */
@With({RequestFilter.class, AuthController.class})
public class UserInfoController extends BaseController<UserInfoDTO, UserInfo, UserInfoVo> {

}
