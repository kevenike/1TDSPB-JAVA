package br.com.fiap.beans;

public class Credito extends Cartao {

	private double parcela;
	
	// construtor vazio
	public Credito() {
		super();
	}	
	
	//construtor cheio com herança
	public Credito(String nome, String bandeira, int numero, int cvv, double saldo, double parcela) {
		super(nome, bandeira, numero, cvv, saldo);
		this.parcela = parcela;
	}
	
	// Setters (Entrada) e getters(Exibir\ Retornar)
	public double getParcela() {
		return parcela;
	}

	public void setParcela(double parcela) {
		this.parcela = parcela;
	}

	@Override
	public double limite() {
		return saldo - parcela;
	}
	
	
}
