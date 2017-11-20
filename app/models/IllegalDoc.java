package models;

import models.dto.IllegalDocDTO;

import javax.persistence.*;

/**
 * @Author: gaobaozong
 * @Description: 附件表
 * @Date: Created in 2017/11/20 - 14:35
 * @Version: V1.0
 */
@Entity
@Table(name="WZ_INFO_DOC")
public class IllegalDoc extends BaseModel<IllegalDocDTO>{
    @Id
    @Column(name = "DOC_ID")
    public String docId;                 //id
    @Column(name = "DOC_TYPE")
    public String docType;               //文档类型
    @Column(name = "WZ_ID")
    public String wzId;                  //违章id
    @Column(name = "FILE_NAME")
    public String fileName;              //表单名称
    @Column(name = "OPTION_ABLE")
    public String optionAble;            //为1时表示可选填，其他必填
    @Column(name = "REQ_LENGTH")
    public String reqLength;             //长度
    @Column(name = "STATUS")
    public String status;                //文档状态0:未处理，1:已添加
    @Column(name = "DOC_LOCATION")
    public String docLocation;           //文档地址
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
    public  Integer lockVersion;           //乐观锁
    @Column(name = "CREATE_TIME")
    public String createTime;            //创建日期
    @Column(name = "UPDATE_TIME")
    public String updateTime;            //更新日期
}
