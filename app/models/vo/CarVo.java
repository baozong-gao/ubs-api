package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 用户车辆
 * @Date: Created in 2017/11/10 - 15:32
 * @Version: V1.0
 */
public class CarVo {

    public String id;                          //ID
    public String carType;                     //车辆类型
    public String carBelong;                   //P 个人 B 单位
    public String carPlateNo;                  //车牌号
    public String carVinNo;                    //车架号
    public String carVinNoLast6;               //车架号后六位
    public String carEngineNo;                 //车辆引擎编号
    public String carLicenceNo;                //行驶证编号
    public String carResv1;                    //
    public String carResv2;                    //
    public String carResv3;                    //
    public String modifySource;                //
    public String modifyUser;                  //

    public String bindId;

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarBelong() {
        return carBelong;
    }

    public void setCarBelong(String carBelong) {
        this.carBelong = carBelong;
    }

    public String getCarPlateNo() {
        return carPlateNo;
    }

    public void setCarPlateNo(String carPlateNo) {
        this.carPlateNo = carPlateNo;
    }

    public String getCarVinNo() {
        return carVinNo;
    }

    public void setCarVinNo(String carVinNo) {
        this.carVinNo = carVinNo;
    }

    public String getCarVinNoLast6() {
        return carVinNoLast6;
    }

    public void setCarVinNoLast6(String carVinNoLast6) {
        this.carVinNoLast6 = carVinNoLast6;
    }

    public String getCarEngineNo() {
        return carEngineNo;
    }

    public void setCarEngineNo(String carEngineNo) {
        this.carEngineNo = carEngineNo;
    }

    public String getCarLicenceNo() {
        return carLicenceNo;
    }

    public void setCarLicenceNo(String carLicenceNo) {
        this.carLicenceNo = carLicenceNo;
    }

    public String getCarResv1() {
        return carResv1;
    }

    public void setCarResv1(String carResv1) {
        this.carResv1 = carResv1;
    }

    public String getCarResv2() {
        return carResv2;
    }

    public void setCarResv2(String carResv2) {
        this.carResv2 = carResv2;
    }

    public String getCarResv3() {
        return carResv3;
    }

    public void setCarResv3(String carResv3) {
        this.carResv3 = carResv3;
    }

    public String getModifySource() {
        return modifySource;
    }

    public void setModifySource(String modifySource) {
        this.modifySource = modifySource;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
}
