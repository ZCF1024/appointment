package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    /**
     * 通过发起人id查找活动
     * @param userId 发起人ID
     * @return 返回一个Appointment对象
     */
    Appointment findByUserId(String userId);//（测试失败）

    /**
     * 通过创建时间查询活动
     * @param time 创建时间
     * @return 返回一个Appointment对象
     */
    Appointment findByCreateTime(String time);//（测试失败）
}
