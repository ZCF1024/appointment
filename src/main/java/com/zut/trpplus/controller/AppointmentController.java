package com.zut.trpplus.controller;

import com.zut.trpplus.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

}
