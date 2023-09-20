package br.com.brenonoccioli.casadocodigo.controller.dto.response;

import br.com.brenonoccioli.casadocodigo.model.Categoria;

public class CategoriaResponse {

    private String nome;

    public CategoriaResponse(Categoria categoria){
        this.nome = categoria.getNome();
    }

    public String getNome() {
        return nome;
    }

}
