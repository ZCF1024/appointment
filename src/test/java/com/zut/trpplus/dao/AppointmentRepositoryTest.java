package com.zut.trpplus.dao;

import com.zut.trpplus.dao.domain.Appointment;

import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.dao.repository.AppointmentRepository;
import com.zut.trpplus.dao.repository.UserRepository;
import com.zut.trpplus.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @Author xiumu
 * @Date 2018/10/28 15:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentRepositoryTest {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void generat(){

        List<User> users = this.userRepository.findByClazzLike("软件16%");
        String[] names = {"郭起", "刘怿民", "徐子亮", "朱才富"};
        for(int i = 0; i< users.size(); i++){
            User user = users.get(i);
            for(int j = 0; j < 4; j++){
                if(user.getName().equals(names[j])){
                    Appointment appointment = new Appointment();
                    appointment.setSponsorId(user.getUserId());
                    appointment.setAppState(j % 2 + 1);
                    appointment.setPeoLimit(10);
                    appointment.setWinners(3);
                    appointment.setTopic("预约" + (j + 1));
                    appointment.setDes("赶紧加入吧");
                    Date date = new Date();
                    appointment.setCreateTime(DateUtil.getFormatDate(date));
                    appointment.setDeadLine(DateUtil.addHour(date, 2));
                    appointment.setOpenTime(DateUtil.addHour(date, 2));
                    appointment.setUpdateTime(DateUtil.getFormatDate(date));
                    appointment.setShareable(true);
                    appointment.setNeededPassword(false);
                    appointmentRepository.save(appointment);
                }
            }

        }

    }

    @Test
    public void update(){

        List<Appointment> appointments = this.appointmentRepository.findAll();
        for(Appointment appointment : appointments){
            appointment.setCreateTime(DateUtil.getTimeStamp());
            appointment.setUpdateTime(DateUtil.getTimeStamp());
        }
        this.appointmentRepository.saveAll(appointments);
    }

}