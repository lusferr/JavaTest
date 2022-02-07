package br.com.javaTest.sigaBem.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.javaTest.sigaBem.model.entity.Consulta;


public interface ConsultaRepository extends CrudRepository<Consulta, Long>{

}
