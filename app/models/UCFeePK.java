package models;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @Author: gaobaozong
 * @Description: 费率  主健
 * @Date: Created in 2017/11/20 - 11:14
 * @Version: V1.0
 */
public class UCFeePK implements Serializable {

    @Column(name = "USER_TYPE")
    public String userType;                      //用户类型-0-系统用户 1-机构 2-代理商 3-商户  9-超管
    @Column(name = "USER_CODE")
    public String userCode;                      //用户号
    @Column(name = "CATEGORY")
    public String category;                      //产品类型  0
    @Column(name = "CATEGORY_ID")
    public String categoryId;                    //产品ID    P001
    @Column(name = "FEE_TYPE")
    public String feeType;                       //费率类型- 默认费率  EF -- +  ,ER -- */100
}
