package com.zut.trpplus.utils;

import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * @Author: hanyunfei
 * @Description: Json 工具类
 * @Date: 2017/10/12
 * @Modified By:
 */
public class JsonUtil {
    /**
     * 对象转Json
     *
     * @param object
     * @return 转化后的Json字符串
     */
    public static String ObjectToJson(Object object) {
        String string = null;
        try {
            string = JSON.toJSONString(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }

    /**
     * Json字符串转Map
     *
     * @param json
     * @return 转化后的Map
     */
    public static Map<String, Object> JsonToMap(String json) {
        return JSON.parseObject(json, Map.class);
    }
}
