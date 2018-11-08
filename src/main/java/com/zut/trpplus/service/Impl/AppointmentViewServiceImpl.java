package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.domain.AppointmentView;
import com.zut.trpplus.dao.repository.AppointmentViewRepository;
import com.zut.trpplus.service.AppointmentViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zcf
 * @Create 2018/11/1 19:56
 * @Desc
 */
@Service
public class AppointmentViewServiceImpl implements AppointmentViewService {

    @Autowired
    private AppointmentViewRepository appointmentViewRepository;

    @Override
    public List<AppointmentView> findAllByAppState(Integer state) {
        return this.appointmentViewRepository.findAllByAppState(state);
    }

    @Override
    public AppointmentView findBySponsorId(String sponsorId) {
        List<AppointmentView> appointmentViews = this.appointmentViewRepository.findBySponsorId(sponsorId);
        return appointmentViews == null ? null : appointmentViews.get(0);
    }
}