package models;

import models.dto.IllegalCityDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: gaobaozong
 * @Description: 违章 城市
 * @Date: Created in 2017/11/13 - 13:30
 * @Version: V1.0
 */
@Entity
@Table(name="WZ_CITY_LIST")
public class IllegalCity extends BaseModel<IllegalCityDTO>{
    @Id
    @Column(name="ID")
    public String id;                         //主键
    @Column(name="PROVINCE_ID")
    public String provinceId;                 //省份id
    @Column(name="PROVINCE_NAME")
    public String provinceName;               //省份描述
    @Column(name="PROVINCE_PREFIX")
    public String provincePrefix;             //省简称
    @Column(name="CITY_ID")
    public String cityId;                     //城市ID
    @Column(name="CITY_NAME")
    public String cityName;                   //城市全名（省+市）
    @Column(name="CITY_SHORT_NAME")
    public String cityShortName;              //城市名称
    @Column(name="CAR_NUMBER_PRE")
    public String carNumberPre;               //车牌前缀
    @Column(name="CAR_CODE_LEN")
    public String carCodeLen;                 //车架号长度
    @Column(name="CAR_ENGINE_LEN")
    public String carEngineLen;               //发动机号长度
    @Column(name="LOCATION_ID")
    public String locationId;                 //违章地编码
    @Column(name="LOCATION_NAME")
    public String locationName;               //违章地名称
    @Column(name="DEGREE")
    public String degree;                     //扣分
    @Column(name="POUNDAGE")
    public String poundage;                   //手续费
    @Column(name="CAN_PROCESS")
    public String canProcess;                 //是否可以办理
    @Column(name="EXT1")
    public String ext1;                       //
    @Column(name="EXT2")
    public String ext2;                       //
    @Column(name="EXT3")
    public String ext3;                       //
}
