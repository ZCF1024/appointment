package com.zut.trpplus.dao.domain;

import com.zut.trpplus.utils.DateUtil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appId;            // 活动ID

    private String sponsorId;        // 发起人ID

    /** 活动状态
     * 1-报名中， 2-待开始, 3-进行中, 4-已结束, 5-已停止
     */
    private Integer appState;

    private Integer peoLimit;      // 人数上限

    private Integer winners;       // 中奖人数

    private String topic;          // 活动主题

    private String des;            // 活动描述

    private String createTime;     // 发起时间

    private String deadLine; // 报名截止时间

    private String openTime; // 开奖时间

    private String updateTime;     // 修改时间

    private String password;       // 密码

    private Boolean neededPassword;// 是否需要密码

    private Boolean shareable;     // 是否可分享

    public Appointment() {
        this.createTime = DateUtil.getTimeStamp();
        this.shareable = true;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public Integer getAppState() {
        return appState;
    }

    public void setAppState(Integer appState) {
        this.appState = appState;
    }

    public Integer getPeoLimit() {
        return peoLimit;
    }

    public void setPeoLimit(Integer peoLimit) {
        this.peoLimit = peoLimit;
    }

    public Integer getWinners() {
        return winners;
    }

    public void setWinners(Integer winners) {
        this.winners = winners;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getNeededPassword() {
        return neededPassword;
    }

    public void setNeededPassword(Boolean neededPassword) {
        this.neededPassword = neededPassword;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appId=" + appId +
                ", user_id='" + sponsorId + '\'' +
                ", appState=" + appState +
                ", peoLimit=" + peoLimit +
                ", topic='" + topic + '\'' +
                ", des='" + des + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", eadLine=" + deadLine + '\'' +
                ", password='" + password + '\'' +
                ", neededPassword=" + neededPassword +
                ", shareable=" + shareable +
                '}';
    }

}
