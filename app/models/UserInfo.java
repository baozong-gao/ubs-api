package models;

import models.dto.UserInfoDTO;
import play.db.jpa.GenericModel;

import javax.persistence.*;

/**
 * @Author: gaobaozong
 * @Description: 用户基本信息
 * @Date: Created in 2017/9/23 - 15:09
 * @Version: V1.0
 */
@Entity
@Table(name="UC_USER_INFO")
public class UserInfo extends BaseModel<UserInfoDTO>{

    @Id
    @Column(name="ID")
    public String id;                                  //会员ID
    @Column(name="INST_ID")
    public String instId;                              //机构ID
    @Column(name="MOBILE")
    public String mobile;                              //手机号
    @Column(name="LOGIN_ID")
    public String loginId;                             //登录名
    @Column(name="USER_NAME")
    public String userName;                            //会员姓名
    @Column(name="NICK_NAME")
    public String nickName;                            //会员昵称
    @Column(name="LOGIN_PASSWORD")
    public String loginPassword;                       //登录密码
    @Column(name="PAY_PASSWORD")
    public String payPassword;                         //支付密码
    @Column(name="HAND_PASSWORD")
    public String handPassword;                        //手势密码
    @Column(name="SALT")
    public String salt;                                //盐值
    @Column(name="USER_TYPE")
    public String userType;                            //会员类型 00普通用户
    @Column(name="USER_STATUS")
    public String userStatus;                          //会员状态
    @Column(name="USER_REG_SOURCE")
    public String userRegSource;                       //会员注册源
    @Column(name="USER_REG_DEVICE_ID")
    public String userRegDeviceId;                     //会员注册设备号
    @Column(name="USER_PROMOTE_SOURCE")
    public String userPromoteSource;                   //会员营销源
    @Column(name="MODIFY_SOURCE")
    public String modifySource;                        //会员修改源
    @Column(name="MODIFY_USER")
    public String modifyUser;                          //会员修改用户
    @Column(name="USER_RESV1")
    public String userResv1;                           //会员扩展域1
    @Column(name="USER_RESV2")
    public String userResv2;                           //会员扩展域2
    @Column(name="USER_RESV3")
    public String userResv3;                           //会员扩展域3
    @Column(name="LOCK_VERISON")
    @Version
    public Integer lockVerison;                         //乐观锁版本
    @Column(name="CREATE_TIME")
    public String createTime;                          //创建时间
    @Column(name="UPDATE_TIME")
    public String updateTime;                          //更新时间


}
