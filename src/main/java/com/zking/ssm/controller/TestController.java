package com.zking.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world!");
        return "hello";
    }

    @RequestMapping("test")
    public String test(){
        System.out.println("hello test!");
        return "redirect:toHello";
    }

    @RequestMapping("toHello")
    public String toHello(){
        System.out.println("hello test!");
        return "hello";
    }

    public static void main(String[] args) {
        Locale locale = Locale.JAPAN;
        System.out.println(locale);


    }


}
