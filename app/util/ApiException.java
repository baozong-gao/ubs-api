package util;

import java.util.List;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 异常处理类
 * @Date: Created in 2017/9/25 - 14:56
 * @Version: V1.0
 */
public class ApiException extends Exception{

    private String errorMessage = "";

    public ApiException(String string) {
        super(string);
    }

    public ApiException(List<String> errors){
        super("");
        StringBuilder sb = new StringBuilder(" ");
        Optional.ofNullable(errors).ifPresent(es ->{
            es.stream().forEach(e -> sb.append(e).append(","));
        });
        errorMessage = sb.deleteCharAt(sb.length()-1).toString().trim();
    }

    @Override
    public String getMessage() {
        if("".equals(super.getMessage())){
            return errorMessage;
        }
        return super.getMessage();
    }
}
