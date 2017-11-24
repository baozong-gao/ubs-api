package controllers;

import controllers.filter.AuthController;
import controllers.filter.RequestFilter;
import models.Car;
import models.ReUserCar;
import models.dto.CarDTO;
import models.vo.CarVo;
import models.vo.ResultVo;
import org.apache.commons.lang.exception.ExceptionUtils;
import play.Logger;
import play.mvc.With;
import util.BeanUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 用户车辆
 * @Date: Created in 2017/11/10 - 15:33
 * @Version: V1.0
 */
@With({RequestFilter.class, AuthController.class})
public class CarController extends BaseController<CarDTO, Car, CarVo> {

    public static void findByUser(String userId) {
        List<CarVo> result = new ArrayList<>();
        try {
            List<Car> cars = Car.findCarByUserId(userId);
            result = BeanUtil.copyList(cars, CarVo.class);
            Optional.ofNullable(result).ifPresent(_result -> {
                _result.stream().forEach(carVo -> {
                    ReUserCar re = ReUserCar.findByCarId(carVo.id);
                    Optional.ofNullable(re).ifPresent(_re -> {
                        carVo.setBindId(_re.id);
                    });
                });
            });
        } catch (Exception e) {
            Logger.error("查询 用户车辆 异常 %s  \n %s", userId, ExceptionUtils.getStackTrace(e));
            renderJSON(ResultVo.error("查询 用户车辆 异常"));
        }
        renderJSON(ResultVo.succeed(result));
    }
}
