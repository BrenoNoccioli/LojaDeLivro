package br.com.brenonoccioli.casadocodigo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autorId;

    private String nome;

    private String email;

    private String descricao;

    private LocalDateTime criadoEm = LocalDateTime.now();

    public Autor(String nome, String email, String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
