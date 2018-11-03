package com.zut.trpplus.service.Impl;

import com.zut.trpplus.dao.repository.UserRepository;
import com.zut.trpplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


}
