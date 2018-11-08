package com.zut.trpplus.controller;

import com.zut.trpplus.dao.domain.User;
import com.zut.trpplus.service.UserService;
import com.zut.trpplus.utils.Result;
import com.zut.trpplus.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public Result add(@RequestBody User user){
        return ResultUtil.success(userService.add(user));
    }

    /**
     * 查找班级所有学生
     * @param clazz 班级
     * @return
     */
    @GetMapping("get_by_class")
    public Result getByClazz(String clazz){
        return ResultUtil.success(userService.findAllByClazz(clazz));
    }

}
