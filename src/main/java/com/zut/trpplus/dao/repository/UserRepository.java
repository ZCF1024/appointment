package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, String> {

    /**
     * 通过班级查询一个用户
     * @param clazz 班级
     * @return  返回一个User对象
     */
    List<User> findByClazz(String clazz);

    List<User> findByClazzLike(String clazz);


}
