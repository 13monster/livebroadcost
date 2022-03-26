package com.example.liveplatform.controller;

import com.example.liveplatform.mapper.userMapper;
import com.example.liveplatform.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class hello {
    @Autowired
    private userMapper user;
    @GetMapping("/hello")
    @ResponseBody
    String hello(){
        return "hello";
    }
    @GetMapping("/user")
    @ResponseBody
    List<user> findUser(){
        return user.findUser();
    }
}
