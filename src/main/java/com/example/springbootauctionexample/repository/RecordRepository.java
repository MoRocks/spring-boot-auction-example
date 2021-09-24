package com.example.springbootauctionexample.repository;

import java.util.List;
import java.util.Map;


public interface RecordRepository {

    List<Map<String, Object>> findAll();
}
