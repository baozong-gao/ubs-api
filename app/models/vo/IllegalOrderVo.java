package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 违章 订单
 * @Date: Created in 2017/11/20 - 15:14
 * @Version: V1.0
 */
public class IllegalOrderVo {

    public String id;                    //id
    public String orderId;               //订单编号
    public String userId;                //用户id
    public String status;                //订单状态
    public String totAmount;             //总金额
    public String totDegree;             //总扣分
    public String totCount;              //总违章条目
    public String serviceFee;            //商户服务费
    public String chnlFee;               //渠道服务费
    public String feeRate;               //
    public String payOrder;              //支付订单号
    public String exeBegTime;            //生成订单时间
    public String exeEndTime;            //订单结束时间
    public String ext1;                  //扩展域1
    public String ext2;                  //扩展域2
    public String ext3;                  //扩展域3
    public String ext4;                  //扩展域4
    public String ext5;                  //扩展域5
    public String ext6;                  //扩展域6
    public String modifySource;          //更新源
    public String modifyUser;            //修改账户

}
