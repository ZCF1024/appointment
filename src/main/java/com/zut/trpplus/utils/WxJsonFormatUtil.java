package com.zut.trpplus.utils;

import java.util.Map;

/**
 * @Author: hanyunfei
 * @Description:
 * @Date: 2017/10/12
 * @Modified By:
 */
public class WxJsonFormatUtil {

    public static Map<String, Object> handleMsg(String json) {
        Map<String, Object> map = JsonUtil.JsonToMap(json);
        if (!map.containsKey("errcode")) {
            AccessTokenUtil.getAccessToken();
            map.put("errcode", "0");
        }
        return map;
    }
}
