package com.br.spring.caronaforall.api;

import com.br.spring.caronaforall.entidades.InfoUsuario;
import com.br.spring.caronaforall.entidades.Usuario;
import com.br.spring.caronaforall.repositorios.InfoUsuarioDAO;
import com.br.spring.caronaforall.repositorios.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioApi {

    @Autowired
    private UsuarioDAO usuarioDao;
    @Autowired
    private InfoUsuarioDAO infoUsuarioDao;

    @RequestMapping(value = "/{login}", method = RequestMethod.GET)
    public Usuario verificarLogin(@PathVariable("login") String login) {
        System.out.println(login);
        Usuario u = usuarioDao.findByLogin(login);
        return u;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario criarUsuario(@RequestBody Usuario u) {
        Usuario usuario = usuarioDao.save(u);

        return usuario;
    }

}
