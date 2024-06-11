package com.example.springboottp3s.controller;

import com.example.springboottp3s.model.Apostila;
import com.example.springboottp3s.service.ApostilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apostilas")
public class ApostilaController {

    @Autowired
    private ApostilaService apostilaService;

    @GetMapping
    public List<Apostila> getAllApostilas() {
        return apostilaService.findAll();
    }

    @GetMapping("/{id}")
    public Apostila getApostilaById(@PathVariable String id) {
        return apostilaService.findById(id);
    }

    @PostMapping
    public Apostila createApostila(@RequestBody Apostila apostila) {
        return apostilaService.save(apostila);
    }

    @PutMapping("/{id}")
    public Apostila updateApostila(@PathVariable String id, @RequestBody Apostila apostila) {
        apostila.setId(id);
        return apostilaService.save(apostila);
    }

    @DeleteMapping("/{id}")
    public void deleteApostila(@PathVariable String id) {
        apostilaService.deleteById(id);
    }
}

