package com.spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/", "/homepage"}) // 定义在类级别
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }

}
