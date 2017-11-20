package controllers;

import models.Order;
import models.dto.OrderDTO;
import models.vo.OrderVo;
import models.vo.ResultVo;
import org.apache.commons.lang.exception.ExceptionUtils;
import play.Logger;
import util.BeanUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 订单
 * @Date: Created in 2017/11/20 - 13:39
 * @Version: V1.0
 */
public class OrderController extends BaseController<OrderDTO, Order,OrderVo>{

    public static void find(String orderId) {
        List<OrderVo> result = new ArrayList<>();
        try {
            List<Order> cars = Order.findByOrderNo(orderId);
            result = BeanUtil.copyList(cars, OrderVo.class);
        } catch (Exception e) {
            Logger.error("查询 订单 异常 %s  \n %s", orderId, ExceptionUtils.getStackTrace(e));
            renderJSON(ResultVo.error("查询 订单 异常"));
        }
        renderJSON(ResultVo.succeed(result));
    }
}
