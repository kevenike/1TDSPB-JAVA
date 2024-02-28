package br.com.fiap.beans;

public class DepCalcados extends Loja {

	private String sapato;
	
	// contrutor vazio
	public DepCalcados() {
		super();
	}
	//construtor cheio com herança
	public DepCalcados(String nomeProduto, double valorProduto, int quantidadeProduto, String sapato) {
		super(nomeProduto, valorProduto, quantidadeProduto);
		this.sapato = sapato;
	}

	public String getSapato() {
		return sapato;
	}

	public void setSapato(String sapato) {
		this.sapato = sapato;
	}
	
	public String identificador(){
		return "Calcados";
	}

}
