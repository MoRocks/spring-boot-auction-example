package com.example.springbootauctionexample.service;

import com.example.springbootauctionexample.repository.jdbc.JdbcUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UsersService {

    @Autowired
    private JdbcUsersRepository usersRepository;

    public List<Map<String, Object>> fetchAllUsers() {
        return usersRepository.findAll();
    }


}
