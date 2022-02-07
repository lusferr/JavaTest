package br.com.javaTest.sigaBem.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.javaTest.sigaBem.model.EnderecoResponse;



@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json")
	EnderecoResponse consultarCep(@PathVariable("cep") String cep);
}
