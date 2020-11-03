package com.zking.ssm.controller;

import com.zking.ssm.model.User;
import com.zking.ssm.utils.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @ModelAttribute
    public void init(Model model){
        User user = new User();
        model.addAttribute("user",user);
        model.addAttribute("sexList",new String[]{"男","女"});
        model.addAttribute("jobList",new String[]{"吃饭","睡觉","打豆豆"});
    }

    @RequestMapping("/toReg")
    public String toReg(){
        System.out.println("reg");
        return "reg";
    }

    @RequestMapping("/reg")
    public String reg(@Validated(User.ValidateGroups.Reg.class) User user,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "reg";
        }
        return "/login";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        System.out.println("toLogin");
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JsonData login(@Validated(User.ValidateGroups.Login.class) User user, BindingResult bindingResult){
        JsonData jsonData = new JsonData();
        if(bindingResult.hasErrors()){
            //转发到web-info下的login.jsp页面
            Map<String,Object> errors = new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                errors.put(fieldError.getField().toString(),fieldError.getDefaultMessage());
            }
            jsonData.setResult(errors);
            return jsonData;
        }
        return jsonData;
    }

}
