package models.dto;

/**
 * @Author: gaobaozong
 * @Description: 用于  查询
 * @Date: Created in 2017/11/20 - 13:38
 * @Version: V1.0
 */
public class OrderDTO {
    public String id;                          //ID
    public String instId;                      //机构号
    public String mid;                         //商户号
    public String tid;                         //终端号
    public String orderId;                     //订单号
    public String orderDate;                   //订单日期
    public String orderTime;                   //订单时间
    public String orderType;                   //订单类型
    public String platformSeq;                 //流水号
    public String qrcChannel;                  //二维码渠道号
    public String qrcChannelFlag;              //渠道标志
    public String qrcChannelMid;               //二维码渠道商户号
    public String qrcChannelTid;               //二维码渠道终端号
    public String qrcPaymentStatus;            //二维码支付状态
    public String cardNo;                      //卡号
    public String virtualAcctNo;               //虚拟用户标志
    public String tradeAmount;                 //交易金额
    public String feeAmount;                   //手续费金额
    public String netAmount;                   //清算净额
    public String benifitAmount;               //分润金额
    public String creditDebitFlag;             //借贷标志
    public String bipiSendMode;                //bipi发送方式
    public String bipiSendId;                  //bipi发送id
    public String bipiSendDate;                //bipi发送日期
    public String bipiSendTime;                //bipi发送时间
    public String bipiStatus;                  //bipi状态
    public String bipiRespCode;                //bipi应答码
    public String bipiRespMessage;             //bipi应答消息
    public String bipiTraceId;                 //bipi订单跟踪号
    public String bipiRespDate;                //bipi返回日期
    public String bipiRespTime;                //bipi返回时间
    public String bipiRespResv1;               //bipi应答扩展域1
    public String bipiRespResv2;               //bipi应答扩展域2
    public String checkFlag;                   //对账标志
    public String clearDate;                   //清算日期
    public String printFlag;                   //小票打印标志
    public String remark;                      //备注
    public String paymentResv1;                //支付扩展域1
    public String paymentResv2;                //支付扩展域2
    public String paymentResv3;                //支付扩展域3
    public String cancelOrRefund;              //
}
