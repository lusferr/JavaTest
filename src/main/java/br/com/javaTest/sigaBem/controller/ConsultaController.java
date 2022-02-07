package br.com.javaTest.sigaBem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javaTest.sigaBem.impl.ConsultaServiceImpl;
import br.com.javaTest.sigaBem.model.ConsultaResponse;
import br.com.javaTest.sigaBem.model.entity.Consulta;
import br.com.javaTest.sigaBem.model.payload.ConsultaPayload;


@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaServiceImpl consultaServiceImpl;
	
	@PostMapping
	public ResponseEntity<ConsultaResponse> inserir(@RequestBody ConsultaPayload consulta){
		ConsultaResponse response = consultaServiceImpl.inserir(consulta);
		return ResponseEntity.ok(response);
	}
}
