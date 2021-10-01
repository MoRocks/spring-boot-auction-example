package com.example.springbootauctionexample.controller;

import com.example.springbootauctionexample.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public ResponseEntity<?> getAllAdmins() {
        return ResponseEntity.ok(adminService.fetchAllAdmins());
    }

}
