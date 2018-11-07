package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.repository.ActivityRepository;
import com.zut.trpplus.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zcf
 * @Create 2018/11/1 19:55
 * @Desc
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

}