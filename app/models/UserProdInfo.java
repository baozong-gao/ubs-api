package models;

import models.dto.UserProdInfoDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: gaobaozong
 * @Description: 用户产品
 * @Date: Created in 2017/11/10 - 15:12
 * @Version: V1.0
 */
@Entity
@Table(name="UC_USER_PROD")
public class UserProdInfo extends BaseModel<UserProdInfoDTO>{

    @Id
    @Column(name="ID")
    public String id;                             //ID
    @Column(name="USER_ID")
    public String userId;                         //用户ID
    @Column(name="PROD_ID")
    public String prodId;                         //产品ID
    @Column(name="PROD_NAME")
    public String prodName;                       //产品名称
    @Column(name="OPEN_STATUS")
    public String openStatus;                     //开通状态
    @Column(name="OPEN_METHOD")
    public String openMethod;                     //开通方式
    @Column(name="OPEN_SOURCE")
    public String openSource;                     //开通源
    @Column(name="CREATE_TIME")
    public String createTime;                     //
    @Column(name="UPDATE_TIME")
    public String updateTime;                     //

}
