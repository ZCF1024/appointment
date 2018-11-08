package com.zut.trpplus.service;

import com.zut.trpplus.dao.domain.User;

import java.util.List;

public interface UserService {

    Integer add(User user);

    Integer add(List<User> users);

    List<User> findAllByClazz(String clazz);
}
