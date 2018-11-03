package com.zut.trpplus.dao.domain.wx_message;

import java.util.Map;

/**
 * @Author: hanyunfei
 * @Description: 微信文本卡片消息Json
 * @Date: 2017年10月21日16:58:51
 * @Modified By:
 */
public class TextCardMessageJson {
    private String touser;
    private String toparty;
    private String totag;
    private String msgtype;
    private Integer agentid;
    private Map<String, String> textcard;


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

    public Map<String, String> getTextcard() {
        return textcard;
    }

    public void setTextcard(Map<String, String> textcard) {
        this.textcard = textcard;
    }

}
