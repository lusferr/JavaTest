package br.com.javaTest.sigaBem.model.payload;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ConsultaPayload {

	@NotNull(message = "esse campo não pode ser vazio")
	private float peso;

	@NotNull
	@Size(min = 5, message = "Esse campo deve conter no minimo 5 caracteres")
	private String cepOrigem;
	@NotNull
	@Size(min = 5, message = "Esse campo deve conter no minimo 5 caracteres")
	private String cepDestino;
	@NotNull
	@Size(min = 1, message = "Esse campo deve conter no minimo 1 caracter")
	private String nomeDestinatario;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
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

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	
}
