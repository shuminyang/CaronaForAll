package com.br.spring.caronaforall.repositorios;

import com.br.spring.caronaforall.entidades.Carro;
import org.springframework.data.repository.CrudRepository;

public interface CarroDAO extends CrudRepository<Carro, Integer> {

    Carro findByPlaca(String placa);

}
