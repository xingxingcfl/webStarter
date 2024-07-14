package com.demo.web.controller;

import com.demo.web.ponitCut.Log;
import com.demo.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/account",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Log
    @GetMapping("/login")
    public String login(){
        return loginService.login();
    }

    @GetMapping("/logOut")
    public String logOut(){
        return loginService.logOut();
    }
}
