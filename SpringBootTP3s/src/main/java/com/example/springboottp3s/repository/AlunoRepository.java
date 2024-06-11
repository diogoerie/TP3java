package com.example.springboottp3s.repository;

import com.example.springboottp3s.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
