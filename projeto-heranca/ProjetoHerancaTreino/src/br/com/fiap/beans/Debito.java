package br.com.fiap.beans;

public class Debito extends Cartao {

	private double consignado;
	// construtor vazio
	public Debito() {
		super();
	}
	
	//construtor cheio com herança
	public Debito(String nome, String bandeira, int numero, int cvv, double saldo, double consignado) {
		super(nome, bandeira, numero, cvv, saldo);
		this.consignado = consignado;
	}
	
	// Setters (Entrada) e getters(Exibir\ Retornar)
	public double getConsignado() {
		return consignado;
	}

	public void setConsignado(double consignado) {
		this.consignado = consignado;
	}

	@Override
	public double limite() {
		return saldo - consignado;
	}
	
	
	
	
	
}
