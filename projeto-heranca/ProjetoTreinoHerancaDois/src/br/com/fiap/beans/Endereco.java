package br.com.fiap.beans;

public class Endereco {

	private String lougradoro;
	private String cep;
	private int numero;
	private String bairro;

	public Endereco() {
		super();
	}

	public Endereco(String lougradoro, String cep, int numero, String bairro) {
		super();
		this.lougradoro = lougradoro;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
	}

	public String getLougradoro() {
		return lougradoro;
	}

	public void setLougradoro(String lougradoro) {
		this.lougradoro = lougradoro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
