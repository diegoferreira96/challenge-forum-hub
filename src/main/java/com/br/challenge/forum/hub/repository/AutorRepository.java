package com.br.challenge.forum.hub.repository;

import com.br.challenge.forum.hub.domain.autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
