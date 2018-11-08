package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.AppointmentView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author zcf
 * @Create 2018/11/1 19:44
 * @Desc
 */
public interface AppointmentViewRepository extends JpaRepository<AppointmentView, Long> {

    List<AppointmentView> findAllByAppState(Integer state);

    List<AppointmentView> findBySponsorId(String sponsorId);

}