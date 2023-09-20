package br.com.brenonoccioli.casadocodigo.controller;

import br.com.brenonoccioli.casadocodigo.controller.dto.request.AutorRequest;
import br.com.brenonoccioli.casadocodigo.controller.dto.request.CategoriaRequest;
import br.com.brenonoccioli.casadocodigo.controller.dto.response.CategoriaResponse;
import br.com.brenonoccioli.casadocodigo.model.Autor;
import br.com.brenonoccioli.casadocodigo.model.Categoria;
import br.com.brenonoccioli.casadocodigo.service.AutorService;
import br.com.brenonoccioli.casadocodigo.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<?> criaAutor(@RequestBody @Valid CategoriaRequest request){

        Categoria categoria = request.toModel();
        Categoria categoriaCriada = categoriaService.persistirCategoria(categoria);

        return ResponseEntity.status(HttpStatus.CREATED).body(new CategoriaResponse(categoriaCriada));
    }
}
