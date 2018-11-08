package com.zut.trpplus.controller;

import com.zut.trpplus.dao.domain.Appointment;
import com.zut.trpplus.service.AppointmentService;
import com.zut.trpplus.utils.Result;
import com.zut.trpplus.utils.ResultEnum;
import com.zut.trpplus.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    /**
     * 发起预约
     * @param appointment 预约的详情（Json）
     * @return
     */
    @GetMapping("create")
    public Result create(@RequestBody Appointment appointment){
        if(this.appointmentService.create(appointment) == 1){
            return ResultUtil.success();
        }
        return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(), "系统异常");
    }

    /**
     * 返回所有预约活动信息
     * @return
     */
    @GetMapping("all")
    public Result test(){
        return ResultUtil.success(appointmentService.findAll());
    }

}
