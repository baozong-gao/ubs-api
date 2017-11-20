package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 订单
 * @Date: Created in 2017/11/20 - 13:39
 * @Version: V1.0
 */
public class OrderVo {
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPlatformSeq() {
        return platformSeq;
    }

    public void setPlatformSeq(String platformSeq) {
        this.platformSeq = platformSeq;
    }

    public String getQrcChannel() {
        return qrcChannel;
    }

    public void setQrcChannel(String qrcChannel) {
        this.qrcChannel = qrcChannel;
    }

    public String getQrcChannelFlag() {
        return qrcChannelFlag;
    }

    public void setQrcChannelFlag(String qrcChannelFlag) {
        this.qrcChannelFlag = qrcChannelFlag;
    }

    public String getQrcChannelMid() {
        return qrcChannelMid;
    }

    public void setQrcChannelMid(String qrcChannelMid) {
        this.qrcChannelMid = qrcChannelMid;
    }

    public String getQrcChannelTid() {
        return qrcChannelTid;
    }

    public void setQrcChannelTid(String qrcChannelTid) {
        this.qrcChannelTid = qrcChannelTid;
    }

    public String getQrcPaymentStatus() {
        return qrcPaymentStatus;
    }

    public void setQrcPaymentStatus(String qrcPaymentStatus) {
        this.qrcPaymentStatus = qrcPaymentStatus;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getVirtualAcctNo() {
        return virtualAcctNo;
    }

    public void setVirtualAcctNo(String virtualAcctNo) {
        this.virtualAcctNo = virtualAcctNo;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }

    public String getBenifitAmount() {
        return benifitAmount;
    }

    public void setBenifitAmount(String benifitAmount) {
        this.benifitAmount = benifitAmount;
    }

    public String getCreditDebitFlag() {
        return creditDebitFlag;
    }

    public void setCreditDebitFlag(String creditDebitFlag) {
        this.creditDebitFlag = creditDebitFlag;
    }

    public String getBipiSendMode() {
        return bipiSendMode;
    }

    public void setBipiSendMode(String bipiSendMode) {
        this.bipiSendMode = bipiSendMode;
    }

    public String getBipiSendId() {
        return bipiSendId;
    }

    public void setBipiSendId(String bipiSendId) {
        this.bipiSendId = bipiSendId;
    }

    public String getBipiSendDate() {
        return bipiSendDate;
    }

    public void setBipiSendDate(String bipiSendDate) {
        this.bipiSendDate = bipiSendDate;
    }

    public String getBipiSendTime() {
        return bipiSendTime;
    }

    public void setBipiSendTime(String bipiSendTime) {
        this.bipiSendTime = bipiSendTime;
    }

    public String getBipiStatus() {
        return bipiStatus;
    }

    public void setBipiStatus(String bipiStatus) {
        this.bipiStatus = bipiStatus;
    }

    public String getBipiRespCode() {
        return bipiRespCode;
    }

    public void setBipiRespCode(String bipiRespCode) {
        this.bipiRespCode = bipiRespCode;
    }

    public String getBipiRespMessage() {
        return bipiRespMessage;
    }

    public void setBipiRespMessage(String bipiRespMessage) {
        this.bipiRespMessage = bipiRespMessage;
    }

    public String getBipiTraceId() {
        return bipiTraceId;
    }

    public void setBipiTraceId(String bipiTraceId) {
        this.bipiTraceId = bipiTraceId;
    }

    public String getBipiRespDate() {
        return bipiRespDate;
    }

    public void setBipiRespDate(String bipiRespDate) {
        this.bipiRespDate = bipiRespDate;
    }

    public String getBipiRespTime() {
        return bipiRespTime;
    }

    public void setBipiRespTime(String bipiRespTime) {
        this.bipiRespTime = bipiRespTime;
    }

    public String getBipiRespResv1() {
        return bipiRespResv1;
    }

    public void setBipiRespResv1(String bipiRespResv1) {
        this.bipiRespResv1 = bipiRespResv1;
    }

    public String getBipiRespResv2() {
        return bipiRespResv2;
    }

    public void setBipiRespResv2(String bipiRespResv2) {
        this.bipiRespResv2 = bipiRespResv2;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPaymentResv1() {
        return paymentResv1;
    }

    public void setPaymentResv1(String paymentResv1) {
        this.paymentResv1 = paymentResv1;
    }

    public String getPaymentResv2() {
        return paymentResv2;
    }

    public void setPaymentResv2(String paymentResv2) {
        this.paymentResv2 = paymentResv2;
    }

    public String getPaymentResv3() {
        return paymentResv3;
    }

    public void setPaymentResv3(String paymentResv3) {
        this.paymentResv3 = paymentResv3;
    }

    public String getCancelOrRefund() {
        return cancelOrRefund;
    }

    public void setCancelOrRefund(String cancelOrRefund) {
        this.cancelOrRefund = cancelOrRefund;
    }
}
