package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

    /**
     * 通过班级查询一个用户
     * @param clazz 班级
     * @return  返回一个User对象
     */
    User findByClazz(String clazz);

    /**
     * 通过userId查询用户
     * @param userId 用户ID
     * @return 返回一个User对象
     */
    User findByUserId(String userId);


}
