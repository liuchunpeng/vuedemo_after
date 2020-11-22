package com.example.vuedemo.controller;

import com.example.vuedemo.dao.UserDao;
import com.example.vuedemo.entities.User;
import com.example.vuedemo.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SignInController {

    @Autowired
    private UserDaoService userDaoService;

    @PostMapping("/signIn")
    public Map signIn(Map<String,Object> params){
        Map<String,String> result =new HashMap<String, String>();
        String username =(String) params.get("username");
        String password =(String) params.get("password");
        User user = userDaoService.findByUserName(username);
        if (!ObjectUtils.isEmpty(user) && !StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
            if (username.equals(user.getUserName()) && password.equals(user.getPassWord())){

                result.put("code","0");
                result.put("data",username);
                return result;
            }
        }

        result.put("code","1");
        result.put("msg","用户名或密码错误");
        return result;
    }
    @GetMapping("/signOut")
    public String signOut(){
        return "redirect:/login";
    }
}
