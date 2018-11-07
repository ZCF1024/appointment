package com.zut.trpplus.service;

import com.zut.trpplus.dao.domain.Appointment;

import java.util.List;

public interface AppointmentService {

    int create(Appointment appointment);

    List<Appointment> findAll();

}
