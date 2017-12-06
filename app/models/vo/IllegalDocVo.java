package models.vo;

/**
 * @Author: gaobaozong
 * @Description: 违章 文档
 * @Date: Created in 2017/11/20 - 14:41
 * @Version: V1.0
 */
public class IllegalDocVo {

    public String docId;                 //id
    public String docType;               //文档类型
    public String wzId;                  //违章id
    public String fileName;              //表单名称
    public String optionAble;            //为1时表示可选填，其他必填
    public String reqLength;             //长度
    public String status;                //文档状态0:未处理，1:已添加
    public byte [] docLocation;           //文档地址
    public String ext1;                  //扩展域1
    public String ext2;                  //扩展域2
    public String ext3;                  //扩展域3
    public String ext4;                  //扩展域4
    public String ext5;                  //扩展域5
    public String ext6;                  //扩展域6
    public String modifySource;          //更新源
    public String modifyUser;            //修改账户

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getWzId() {
        return wzId;
    }

    public void setWzId(String wzId) {
        this.wzId = wzId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOptionAble() {
        return optionAble;
    }

    public void setOptionAble(String optionAble) {
        this.optionAble = optionAble;
    }

    public String getReqLength() {
        return reqLength;
    }

    public void setReqLength(String reqLength) {
        this.reqLength = reqLength;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getDocLocation() {
        return docLocation;
    }

    public void setDocLocation(byte[] docLocation) {
        this.docLocation = docLocation;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public String getExt6() {
        return ext6;
    }

    public void setExt6(String ext6) {
        this.ext6 = ext6;
    }

    public String getModifySource() {
        return modifySource;
    }

    public void setModifySource(String modifySource) {
        this.modifySource = modifySource;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
}
