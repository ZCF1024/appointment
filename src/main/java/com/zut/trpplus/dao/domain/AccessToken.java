package com.zut.trpplus.dao.domain;

/**
 * @Author: hanyunfei
 * @Description:
 * @Date: 2017/10/12
 * @Modified By:
 */
public class AccessToken {
    // 获取到的凭证
    private String access_token;
    // 凭证有效时间，单位：秒
    private int expires_in;

    public AccessToken() {
        access_token = null;
        expires_in = 0;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "access_token='" + access_token + '\'' +
                ", expires_in=" + expires_in +
                '}';
    }
}
