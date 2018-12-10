package br.com.rda.sistaplog.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.rda.sistaplog.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}