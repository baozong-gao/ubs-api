package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 用户产品   展示
 * @Date: Created in 2017/11/10 - 15:16
 * @Version: V1.0
 */
public class UserProdInfoVo {

    public String id;                             //ID
    public String userId;                         //用户ID
    public String prodId;                         //产品ID
    public String prodName;                       //产品名称
    public String openStatus;                     //开通状态
    public String openMethod;                     //开通方式
    public String openSource;                     //开通源

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
    }

    public String getOpenMethod() {
        return openMethod;
    }

    public void setOpenMethod(String openMethod) {
        this.openMethod = openMethod;
    }

    public String getOpenSource() {
        return openSource;
    }

    public void setOpenSource(String openSource) {
        this.openSource = openSource;
    }
}
