package com.br.spring.caronaforall.api;

import com.br.spring.caronaforall.entidades.Usuario;
import com.br.spring.caronaforall.repositorios.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioApi {

    @Autowired
    private UsuarioDAO usuarioDao;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Usuario> listarUsuarios() {
        return usuarioDao.findAll();
    }

}
