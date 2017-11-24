package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 用户车辆 关联
 * @Date: Created in 2017/11/13 - 21:20
 * @Version: V1.0
 */
@Entity
@Table(name="UC_USER_CAR")
public class ReUserCar extends GenericModel {
    @Id
    @Column(name = "ID")
    public String id;
    @Column(name = "USER_ID")
    public String userId;
    @Column(name = "CAR_ID")
    public String carId;
    @Column(name = "USER_CAR_RESV1")
    public String userCarResv1;
    @Column(name = "USER_CAR_RESV2")
    public String userCarResv2;
    @Column(name = "USER_CAR_RESV3")
    public String userCarResv3;

    public static ReUserCar findByCarId(String carId){
      return   ReUserCar.find("carId = ?" , carId).first();
    }

}
