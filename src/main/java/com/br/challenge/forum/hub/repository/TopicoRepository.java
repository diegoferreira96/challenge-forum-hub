package com.br.challenge.forum.hub.repository;

import com.br.challenge.forum.hub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
