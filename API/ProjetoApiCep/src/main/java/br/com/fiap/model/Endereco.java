package br.com.fiap.model;

public class Endereco {
	
	private String cep;
	private String lougradoro;
	private String complemento;
	private String bairro;
	private String localidade;
	
	
	public Endereco() {
		super();
	}


	public Endereco(String cep, String lougradoro, String complemento, String bairro, String localidade) {
		super();
		this.cep = cep;
		this.lougradoro = lougradoro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getLougradoro() {
		return lougradoro;
	}


	public void setLougradoro(String lougradoro) {
		this.lougradoro = lougradoro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", lougradoro=" + lougradoro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", localidade=" + localidade + "]";
	}
	
	
	
}
