package br.com.brenonoccioli.casadocodigo.controller.dto.request;

import br.com.brenonoccioli.casadocodigo.model.Autor;
import br.com.brenonoccioli.casadocodigo.validators.UniqueValue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AutorRequest {

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    @UniqueValue(field = "email", domainClass = Autor.class)
    private String email;

    @NotBlank
    @Size(max = 400)
    private String descricao;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor toModel(){
        return new Autor(this.nome, this.email, this.descricao);
    }
}
