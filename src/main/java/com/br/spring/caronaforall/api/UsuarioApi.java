package com.br.spring.caronaforall.api;

import com.br.spring.caronaforall.entidades.Usuario;
import com.br.spring.caronaforall.repositorios.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioApi {

    @Autowired
    private UsuarioDAO usuarioDao;

    @RequestMapping(value = "/{login}", method = RequestMethod.GET)
    public Usuario verificarLogin(@PathVariable("login") String login) {
        System.out.println(login);
        Usuario u = usuarioDao.findByLogin(login);
        return u;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario criarUsuario(@RequestBody Usuario u) {
        Calendar c = Calendar.getInstance();
        Date hoje = c.getTime();
        u.setDataInclusao(hoje);

        return usuarioDao.save(u);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Usuario alterarUsuario(@RequestBody Usuario u) {

        Usuario usuario = usuarioDao.findByLogin(u.getLogin());

        usuario.setNome(u.getNome());
        usuario.setEmail(u.getEmail());
        return usuarioDao.save(usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deletarUsuario(@RequestBody Usuario u) {
        Usuario usuario = usuarioDao.findByLogin(u.getLogin());
        usuarioDao.delete(usuario);

        System.out.println("Usuario: " + u.getLogin() + " deletado.");
    }

}
