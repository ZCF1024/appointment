package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.domain.Appointment;
import com.zut.trpplus.dao.repository.AppointmentRepository;
import com.zut.trpplus.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Appointment getOne(Long appId) {
        return appointmentRepository.getOne(appId);
    }

    @Override
    public int create(Appointment appointment) {
        return appointmentRepository.save(appointment) == null ? 0 : 1;
    }

    @Override
    public List<Appointment> findAllByAppState(Integer appState) {
        return this.appointmentRepository.findAllByAppState(appState);
    }

    @Override
    public List<Appointment> findAll() {
        return this.appointmentRepository.findAll();
    }

}
