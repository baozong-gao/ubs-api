package models;

import models.dto.IllegalOrderDTO;

import javax.persistence.*;

/**
 * @Author: gaobaozong
 * @Description: 违章 订单
 * @Date: Created in 2017/11/20 - 15:12
 * @Version: V1.0
 */
@Entity
@Table(name="WZ_EXE_ORDER")
public class IllegalOrder extends BaseModel<IllegalOrderDTO>{
    @Id
    @Column(name = "ID")
    public String id;                    //id
    @Column(name = "ORDER_ID")
    public String orderId;               //订单编号
    @Column(name = "USER_ID")
    public String userId;                //用户id
    @Column(name = "STATUS")
    public String status;                //订单状态
    @Column(name = "TOT_AMOUNT")
    public String totAmount;             //总金额
    @Column(name = "TOT_DEGREE")
    public String totDegree;             //总扣分
    @Column(name = "TOT_COUNT")
    public String totCount;              //总违章条目
    @Column(name = "SERVICE_FEE")
    public String serviceFee;            //商户服务费
    @Column(name = "CHNL_FEE")
    public String chnlFee;               //渠道服务费
    @Column(name = "FEE_RATE")
    public String feeRate;               //
    @Column(name = "PAY_ORDER")
    public String payOrder;              //支付订单号
    @Column(name = "EXE_BEG_TIME")
    public String exeBegTime;            //生成订单时间
    @Column(name = "EXE_END_TIME")
    public String exeEndTime;            //订单结束时间
    @Column(name = "EXT1")
    public String ext1;                  //扩展域1
    @Column(name = "EXT2")
    public String ext2;                  //扩展域2
    @Column(name = "EXT3")
    public String ext3;                  //扩展域3
    @Column(name = "EXT4")
    public String ext4;                  //扩展域4
    @Column(name = "EXT5")
    public String ext5;                  //扩展域5
    @Column(name = "EXT6")
    public String ext6;                  //扩展域6
    @Column(name = "MODIFY_SOURCE")
    public String modifySource;          //更新源
    @Column(name = "MODIFY_USER")
    public String modifyUser;            //修改账户
    @Column(name = "LOCK_VERSION")
    @Version
    public Integer lockVersion;           //乐观锁
    @Column(name = "CREATE_TIME")
    public String createTime;            //创建日期
    @Column(name = "UPDATE_TIME")
    public String updateTime;            //商户费率

}
