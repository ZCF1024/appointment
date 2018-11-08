package com.zut.trpplus.dao.repository;

import com.zut.trpplus.dao.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author zcf
 * @Create 2018/11/1 19:46
 * @Desc
 */
public interface ActivityRepository extends JpaRepository<Activity, String> {

    List<Activity> findAllByAppIdAndDeleted(Long appId, Boolean deleted);

    @Query(value = "SELECT COUNT(*) FROM activity where app_ip=?1 AND deleted=?2", nativeQuery = true)
    Integer getActorSumByAppIdAndDeleted(Long appId, Boolean deleted);
}