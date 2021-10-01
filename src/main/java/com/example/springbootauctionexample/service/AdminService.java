package com.example.springbootauctionexample.service;

import com.example.springbootauctionexample.repository.jdbc.JdbcAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminService {

    @Autowired
    private JdbcAdminRepository adminRepository;

    public List<Map<String, Object>> fetchAllAdmins() {
        return adminRepository.findAll();
    }


}
