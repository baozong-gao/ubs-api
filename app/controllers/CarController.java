package controllers;

import models.Car;
import models.dto.CarDTO;
import models.vo.CarVo;
import util.BeanUtil;

import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 用户车辆
 * @Date: Created in 2017/11/10 - 15:33
 * @Version: V1.0
 */
public class CarController extends BaseController<CarDTO, Car, CarVo> {


    public static void findByUser(String userId) {
        List<Car> cars = Car.findCarByUserId(userId);
        List<CarVo> result = BeanUtil.copyList(cars, CarVo.class);
        renderJSON(result);
    }
}
