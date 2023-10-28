package com.example.desafioencibra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Senha")
public class Senha {
    @Id
    private Long id;
    private String descricao;
    private String tags;
    private String hash;
    private Long idUsuario;
}