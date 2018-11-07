package com.zut.trpplus.dao.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author zcf
 * @Create 2018/11/1 19:40
 * @Desc
 */
@Entity
public class Activity {

    @Id
    private String userId;  // 用户 Id

    private Integer appId; // 活动 Id

    private String createTime; // 加入时间

    private String updateTime; // 更新时间

    private Boolean deleted; // 删除标志

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}