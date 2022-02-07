package br.com.javaTest.sigaBem.service;

import br.com.javaTest.sigaBem.model.ConsultaResponse;
import br.com.javaTest.sigaBem.model.entity.Consulta;
import br.com.javaTest.sigaBem.model.payload.ConsultaPayload;

public interface ConsultaService {

//	Iterable<ConsultaResponse> buscarTodos();

//	ConsultaResponse buscarPorId(Long id);

	ConsultaResponse inserir(ConsultaPayload consulta);

	void atualizar(Long id, Consulta consulta);

	void deletar(Long id);

}
