package com.valan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valan.main.domain.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login,String> {
Login findbyUsernameAndPassword(String Username,String password);
}
