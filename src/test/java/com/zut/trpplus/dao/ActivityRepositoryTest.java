package com.zut.trpplus.dao;

import com.zut.trpplus.dao.domain.Activity;
import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.dao.repository.ActivityRepository;
import com.zut.trpplus.dao.repository.UserRepository;
import com.zut.trpplus.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityRepositoryTest {

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void generat(){

        List<User> users = this.userRepository.findByClazzLike("软件16%");
        String[] names = {"郭起", "刘怿民", "徐子亮", "朱才富"};
        for(int i = 0; i<40; i++){
            User user = users.get(i);
            for(int j = 0; j < 4; j++){
                if(!user.getName().equals(names[j])){
                    Activity activity = new Activity();
                    activity.setAppId((long) (i % 4 + 1));
                    activity.setUserId(user.getUserId());
                    Date date = new Date();
                    activity.setCreateTime(DateUtil.getFormatDate(date));
                    activity.setUpdateTime(DateUtil.getFormatDate(date));
                    activity.setDeleted(false);
                    activityRepository.save(activity);
                }
            }
        }

    }

    @Test
    public void update(){

        List<Activity> activities = this.activityRepository.findAll();
        for(Activity activity : activities){
            activity.setCreateTime(DateUtil.getTimeStamp());
            activity.setUpdateTime(DateUtil.getTimeStamp());
        }
        this.activityRepository.saveAll(activities);
    }

}
