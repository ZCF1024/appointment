package com.zut.trpplus.controller;

import com.zut.trpplus.dao.domain.Activity;
import com.zut.trpplus.dao.domain.Appointment;
import com.zut.trpplus.service.ActivityService;
import com.zut.trpplus.service.AppointmentService;
import com.zut.trpplus.utils.Result;
import com.zut.trpplus.utils.ResultEnum;
import com.zut.trpplus.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("activity")
@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private AppointmentService appointmentService;

    /**
     * 加入预约
     * @param userId 成员Id
     * @param appId 预约活动Id
     * @return
     */
    @GetMapping("join")
    public Result join(String userId, Long appId){
        Appointment app = appointmentService.getOne(appId);
        if(app == null){
            return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(), "预约活动不存在");
        }
        Integer curPeo = activityService.getActorSumByAppId(appId);
        if(curPeo >= app.getPeoLimit()){
            return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(), "预约人数已满");
        }
        return ResultUtil.success(activityService.join(userId, appId));
    }

}
