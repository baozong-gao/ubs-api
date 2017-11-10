package controllers;

import models.BaseModel;
import models.vo.ResultVo;
import org.apache.commons.lang.exception.ExceptionUtils;
import play.Logger;
import play.mvc.Controller;
import util.ApiException;
import util.BeanUtil;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 基础控制器
 * @Date: Created in 2017/11/10 - 11:11
 * @Version: V1.0
 */
public class BaseController<D, P extends BaseModel, V> extends Controller {

    Class<D> DClass;
    Class<P> PClass;
    Class<V> VClass;

    public BaseController() {
        Type sType = getClass().getGenericSuperclass();
        Type[] generics = ((ParameterizedType) sType).getActualTypeArguments();
        DClass = (Class<D>) (generics[0]);
        PClass = (Class<P>) (generics[1]);
        VClass = (Class<V>) (generics[2]);
    }


    /**
     * @Author: gaobaozong
     * @Description: 查询
     * @Date: Created in 2017/9/23 - 14:58
     * @param:
     * @return:
     */
    public void seach(String body) throws ApiException {
        List<V> result = new ArrayList<>();
        try {
            D dto = BeanUtil.jsonToBean(body, DClass, "yyyy-MM-dd");
            BeanUtil.checkBody(dto, validation);
            List<P> list = PClass.newInstance().findByDTO(dto);
            result = BeanUtil.copyList(list, VClass);
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            Logger.error("查询 异常 %s  \n %s", body, ExceptionUtils.getStackTrace(e));
            renderJSON(ResultVo.error("查询 异常"));
        }
        renderJSON(ResultVo.succeed(result));
    }
}
