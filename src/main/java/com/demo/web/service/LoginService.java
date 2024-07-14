package com.demo.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String login(){
        return "login request accepted";
    }

    public String logOut(){
        return "logout request accepted";
    }
}
