package com.example.springbootauctionexample.service;

import com.example.springbootauctionexample.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    public List<Map<String, Object>> fetchAllRecords(){
      return repository.findAll();
    };



}
