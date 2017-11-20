package models;

import models.dto.OrderDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 订单
 * @Date: Created in 2017/11/20 - 13:35
 * @Version: V1.0
 */
@Entity
@Table(name = "QRC_PAYMENT_RECORD")
public class Order extends BaseModel<OrderDTO> {
    @Id
    @Column(name = "ID")
    public String id;                          //ID
    @Column(name = "INST_ID")
    public String instId;                      //机构号
    @Column(name = "MID")
    public String mid;                         //商户号
    @Column(name = "TID")
    public String tid;                         //终端号
    @Column(name = "ORDER_ID")
    public String orderId;                     //订单号
    @Column(name = "ORDER_DATE")
    public String orderDate;                   //订单日期
    @Column(name = "ORDER_TIME")
    public String orderTime;                   //订单时间
    @Column(name = "ORDER_TYPE")
    public String orderType;                   //订单类型
    @Column(name = "PLATFORM_SEQ")
    public String platformSeq;                 //流水号
    @Column(name = "QRC_CHANNEL")
    public String qrcChannel;                  //二维码渠道号
    @Column(name = "QRC_CHANNEL_FLAG")
    public String qrcChannelFlag;              //渠道标志
    @Column(name = "QRC_CHANNEL_MID")
    public String qrcChannelMid;               //二维码渠道商户号
    @Column(name = "QRC_CHANNEL_TID")
    public String qrcChannelTid;               //二维码渠道终端号
    @Column(name = "QRC_PAYMENT_STATUS")
    public String qrcPaymentStatus;            //二维码支付状态
    @Column(name = "CARD_NO")
    public String cardNo;                      //卡号
    @Column(name = "VIRTUAL_ACCT_NO")
    public String virtualAcctNo;               //虚拟用户标志
    @Column(name = "TRADE_AMOUNT")
    public String tradeAmount;                 //交易金额
    @Column(name = "FEE_AMOUNT")
    public String feeAmount;                   //手续费金额
    @Column(name = "NET_AMOUNT")
    public String netAmount;                   //清算净额
    @Column(name = "BENIFIT_AMOUNT")
    public String benifitAmount;               //分润金额
    @Column(name = "CREDIT_DEBIT_FLAG")
    public String creditDebitFlag;             //借贷标志
    @Column(name = "BIPI_SEND_MODE")
    public String bipiSendMode;                //bipi发送方式
    @Column(name = "BIPI_SEND_ID")
    public String bipiSendId;                  //bipi发送id
    @Column(name = "BIPI_SEND_DATE")
    public String bipiSendDate;                //bipi发送日期
    @Column(name = "BIPI_SEND_TIME")
    public String bipiSendTime;                //bipi发送时间
    @Column(name = "BIPI_STATUS")
    public String bipiStatus;                  //bipi状态
    @Column(name = "BIPI_RESP_CODE")
    public String bipiRespCode;                //bipi应答码
    @Column(name = "BIPI_RESP_MESSAGE")
    public String bipiRespMessage;             //bipi应答消息
    @Column(name = "BIPI_TRACE_ID")
    public String bipiTraceId;                 //bipi订单跟踪号
    @Column(name = "BIPI_RESP_DATE")
    public String bipiRespDate;                //bipi返回日期
    @Column(name = "BIPI_RESP_TIME")
    public String bipiRespTime;                //bipi返回时间
    @Column(name = "BIPI_RESP_RESV1")
    public String bipiRespResv1;               //bipi应答扩展域1
    @Column(name = "BIPI_RESP_RESV2")
    public String bipiRespResv2;               //bipi应答扩展域2
    @Column(name = "CHECK_FLAG")
    public String checkFlag;                   //对账标志
    @Column(name = "CLEAR_DATE")
    public String clearDate;                   //清算日期
    @Column(name = "PRINT_FLAG")
    public String printFlag;                   //小票打印标志
    @Column(name = "REMARK")
    public String remark;                      //备注
    @Column(name = "PAYMENT_RESV1")
    public String paymentResv1;                //支付扩展域1
    @Column(name = "PAYMENT_RESV2")
    public String paymentResv2;                //支付扩展域2
    @Column(name = "PAYMENT_RESV3")
    public String paymentResv3;                //支付扩展域3
    @Column(name = "CANCEL_OR_REFUND")
    public String cancelOrRefund;              //

    public static List<Order> findByOrderNo(String id) {
        return Order.find("orderId = ?", id).fetch();
    }
}
