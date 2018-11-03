package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.Appointment;

import com.zut.trpplus.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author xiumu
 * @Date 2018/10/28 15:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentRepositoryTest {

    @Autowired
    private AppointmentRepository appointmentRepository;

    /**
     * 测试AppointmentRepository保存一条数据
     */
    @Test
    public void testSave(){
        Appointment appointment = new Appointment();
        appointment.setUser_id("abcdef");
        appointment.setAppState(0);
        appointment.setPeoLimit(100);
        appointment.setShareable(false);
        String  date =DateUtil.DateToString();
        System.out.println(date);
        appointment.setCreateTime(date);
        appointment.setTopic("第一次保存测试");
        appointment.setNeededPassword(false);
        appointmentRepository.save(appointment);
    }

    /**
     * 测试findByUser_id(userID)方法
     * （测试失败）
     */
    @Test
    public void findOneTest(){
        Appointment appointment = appointmentRepository.findByUserId("abcdef");
        appointment.toString();
    }

    /**
     * 测试findByCreateTime(createTime)方法
     * （测试失败）
     */
    @Test
    public void findByCreateTimeTest(){
        Appointment appointment = appointmentRepository.findByCreateTime("2018年10月28日 15:58:01");
        appointment.toString();
    }

}