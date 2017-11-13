package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 违章
 * @Date: Created in 2017/11/13 - 11:05
 * @Version: V1.0
 */
public class IllegalInfoVo {

    public String id;                       //违章归属地点ID
    public String wzId;                     //违章ID
    public String time;                     //违章时间
    public String carNumber;                //车牌号
    public String province;                 //省份
    public String reason;                   //违章原因
    public String department;               //违章采集机关
    public String code;                     //违章代码
    public String carDriveNumber;           //发动机号
    public String status;                   //本地状态
    public String archive;                  //违章项文书编号
    public String telephone;                //联系电话
    public String locationId;               //地点编码
    public String locationName;             //违章归属地点名
    public String category;                 //违章类别
    public String recordType;               //数据类别
    public String wzUnique;                 //违章特征码
    public String wflx;                     //违章类型:扣分单和非扣分单
    public String blsm;                     //办理说明
    public String privateFlag;              //私有标志0：单位车，1：私家车
    public String degree;                   //违章扣分
    public String refine;                   //违章罚款
    public String lateFine;                 //滞纳金
    public String canProcess;               //能否代办 1能，0否
    public String canProcessUsOrder;        //能否本人本证办理1能，0否
    public String canProcessMsg;            //不能代办的原因
    public String serviceFee;               //服务费
    public String brbzServiceFee;           //本人本证服务费
    public String location;                 //地址
    public String city;                     //城市
    public String chnlStatus;               //渠道状态：0未处理 1处理中 2 已处理
    public String exeOrder;                 //处理单ID
    public String deadLine;                 //截止日期（备用）
    public String payFee;                   //需支付费用
    public String isUsPrice;                //是否本人本证
    public String transDatetime;            //处理时间
    public String chnlCode;                 //渠道处理状态
    public String chnlOrderSn;              //渠道订单号
    public String ext1;                     //扩展1
    public String ext2;                     //扩展2
    public String ext3;                     //扩展3
    public String modifySource;             //更新源
    public String modifyUser;               //修改账户


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWzId() {
        return wzId;
    }

    public void setWzId(String wzId) {
        this.wzId = wzId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCarDriveNumber() {
        return carDriveNumber;
    }

    public void setCarDriveNumber(String carDriveNumber) {
        this.carDriveNumber = carDriveNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getWzUnique() {
        return wzUnique;
    }

    public void setWzUnique(String wzUnique) {
        this.wzUnique = wzUnique;
    }

    public String getWflx() {
        return wflx;
    }

    public void setWflx(String wflx) {
        this.wflx = wflx;
    }

    public String getBlsm() {
        return blsm;
    }

    public void setBlsm(String blsm) {
        this.blsm = blsm;
    }

    public String getPrivateFlag() {
        return privateFlag;
    }

    public void setPrivateFlag(String privateFlag) {
        this.privateFlag = privateFlag;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRefine() {
        return refine;
    }

    public void setRefine(String refine) {
        this.refine = refine;
    }

    public String getLateFine() {
        return lateFine;
    }

    public void setLateFine(String lateFine) {
        this.lateFine = lateFine;
    }

    public String getCanProcess() {
        return canProcess;
    }

    public void setCanProcess(String canProcess) {
        this.canProcess = canProcess;
    }

    public String getCanProcessUsOrder() {
        return canProcessUsOrder;
    }

    public void setCanProcessUsOrder(String canProcessUsOrder) {
        this.canProcessUsOrder = canProcessUsOrder;
    }

    public String getCanProcessMsg() {
        return canProcessMsg;
    }

    public void setCanProcessMsg(String canProcessMsg) {
        this.canProcessMsg = canProcessMsg;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getBrbzServiceFee() {
        return brbzServiceFee;
    }

    public void setBrbzServiceFee(String brbzServiceFee) {
        this.brbzServiceFee = brbzServiceFee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getChnlStatus() {
        return chnlStatus;
    }

    public void setChnlStatus(String chnlStatus) {
        this.chnlStatus = chnlStatus;
    }

    public String getExeOrder() {
        return exeOrder;
    }

    public void setExeOrder(String exeOrder) {
        this.exeOrder = exeOrder;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee;
    }

    public String getIsUsPrice() {
        return isUsPrice;
    }

    public void setIsUsPrice(String isUsPrice) {
        this.isUsPrice = isUsPrice;
    }

    public String getTransDatetime() {
        return transDatetime;
    }

    public void setTransDatetime(String transDatetime) {
        this.transDatetime = transDatetime;
    }

    public String getChnlCode() {
        return chnlCode;
    }

    public void setChnlCode(String chnlCode) {
        this.chnlCode = chnlCode;
    }

    public String getChnlOrderSn() {
        return chnlOrderSn;
    }

    public void setChnlOrderSn(String chnlOrderSn) {
        this.chnlOrderSn = chnlOrderSn;
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
