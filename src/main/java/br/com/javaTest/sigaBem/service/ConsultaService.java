package br.com.javaTest.sigaBem.service;

import br.com.javaTest.sigaBem.model.ConsultaResponse;
import br.com.javaTest.sigaBem.model.payload.ConsultaPayload;

public interface ConsultaService {

	ConsultaResponse inserir(ConsultaPayload consulta);

}
