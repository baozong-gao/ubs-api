package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 违章 城市
 * @Date: Created in 2017/11/13 - 13:34
 * @Version: V1.0
 */
public class IllegalCityVo {

    public String id;                         //主键
    public String provinceId;                 //省份id
    public String provinceName;               //省份描述
    public String provincePrefix;             //省简称
    public String cityId;                     //城市ID
    public String cityName;                   //城市全名（省+市）
    public String cityShortName;              //城市名称
    public String carNumberPre;               //车牌前缀
    public String carCodeLen;                 //车架号长度
    public String carEngineLen;               //发动机号长度
    public String locationId;                 //违章地编码
    public String locationName;               //违章地名称
    public String degree;                     //扣分
    public String poundage;                   //手续费
    public String canProcess;                 //是否可以办理
    public String ext1;                       //
    public String ext2;                       //
    public String ext3;                       //


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvincePrefix() {
        return provincePrefix;
    }

    public void setProvincePrefix(String provincePrefix) {
        this.provincePrefix = provincePrefix;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityShortName() {
        return cityShortName;
    }

    public void setCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
    }

    public String getCarNumberPre() {
        return carNumberPre;
    }

    public void setCarNumberPre(String carNumberPre) {
        this.carNumberPre = carNumberPre;
    }

    public String getCarCodeLen() {
        return carCodeLen;
    }

    public void setCarCodeLen(String carCodeLen) {
        this.carCodeLen = carCodeLen;
    }

    public String getCarEngineLen() {
        return carEngineLen;
    }

    public void setCarEngineLen(String carEngineLen) {
        this.carEngineLen = carEngineLen;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPoundage() {
        return poundage;
    }

    public void setPoundage(String poundage) {
        this.poundage = poundage;
    }

    public String getCanProcess() {
        return canProcess;
    }

    public void setCanProcess(String canProcess) {
        this.canProcess = canProcess;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }
}
