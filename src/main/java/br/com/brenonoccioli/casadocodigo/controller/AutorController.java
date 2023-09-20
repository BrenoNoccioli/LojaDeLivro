package br.com.brenonoccioli.casadocodigo.controller;

import br.com.brenonoccioli.casadocodigo.controller.dto.request.AutorRequest;
import br.com.brenonoccioli.casadocodigo.model.Autor;
import br.com.brenonoccioli.casadocodigo.service.AutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    AutorService autorService;

    @PostMapping
    public ResponseEntity<?> criaAutor(@RequestBody @Valid AutorRequest request){

        Autor autor = request.toModel();
        autorService.persistirAutor(autor);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}