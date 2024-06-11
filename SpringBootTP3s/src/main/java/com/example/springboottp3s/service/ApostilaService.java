package com.example.springboottp3s.service;

import com.example.springboottp3s.model.Apostila;
import com.example.springboottp3s.repository.ApostilaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApostilaService {

    @Autowired
    private ApostilaRepository apostilaRepository;

    public List<Apostila> findAll() {
        return apostilaRepository.findAll();
    }

    public Apostila findById(String id) {
        return apostilaRepository.findById(id).orElse(null);
    }

    public Apostila save(Apostila apostila) {
        return apostilaRepository.save(apostila);
    }

    public void deleteById(String id) {
        apostilaRepository.deleteById(id);
    }
}
