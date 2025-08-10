package com.br.challenge.forum.hub.repository;

import com.br.challenge.forum.hub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
