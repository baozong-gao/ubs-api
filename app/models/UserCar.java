package models;

import models.dto.UserCarDTO;

import javax.persistence.*;

/**
 * @Author: gaobaozong
 * @Description: 用户车辆
 * @Date: Created in 2017/11/10 - 15:29
 * @Version: V1.0
 */
@Entity
@Table(name="UC_USER_CAR")
public class UserCar extends BaseModel<UserCarDTO>{
    @Id
    @Column(name="ID")
    public String id;                          //ID
    @Column(name="USER_ID")
    public String userId;                      //会员号
    @Column(name="CAR_TYPE")
    public String carType;                     //车辆类型
    @Column(name="CAR_BELONG")
    public String carBelong;                   //P 个人 B 单位
    @Column(name="CAR_PLATE_NO")
    public String carPlateNo;                  //车牌号
    @Column(name="CAR_VIN_NO")
    public String carVinNo;                    //车架号
    @Column(name="CAR_VIN_NO_LAST6")
    public String carVinNoLast6;               //车架号后六位
    @Column(name="CAR_ENGINE_NO")
    public String carEngineNo;                 //车辆引擎编号
    @Column(name="CAR_LICENCE_NO")
    public String carLicenceNo;                //行驶证编号
    @Column(name="CAR_RESV1")
    public String carResv1;                    //
    @Column(name="CAR_RESV2")
    public String carResv2;                    //
    @Column(name="CAR_RESV3")
    public String carResv3;                    //
    @Column(name="MODIFY_SOURCE")
    public String modifySource;                //
    @Column(name="MODIFY_USER")
    public String modifyUser;                  //
    @Column(name="CREATE_TIME")
    public String createTime;                  //
    @Column(name="UPDATE_TIME")
    public String updateTime;                  //
    @Column(name="LOCK_VERSION")
    @Version
    public Integer lockVersion;                 //
}
