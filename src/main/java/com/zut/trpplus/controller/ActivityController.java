package com.zut.trpplus.controller;

import com.zut.trpplus.dao.domain.Activity;
import com.zut.trpplus.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ActivityController {

    @Autowired
    private ActivityService activityService;

}
