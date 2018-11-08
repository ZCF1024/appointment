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

    @Override
    public List<User> findAllByClazz(String clazz){
        return this.userRepository.findByClazz(clazz);
    }

    @Override
    public Integer add(User user) {
        return userRepository.save(user) == null ? 0 : 1;
    }

    @Override
    public Integer add(List<User> users) {
        List<User> result = userRepository.saveAll(users);
        return result == null ? 0 : result.size();
    }

}
