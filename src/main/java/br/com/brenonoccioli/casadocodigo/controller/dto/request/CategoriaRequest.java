package br.com.brenonoccioli.casadocodigo.controller.dto.request;

import br.com.brenonoccioli.casadocodigo.model.Categoria;
import br.com.brenonoccioli.casadocodigo.validators.UniqueValue;
import jakarta.validation.constraints.NotBlank;

public class CategoriaRequest {

    @NotBlank
    @UniqueValue(field = "nome", domainClass = Categoria.class)
    private String nome;

    public Categoria toModel(){
        return new Categoria(this.nome);
    }

    public String getNome() {
        return nome;
    }
}
