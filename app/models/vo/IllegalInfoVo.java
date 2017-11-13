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
}
