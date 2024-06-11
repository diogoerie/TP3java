package com.example.springboottp3s.repository;

import com.example.springboottp3s.model.Apostila;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApostilaRepository extends MongoRepository<Apostila, String> {
}
