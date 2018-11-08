package com.zut.trpplus.dao;

import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.dao.repository.UserRepository;
import com.zut.trpplus.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 测试UserRepository的方法
 * @Author xiumu
 * @Date 2018/10/28 14:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    /**
     * 测试findByClazz方法
     * 根据班级查出一个用户User然后调用toString方法
     */
    @Test
    public void findByClazz() {

        List<User> users = userRepository.findByClazz("软件162");
        for(User user : users){
            System.out.println("id: " + user.getUserId() + " name: " + user.getName());
        }

    }

    @Test
    public void findAll(){
        List<User> users = userRepository.findAll();
        for(User user : users){
            user.setCreateTime(DateUtil.getTimeStamp());
            user.setUpdateTime(DateUtil.getTimeStamp());
        }
        userRepository.saveAll(users);
    }

}