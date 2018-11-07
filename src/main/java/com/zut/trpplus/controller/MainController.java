package com.zut.trpplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("hall")
    public String hall(){
        return "hall";
    }

    @GetMapping("oncreate")
    public String oncreate(){
        return "create";
    }

}
