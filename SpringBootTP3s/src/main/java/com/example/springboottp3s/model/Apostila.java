package com.example.springboottp3s.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "apostilas")
public class Apostila {

    @Id
    private String id;

    private String titulo;

    private String conteudo;

}
