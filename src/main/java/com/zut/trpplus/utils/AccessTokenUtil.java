package com.zut.trpplus.utils;

import com.zut.trpplus.contans.WorkWXAPI;
import com.zut.trpplus.dao.domain.AccessToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author: hanyunfei
 * @Description:
 * @Date: 2017/10/12
 * @Modified By:
 */
public class AccessTokenUtil {

    private final static Logger logger = LoggerFactory.getLogger(AccessTokenUtil.class);

    public static AccessToken accessToken = new AccessToken();

    public static void getAccessToken() {
        try {
            String json = HttpClientUtil.get(WorkWXAPI.GET_ACCESS_TOKEN_URL);
            Map<String, Object> data = JsonUtil.JsonToMap(json);
            if (data.get("errcode").toString().equals("0")) {
                accessToken.setAccess_token(data.get("access_token").toString());
                accessToken.setExpires_in(Integer.parseInt(data.get("expires_in").toString()));
            } else {
                logger.info(data.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("获取access token 失败:" + ex.getMessage());
        }
    }

}
