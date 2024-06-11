package com.example.springboottp3s.repository;

import com.example.springboottp3s.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

