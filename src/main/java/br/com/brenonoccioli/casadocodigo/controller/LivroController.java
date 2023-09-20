package br.com.brenonoccioli.casadocodigo.controller;

import br.com.brenonoccioli.casadocodigo.controller.dto.request.LivroRequest;
import br.com.brenonoccioli.casadocodigo.model.Livro;
import br.com.brenonoccioli.casadocodigo.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<?> criarLivro(@RequestBody @Valid LivroRequest request){
        Livro livro = request.toModel();

        livroService.criarLivro(livro);

        return ResponseEntity.status(201).build();
    }

}
