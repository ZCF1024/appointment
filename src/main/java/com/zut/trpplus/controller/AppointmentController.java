package com.zut.trpplus.controller;

import com.zut.trpplus.dao.domain.Appointment;
import com.zut.trpplus.service.AppointmentService;
import com.zut.trpplus.utils.Result;
import com.zut.trpplus.utils.ResultEnum;
import com.zut.trpplus.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("app")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("create")
    private Result create(@RequestBody Appointment appointment){
        if(this.appointmentService.create(appointment) == 1){
            return ResultUtil.success();
        }
        return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(), "系统异常");
    }

}
