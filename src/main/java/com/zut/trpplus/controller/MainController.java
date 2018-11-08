package com.zut.trpplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    /**
     * 跳转到首页
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 跳转到预约大厅
     * @return
     */
    @GetMapping("hall")
    public String hall(){
        return "hall";
    }

    /**
     * 跳转到创建页
     * @return
     */
    @GetMapping("oncreate")
    public String oncreate(){
        return "create";
    }

}
