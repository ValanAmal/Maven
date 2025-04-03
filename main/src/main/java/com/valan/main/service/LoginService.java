package com.valan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valan.main.domain.Login;
import com.valan.main.repository.LoginRepo;

@Service
public class LoginService {
@Autowired
private LoginRepo repo;
public Login login(String Username,String password){
    Login user1 = repo.findbyUsernameAndPassword(Username,password);
    return user1;
}
}
