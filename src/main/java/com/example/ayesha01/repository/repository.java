package com.example.ayesha01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ayesha01.domain.domain;

@Repository
public interface repository extends JpaRepository<domain,String>
{
domain findbyUsernameAndPassword(String username, String password);
}