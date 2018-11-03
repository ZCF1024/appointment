package com.zut.trpplus.dao.domain.wx_message;

import java.util.List;
import java.util.Map;

/**
 * @Author: hanyunfei
 * @Description: 微信新闻消息Json
 * @Date: 22017年11月12日14:34:05
 * @Modified By:
 */
public class NewsMessageJson {
    private String touser;
    private String toparty;
    private String totag;
    private String msgtype;
    private Integer agentid;
    private Map<String, List<Map<String, String>>> news;


    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getToparty() {
        return toparty;
    }

    public void setToparty(String toparty) {
        this.toparty = toparty;
    }

    public String getTotag() {
        return totag;
    }

    public void setTotag(String totag) {
        this.totag = totag;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public Map<String, List<Map<String, String>>> getNews() {
        return news;
    }

    public void setNews(Map<String, List<Map<String, String>>> news) {
        this.news = news;
    }
}
