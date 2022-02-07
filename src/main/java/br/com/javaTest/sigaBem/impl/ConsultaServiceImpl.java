package br.com.javaTest.sigaBem.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javaTest.sigaBem.model.ConsultaResponse;
import br.com.javaTest.sigaBem.model.EnderecoResponse;
import br.com.javaTest.sigaBem.model.entity.Consulta;
import br.com.javaTest.sigaBem.model.payload.ConsultaPayload;
import br.com.javaTest.sigaBem.repository.ConsultaRepository;
import br.com.javaTest.sigaBem.service.ConsultaService;
import br.com.javaTest.sigaBem.service.ViaCepService;

@Service
public class ConsultaServiceImpl implements ConsultaService{

	@Autowired
	private ConsultaRepository ConsultaRepository;
	
	private ViaCepService viaCepService;
	
	@Autowired
	private void setViaCepService(ViaCepService viaCepService) {
		this.viaCepService = viaCepService;
	}
	
	public ConsultaServiceImpl(ConsultaRepository ConsultaRepository) {
		this.ConsultaRepository = ConsultaRepository;
	}
	
	
	
	@Override
	public ConsultaResponse inserir(ConsultaPayload consultaPayload) {
		EnderecoResponse enderecoOrigem = viaCepService.consultarCep(consultaPayload.getCepOrigem());
		EnderecoResponse enderecoDestino = viaCepService.consultarCep(consultaPayload.getCepDestino());
		
		float valorPorPeso = 1;
		float valor = 0;
		Date dataPrevista = new Date();
			
		if(enderecoOrigem.getDdd().equals(enderecoDestino.getDdd())) {
			valor = (float) (consultaPayload.getPeso() * valorPorPeso * 0.5);
			
			dataPrevista = addDays(dataPrevista, 1);
		}
		
		else if(enderecoOrigem.getUf().equals(enderecoDestino.getUf())) {
			valor = (float) (consultaPayload.getPeso() * valorPorPeso * 0.25);
			
			dataPrevista = addDays(dataPrevista, 3);
		}
		else {
			valor = (float) (consultaPayload.getPeso() * valorPorPeso);
			dataPrevista = addDays(dataPrevista, 10);
		}
		
		
		Consulta consulta = new Consulta();
		consulta.setPeso(consultaPayload.getPeso() );
		consulta.setCepOrigem(consultaPayload.getCepOrigem());
		consulta.setCepDestino(consultaPayload.getCepDestino());
		consulta.setNomeDestinatario(consultaPayload.getNomeDestinatario());
		consulta.setVlTotalFrete(valor);
		consulta.setDataPrevistaEntrega(dataPrevista);
		
		
		ConsultaRepository.save(consulta);
		
		return new ConsultaResponse(consulta);
	}

	private Date addDays(Date dataPrevista, int days) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(dataPrevista); 
		c.add(Calendar.DATE, days);
		dataPrevista = c.getTime();
		return dataPrevista;
	}
	
	
	
	
	
	
	
}
