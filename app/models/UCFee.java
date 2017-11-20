package models;

import play.db.jpa.GenericModel;

import javax.persistence.*;

/**
 * @Author: gaobaozong
 * @Description: 费率
 * @Date: Created in 2017/11/20 - 11:00
 * @Version: V1.0
 */
@IdClass(UCFeePK.class)
@Entity
@Table(name="UC_FEE")
public class UCFee extends GenericModel{
    @Id
    @Column(name = "USER_TYPE")
    public String userType;                      //用户类型-0-系统用户 1-机构 2-代理商 3-商户  9-超管
    @Id
    @Column(name = "USER_CODE")
    public String userCode;                      //用户号
    @Id
    @Column(name = "CATEGORY")
    public String category;                      //产品类型
    @Id
    @Column(name = "CATEGORY_ID")
    public String categoryId;                    //产品ID
    @Id
    @Column(name = "FEE_TYPE")
    public String feeType;                       //费率类型- 默认费率

    @Column(name = "FEE_MODE")
    public String feeMode;                       //费率
    @Column(name = "FEE_DESC")
    public String feeDesc;                       //费率描述
    @Column(name = "STATUS")
    public String status;                        //状态
    @Column(name = "PERCENT_FLAG")
    public String percentFlag;                   //是否百分比, 默认N
    @Column(name = "CREATE_USER")
    public String createUser;                    //创建用户
    @Column(name = "CREATE_TIME")
    public String createTime;                    //创建时间
    @Column(name = "CREATE_SOURCE")
    public String createSource;                  //来源
    @Column(name = "MODIFY_USER")
    public String modifyUser;                    //更新用户
    @Column(name = "MODIFY_TIME")
    public String modifyTime;                    //更新时间
    @Column(name = "MODIFY_SOURCE")
    public String modifySource;                  //来源
    @Column(name = "LOCKED_VERSION")
    public String lockedVersion;                 //版本
    @Column(name = "EXTEND1")
    public String extend1;                       //
    @Column(name = "EXTEND2")
    public String extend2;                       //
}
