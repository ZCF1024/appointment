package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.domain.Appointment;
import com.zut.trpplus.dao.repository.AppointmentRepository;
import com.zut.trpplus.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Author zcf
 * @Create 2018/11/1 19:50
 * @Desc
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public int create(Appointment appointment) {
        if(appointment.equals(appointmentRepository.save(appointment))){
            return 1;
        }
        return 0;
    }
}
