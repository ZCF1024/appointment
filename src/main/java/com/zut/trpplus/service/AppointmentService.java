package com.zut.trpplus.service;

import com.zut.trpplus.dao.domain.Appointment;

import java.util.List;

public interface AppointmentService {

    Appointment getOne(Long appId);

    int create(Appointment appointment);

    List<Appointment> findAllByAppState(Integer appState);

    List<Appointment> findAll();

}
