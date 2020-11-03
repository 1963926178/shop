package com.zking.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String toIndex(){
        System.out.println("index");
        return "index";
    }

    @RequestMapping("/sys/i18n")
    public String i18n(String local, HttpSession session){
        if("zh".equals(local)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }
        else{
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.US);
        }
        return "index";
    }


}
