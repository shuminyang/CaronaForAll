package com.br.spring.caronaforall.api;

import com.br.spring.caronaforall.entidades.Carro;
import com.br.spring.caronaforall.entidades.Usuario;
import com.br.spring.caronaforall.repositorios.CarroDAO;
import com.br.spring.caronaforall.repositorios.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/api/carro")
public class CarroApi {

    @Autowired
    private CarroDAO carroDao;
    @Autowired
    private UsuarioDAO usuarioDAO;

    @RequestMapping(method = RequestMethod.POST)
    public Carro criarCarro(@RequestBody Carro c) {
        Calendar calendar = Calendar.getInstance();
        Date hoje = calendar.getTime();
        Usuario usuario = usuarioDAO.findByLogin(c.getIdUsuario().getLogin());
        c.setDataAlteracao(hoje);
        c.setDataInclusao(hoje);
        c.setIdUsuario(usuario);

        return carroDao.save(c);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Carro alterarCarro(@RequestBody Carro c) {
        Calendar calendar = Calendar.getInstance();
        Date hoje = calendar.getTime();

        Carro carro = carroDao.findByPlaca(c.getPlaca());
        carro.setLugares(c.getLugares());
        carro.setDataAlteracao(hoje);

        return carroDao.save(carro);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deletarCarro(@RequestBody Carro c) {
        Carro carro = carroDao.findByPlaca(c.getPlaca());
        carroDao.delete(carro);

        System.out.println("Carro: " + c.getPlaca() + " do Usuario: " + c.getIdUsuario().getNome() + " foi deletado.");
    }


}
