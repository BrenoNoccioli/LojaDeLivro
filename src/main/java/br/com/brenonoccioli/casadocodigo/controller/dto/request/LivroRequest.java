package br.com.brenonoccioli.casadocodigo.controller.dto.request;

import br.com.brenonoccioli.casadocodigo.model.Autor;
import br.com.brenonoccioli.casadocodigo.model.Categoria;
import br.com.brenonoccioli.casadocodigo.model.Livro;
import br.com.brenonoccioli.casadocodigo.validators.IdExists;
import br.com.brenonoccioli.casadocodigo.validators.UniqueValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LivroRequest {
    @NotBlank
    @UniqueValue(field = "titulo", domainClass = Livro.class)
    private String titulo;
    @NotBlank
    @Size(max = 500)
    private String resumo;

    private String sumario;
    @NotNull
    @Min(value = 20)
    private BigDecimal preco;
    @NotNull
    @Min(value = 100)
    private Long numeroPaginas;
    @NotBlank
    @UniqueValue(domainClass = Livro.class, field = "isbn")
    private String isbn;
    @NotNull
    @Future
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dataPublicacao;
    @NotNull
    @IdExists(field = "categoriaId", domainClass = Categoria.class)
    private Long categoriaId;
    @NotNull
    @IdExists(field = "autorId", domainClass = Autor.class)
    private Long autorId;

    public Livro toModel() {
        return new Livro(this.titulo, this.resumo, this.sumario, this.preco,
                this.numeroPaginas, this.isbn, this.dataPublicacao,
                this.categoriaId, this.autorId);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String getSumario() {
        return sumario;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Long getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public Long getAutorId() {
        return autorId;
    }
}
