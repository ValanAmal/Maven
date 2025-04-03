package com.valan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.valan.main.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginCtrl {
@Autowired
private LoginService Service;
@GetMapping("/")
public String showloginpage() {
    return "login";
}
@PostMapping("/login")
public String proceslogin(@RequestParam String Username,@RequestParam String password,Model mod) {
    //TODO: process POST request
    Login 
    return entity;
}


}
