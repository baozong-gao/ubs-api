package controllers.filter;

import models.vo.ResultVo;
import play.mvc.Before;
import play.mvc.Catch;
import play.mvc.Controller;
import util.ApiException;

/**
 * @Author: gaobaozong
 * @Description: 请求过滤
 * @Date: Created in 2017/9/25 - 14:21
 * @Version: V1.0
 */
public class RequestFilter extends Controller{
    @Before
    static void filter(){
        if("GET".equals(request.method)){
            return ;
        }
        if(!"application/json".equals(request.contentType)){
            renderJSON(ResultVo.error("请求类型不是JSON"));
        }
    }

    @Catch(value = ApiException.class, priority = 1)
    static void apiExceptionHeadler(ApiException e){
        renderJSON(ResultVo.error(e.getMessage()));
    }


}
