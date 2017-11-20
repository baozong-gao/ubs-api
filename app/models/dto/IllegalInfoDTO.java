package models.dto;

import play.data.validation.Required;

/**
 * @Author: gaobaozong
 * @Description: 违章  用于查询
 * @Date: Created in 2017/11/13 - 11:03
 * @Version: V1.0
 */
public class IllegalInfoDTO {

    @Required(message = "车牌号必输")
    public String carNumber;                //车牌号
    @Required(message = "用户id必输")
    public String userId;                   //登入用户id
}
