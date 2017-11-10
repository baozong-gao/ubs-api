package controllers.filter;

import models.vo.ResultVo;
import play.db.jpa.JPA;
import play.mvc.Before;
import play.mvc.Controller;
import util.ApiException;

import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 权限验证
 * @Date: Created in 2017/9/25 - 11:26
 * @Version: V1.0
 */
public class AuthController extends Controller {

    public static final String INS_ID_KEY = "ins_id";

    @Before
    static void checkAuth(){
        String id = params.get("id");
        String accesstoken = params.get("accesstoken");
        String sql = String.format("select SOURCE_STATUS from UBS_SOURCE_INFO where ID='%s' and SOURCE_ACCESS_TOKEN='%s'",new String[]{id,accesstoken});
        try {
            String status = JPA.em().createNativeQuery(sql).getSingleResult().toString();
            Optional.ofNullable(status)
                    .filter( s -> "N".equalsIgnoreCase(s))
                    .orElseThrow(() ->new  ApiException("授权失败"));
            flash.put(INS_ID_KEY, id);
        } catch (Exception e){
            renderJSON(ResultVo.errorAuth());
        }
    }
}
