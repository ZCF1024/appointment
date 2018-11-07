package com.zut.trpplus.controller;

import com.zut.trpplus.service.AppointmentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppointmentViewController {

    @Autowired
    private AppointmentViewService appointmentViewService;

}
