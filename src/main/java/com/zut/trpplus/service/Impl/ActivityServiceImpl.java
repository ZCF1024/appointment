package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.domain.Activity;
import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.dao.repository.ActivityRepository;
import com.zut.trpplus.service.ActivityService;
import com.zut.trpplus.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zcf
 * @Create 2018/11/1 19:55
 * @Desc
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public List<Activity> findAllByAppId(Long appId) {
        return activityRepository.findAllByAppIdAndDeleted(appId, false);
    }

    @Override
    public Integer join(String userId, Long appId) {
        Activity activity = activityRepository.getOne(userId);
        if(activity == null){
            activity = new Activity();
            activity.setUserId(userId);
        }
        activity.setAppId(appId);
        activity.setDeleted(false);
        activity.setUpdateTime(DateUtil.getTimeStamp());
        return activityRepository.save(activity) == null ? 0 : 1;
    }

    @Override
    public Integer getActorSumByAppId(Long appId) {
        return activityRepository.getActorSumByAppIdAndDeleted(appId,false);
    }
}