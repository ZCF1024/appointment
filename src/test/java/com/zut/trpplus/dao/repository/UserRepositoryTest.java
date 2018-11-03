package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        User user = userRepository.findByClazz("161");
        System.out.println(user.toString());
    }

    /**
     * 测试findByUserId方法
     * 根据userID查出一个用户User然后调用toString方法
     */
    @Test
    public void findByUserId() {
        User user = userRepository.findByUserId("abcdef");
        System.out.println(user.toString());
    }

}