package br.com.brenonoccioli.casadocodigo.service;

import br.com.brenonoccioli.casadocodigo.model.Autor;
import br.com.brenonoccioli.casadocodigo.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public Autor persistirAutor(Autor autor) {
        return autorRepository.save(autor);
    }
}
