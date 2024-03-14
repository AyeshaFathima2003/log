package com.example.ayesha01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ayesha01.domain.domain;
import com.example.ayesha01.repository.repository;
@Service
public class service {
    @Autowired

    private repository rep;
    public domain log(String username, String password)
    {
        domain use=rep.findbyUsernameAndPassword(username, password);
        return use;
    }
    
    
    

}
