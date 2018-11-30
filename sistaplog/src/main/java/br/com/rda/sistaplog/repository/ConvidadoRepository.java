package br.com.rda.sistaplog.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rda.sistaplog.models.Convidado;
import br.com.rda.sistaplog.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
Iterable<Convidado> findByEvento(Evento evento);
}
