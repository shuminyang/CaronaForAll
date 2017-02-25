package com.br.spring.caronaforall.repositorios;

import com.br.spring.caronaforall.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

    Usuario findByLogin(String login);
}
