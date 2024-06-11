package com.example.springboottp3s.service;

import com.example.springboottp3s.model.Aluno;
import com.example.springboottp3s.model.Apostila;
import com.example.springboottp3s.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Database implements CommandLineRunner {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private ApostilaService apostilaService;

    @Override
    public void run(String... args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setNome("Matemática");

        Curso curso2 = new Curso();
        curso2.setNome("História");

        cursoService.save(curso1);
        cursoService.save(curso2);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.getCursos().add(curso1);
        aluno1.getCursos().add(curso2);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.getCursos().add(curso1);

        alunoService.save(aluno1);
        alunoService.save(aluno2);

        Apostila apostila1 = new Apostila();
        apostila1.setTitulo("Apostila de Spring Boot");
        apostila1.setConteudo("Conteúdo da apostila de Spring Boot.");

        Apostila apostila2 = new Apostila();
        apostila2.setTitulo("Apostila de Java");
        apostila2.setConteudo("Conteúdo da apostila de Java.");

        apostilaService.save(apostila1);
        apostilaService.save(apostila2);
    }
}

