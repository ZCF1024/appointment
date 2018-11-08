package com.zut.trpplus.controller;

import com.zut.trpplus.dao.domain.Appointment;
import com.zut.trpplus.dao.domain.AppointmentView;
import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.service.ActivityService;
import com.zut.trpplus.service.AppointmentViewService;
import com.zut.trpplus.service.UserService;
import com.zut.trpplus.utils.Result;
import com.zut.trpplus.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("app_view")
@RestController
public class AppointmentViewController {

    @Autowired
    private AppointmentViewService appointmentViewService;

    @Autowired
    private ActivityService activityService;

    /**
     * 通过状态（进行中/已结束等）查找预约活动
     * @param state 状态
     * @return
     */
    @GetMapping("get_by_state")
    public Result getByState(Integer state){
        return ResultUtil.success(appointmentViewService.findAllByAppState(state));
    }

    /**
     * 通过活动发起人Id查找预约活动
     * @param sponsor 发起人Id
     * @return
     */
    @GetMapping("get_by_sponsor")
    public Result getByUserId(String sponsor){
        AppointmentView app = appointmentViewService.findBySponsorId(sponsor);
        Map<String, Object> result = new HashMap<>();
        result.put("app", app);
        result.put("actors", activityService.findAllByAppId(app.getAppId()));
        return ResultUtil.success(result);
    }

}
