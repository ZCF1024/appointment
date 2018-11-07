package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.dao.repository.UserRepository;
import com.zut.trpplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private List<User> findAll(){
        return this.userRepository.findByClazz("软件162");
    }


}
