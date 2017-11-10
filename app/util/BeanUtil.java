package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import play.Logger;
import play.data.validation.Validation;

import java.beans.PropertyDescriptor;
import java.util.*;

/**
 * @Author: gaobaozong
 * @Description: 对象工具类
 * @Date: Created in 2017/9/25 - 14:44
 * @Version: V1.0
 */
public class BeanUtil {

    public static <T> T jsonToBean(String json, Class<T> c) throws ApiException {
        T t = null;
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
            t = gson.fromJson(json, c);
        } catch (Exception e) {
            Logger.error("请求body【%s】 转换pojo【%s】 异常    %s", json, c.getName(),
                    ExceptionUtils.getStackTrace(e));
        } finally {
            Optional.ofNullable(t).orElseThrow(() -> new ApiException("请求不是合法的JSON"));
        }
        return t;
    }

    public static <T> T jsonToBean(String json, Class<T> c, String dateFormat) throws ApiException {
        T t = null;
        try {
            Gson gson = new GsonBuilder().setDateFormat(dateFormat).create();
            t = gson.fromJson(json, c);
        } catch (Exception e) {
            Logger.error("请求body【%s】 转换pojo【%s】 异常    %s", json, c.getName(),
                    ExceptionUtils.getStackTrace(e));
        } finally {
            Optional.ofNullable(t).orElseThrow(() -> new ApiException("请求不是合法的JSON"));
        }
        return t;
    }

    /**
     * 请求参数合法性检查测
     */
    public static void checkBody(Object t, Validation validation) throws ApiException {
        validation.valid(t);
        if (validation.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            validation.errors().stream().limit(validation.errors().size() - 1)
                    .forEach(error -> errorList.add(error.message()));
            throw new ApiException(errorList);
        }
    }

    public static void copy(Object src, Object desc) throws Exception {
        PropertyDescriptor origDescriptors[] = PropertyUtils.getPropertyDescriptors(src);
        for (int i = 0; i < origDescriptors.length; i++) {
            String name = origDescriptors[i].getName();
            if ("class".equals(name)) {
                continue;
            }
            if (PropertyUtils.isReadable(src, name) && PropertyUtils.isWriteable(desc, name)) {
                try {
                    Object value = PropertyUtils.getSimpleProperty(src, name);
                    if (value != null) {
                        BeanUtils.copyProperty(desc, name, value);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static <T> List copyList(List src, Class<T> c) {
        List<T> desc = new ArrayList<>();
        src.stream().forEach(o -> {
            try {
                T t = c.newInstance();
                copy(o, t);
                desc.add(t);
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        return desc;
    }

    public static Map<String, Object> beanFiledValue(Object src) throws Exception {
        Map<String, Object> fieldValue = new HashMap<>();
        PropertyDescriptor origDescriptors[] = PropertyUtils.getPropertyDescriptors(src);
        for (int i = 0; i < origDescriptors.length; i++) {
            String name = origDescriptors[i].getName();
            if ("class".equals(name)) {
                continue;
            }
            try {
                Object value = PropertyUtils.getSimpleProperty(src, name);
                if (value != null) {
                    fieldValue.put(name, value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return fieldValue;
    }


}
