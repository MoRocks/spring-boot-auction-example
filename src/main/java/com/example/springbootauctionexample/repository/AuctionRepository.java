package com.example.springbootauctionexample.repository;

import java.util.List;
import java.util.Map;


public interface AuctionRepository {
    List<Map<String, Object>> findAll();
}
