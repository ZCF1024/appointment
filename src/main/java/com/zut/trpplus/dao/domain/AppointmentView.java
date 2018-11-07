package com.zut.trpplus.dao.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author zcf
 * @Create 2018/11/1 18:20
 * @Desc 用于显示活动信息的实体
 */
@Entity(name = "appointment_view")
public class AppointmentView {

    @Id
    private Long appId; // 活动ID

    private String userId; // 发起人ID

    private String userName; // 发起人姓名

    private Integer appState; // 预约状态

    private String topic; // 活动主题

    private String createTime; // 发起时间

    private Boolean neededPassword;// 是否需要密码

    private Boolean shareable;     // 是否可分享

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAppState() {
        return appState;
    }

    public void setAppState(Integer appState) {
        this.appState = appState;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

}