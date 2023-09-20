package br.com.brenonoccioli.casadocodigo.service;

import br.com.brenonoccioli.casadocodigo.model.Livro;
import br.com.brenonoccioli.casadocodigo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Livro criarLivro(Livro livro) {
        return livroRepository.save(livro);
    }
}
