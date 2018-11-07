package com.zut.trpplus.service;

import com.zut.trpplus.dao.domain.AppointmentView;

import java.util.List;

/**
 * @Author zcf
 * @Create 2018/11/1 19:55
 * @Desc
 */
public interface AppointmentViewService {

    List<AppointmentView> findAllByAppState(Integer state);

    AppointmentView findByUserId(String userId);

}