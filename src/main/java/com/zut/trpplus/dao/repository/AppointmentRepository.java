package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    /**
     * 通过发起人id查找活动
     * @param sponsorId 发起人ID
     * @return 返回一个Appointment对象
     */
    Appointment findBySponsorId(String sponsorId);

    List<Appointment> findAllByAppState(Integer appState);

}
