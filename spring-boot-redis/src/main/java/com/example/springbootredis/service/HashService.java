package com.example.springbootredis.service;

import com.example.springbootredis.model.Hash;

public interface HashService {
    public Hash save(String string);
    // A list all string call will have been appreciated
    public Hash findByString(String string);
}
