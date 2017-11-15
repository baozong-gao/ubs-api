package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.IllegalCity;
import models.dto.IllegalCityDTO;
import models.vo.IllegalCityVo;
import play.mvc.With;

/**
 * @Author: gaobaozong
 * @Description: 违章 城市
 * @Date: Created in 2017/11/13 - 13:35
 * @Version: V1.0
 */
@With({RequestFilter.class, AuthController.class})
public class IllegalCityController extends  BaseController<IllegalCityDTO, IllegalCity, IllegalCityVo>{
}
