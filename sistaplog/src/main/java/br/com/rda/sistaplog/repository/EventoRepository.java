package br.com.rda.sistaplog.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rda.sistaplog.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
