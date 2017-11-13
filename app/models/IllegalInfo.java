package models;

import models.dto.IllegalInfoDTO;

import javax.persistence.*;

/**
 * @Author: gaobaozong
 * @Description: 违章
 * @Date: Created in 2017/11/13 - 10:46
 * @Version: V1.0
 */
@Entity
@Table(name="WZ_INFO")
public class IllegalInfo extends BaseModel<IllegalInfoDTO>{

    @Id
    @Column(name = "ID")
    public String id;                       //违章归属地点ID
    @Column(name = "WZ_ID")
    public String wzId;                     //违章ID
    @Column(name = "TIME")
    public String time;                     //违章时间
    @Column(name = "CAR_NUMBER")
    public String carNumber;                //车牌号
    @Column(name = "PROVINCE")
    public String province;                 //省份
    @Column(name = "REASON")
    public String reason;                   //违章原因
    @Column(name = "DEPARTMENT")
    public String department;               //违章采集机关
    @Column(name = "CODE")
    public String code;                     //违章代码
    @Column(name = "CAR_DRIVE_NUMBER")
    public String carDriveNumber;           //发动机号
    @Column(name = "STATUS")
    public String status;                   //本地状态
    @Column(name = "ARCHIVE")
    public String archive;                  //违章项文书编号
    @Column(name = "TELEPHONE")
    public String telephone;                //联系电话
    @Column(name = "LOCATION_ID")
    public String locationId;               //地点编码
    @Column(name = "LOCATION_NAME")
    public String locationName;             //违章归属地点名
    @Column(name = "CATEGORY")
    public String category;                 //违章类别
    @Column(name = "RECORD_TYPE")
    public String recordType;               //数据类别
    @Column(name = "WZ_UNIQUE")
    public String wzUnique;                 //违章特征码
    @Column(name = "WFLX")
    public String wflx;                     //违章类型:扣分单和非扣分单
    @Column(name = "BLSM")
    public String blsm;                     //办理说明
    @Column(name = "PRIVATE_FLAG")
    public String privateFlag;              //私有标志0：单位车，1：私家车
    @Column(name = "DEGREE")
    public String degree;                   //违章扣分
    @Column(name = "REFINE")
    public String refine;                   //违章罚款
    @Column(name = "LATE_FINE")
    public String lateFine;                 //滞纳金
    @Column(name = "CAN_PROCESS")
    public String canProcess;               //能否代办 1能，0否
    @Column(name = "CAN_PROCESS_US_ORDER")
    public String canProcessUsOrder;        //能否本人本证办理1能，0否
    @Column(name = "CAN_PROCESS_MSG")
    public String canProcessMsg;            //不能代办的原因
    @Column(name = "SERVICE_FEE")
    public String serviceFee;               //服务费
    @Column(name = "BRBZ_SERVICE_FEE")
    public String brbzServiceFee;           //本人本证服务费
    @Column(name = "LOCATION")
    public String location;                 //地址
    @Column(name = "CITY")
    public String city;                     //城市
    @Column(name = "CHNL_STATUS")
    public String chnlStatus;               //渠道状态：0未处理 1处理中 2 已处理
    @Column(name = "EXE_ORDER")
    public String exeOrder;                 //处理单ID
    @Column(name = "DEAD_LINE")
    public String deadLine;                 //截止日期（备用）
    @Column(name = "PAY_FEE")
    public String payFee;                   //需支付费用
    @Column(name = "IS_US_PRICE")
    public String isUsPrice;                //是否本人本证
    @Column(name = "TRANS_DATETIME")
    public String transDatetime;            //处理时间
    @Column(name = "CHNL_CODE")
    public String chnlCode;                 //渠道处理状态
    @Column(name = "CHNL_ORDER_SN")
    public String chnlOrderSn;              //渠道订单号
    @Column(name = "EXT1")
    public String ext1;                     //扩展1
    @Column(name = "EXT2")
    public String ext2;                     //扩展2
    @Column(name = "EXT3")
    public String ext3;                     //扩展3
    @Column(name = "MODIFY_SOURCE")
    public String modifySource;             //更新源
    @Column(name = "MODIFY_USER")
    public String modifyUser;               //修改账户
    @Column(name = "LOCK_VERSION")
    @Version
    public Integer lockVersion;              //乐观锁
    @Column(name = "CREATE_TIME")
    public String createTime;               //创建日期
    @Column(name = "UPDATE_TIME")
    public String updateTime;               //更新日期
}
