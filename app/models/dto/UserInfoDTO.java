package models.dto;

import play.data.validation.*;

/**
 * @Author: gaobaozong
 * @Description: 用户基本信息
 * @Date: Created in 2017/9/25 - 14:33
 * @Version: V1.0
 */
public class UserInfoDTO {
    @MaxSize(value=16,message="手机号长度超限")
    public String mobile;

    @MaxSize(value=256,message="登入名长度超限")
    public String loginId;

    @MaxSize(value=256,message="昵称长度超限")
    public String nickName;

    @MaxSize(value=2,message="状态长度超限")
    public String userStatus;

    @MaxSize(value=32,message="注册源状态长度超限")
    public String modifySource;

}
