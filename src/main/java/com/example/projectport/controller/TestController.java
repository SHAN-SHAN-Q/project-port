package com.example.projectport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * @Description
 * @ClassName TestController
 * @Author 山山大魔王
 * @Date 2022/6/19 22:52
 * @Version 1.0
 */
@Controller
public class TestController {
    @GetMapping("/199020217")
    @ResponseBody
    public String huangyishan(){
        return "黄意山";
    }

    @GetMapping("/199")
    public String huang(){
        return "199020217";
    }

    @GetMapping("/199020217mv")
    public ModelAndView mv(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("huangyishan");
        modelAndView.addObject("object","shanshan");
        return modelAndView;
    }
}
