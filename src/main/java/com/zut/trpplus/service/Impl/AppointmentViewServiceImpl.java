package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.repository.AppointmentViewRepository;
import com.zut.trpplus.service.AppointmentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zcf
 * @Create 2018/11/1 19:56
 * @Desc
 */
@Service
public class AppointmentViewServiceImpl implements AppointmentViewService {

    @Autowired
    private AppointmentViewRepository appointmentViewRepository;

}