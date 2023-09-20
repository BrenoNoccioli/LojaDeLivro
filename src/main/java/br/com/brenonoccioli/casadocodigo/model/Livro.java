package br.com.brenonoccioli.casadocodigo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String resumo;

    private String sumario;

    private BigDecimal preco;

    private Long numeroPaginas;

    private String isbn;

    private LocalDate dataPublicacao;

    private Long categoriaId;

    private Long autorId;

    public Livro(String titulo, String resumo, String sumario, BigDecimal preco, Long numeroPaginas, String isbn, LocalDate dataPublicacao, Long categoriaId, Long autorId) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.sumario = sumario;
        this.preco = preco;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
        this.categoriaId = categoriaId;
        this.autorId = autorId;
    }
}
