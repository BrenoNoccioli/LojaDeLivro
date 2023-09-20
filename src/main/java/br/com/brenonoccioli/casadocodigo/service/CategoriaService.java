package br.com.brenonoccioli.casadocodigo.service;

import br.com.brenonoccioli.casadocodigo.model.Categoria;
import br.com.brenonoccioli.casadocodigo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria persistirCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
