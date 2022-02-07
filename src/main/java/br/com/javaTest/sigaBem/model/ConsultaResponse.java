package br.com.javaTest.sigaBem.model;

import java.util.Date;

import br.com.javaTest.sigaBem.model.entity.Consulta;

public class ConsultaResponse { 


	private String cepOrigem;
	private String cepDestino;
	
	private float vlTotalFrete;

	private Date dataPrevistaEntrega;
	
	public ConsultaResponse(Consulta consulta) {
		this.cepDestino = consulta.getCepDestino();
		this.cepOrigem = consulta.getCepOrigem();
		this.vlTotalFrete = consulta.getVlTotalFrete();
		this.dataPrevistaEntrega = consulta.getDataPrevistaEntrega();
	}

	public String getCepOrigem() {
		return cepOrigem;
	}

	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public float getVlTotalFrete() {
		return vlTotalFrete;
	}

	public void setVlTotalFrete(float vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	public Date getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}
	
}
