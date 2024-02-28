package br.com.fiap.beans;

public class DepEletronico extends Loja {

	private String marcaCelular;

	public DepEletronico() {
		super();
	}
	//construtor cheio com herança
	public DepEletronico(String nomeProduto, double valorProduto, int quantidadeProduto, String marcaCelular) {
		super(nomeProduto, valorProduto, quantidadeProduto);
		this.marcaCelular = marcaCelular;
	}

	public String getMarcaCelular() {
		return marcaCelular;
	}

	public void setMarcaCelular(String marcaCelular) {
		this.marcaCelular = marcaCelular;
	}
	
	public String identificador(){
		return "Eletronico";
	}
}
