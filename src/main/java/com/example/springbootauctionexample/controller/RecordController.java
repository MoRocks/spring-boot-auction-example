package com.example.springbootauctionexample.controller;

import com.example.springbootauctionexample.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping("/records")
    public ResponseEntity<?> greeting() {
        return ResponseEntity.ok(recordService.fetchAllRecords());
    }

}
