package com.zut.trpplus.service;

import com.zut.trpplus.dao.domain.Activity;

import java.util.List;

/**
 * @Author zcf
 * @Create 2018/11/1 19:55
 * @Desc
 */
public interface ActivityService {

    List<Activity> findAllByAppId(Long appId);

    Integer join(String userId, Long appId);

    Integer getActorSumByAppId(Long appId);

}