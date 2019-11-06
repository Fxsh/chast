package com.feng.chast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by Mr.Feng
 * I am just a Crazy People who like experience!!!!!
 * 2019/11/6  14:32
 **/
@Controller
public class HelloSpringController {
//    加模快的 原因是 Controller 转递的 值 要放在 返回的 模快
    @RequestMapping("/")
    public String ok1(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
//        这个模快 为中心，这个Thethels 从 这个模块拿 值.
        return "hello";
    }
}
