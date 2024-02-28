package br.com.fiap.beans;

public abstract class Cartao {

	private String nome;
	private String bandeira;
	private int numero;
	private int cvv;
	protected double saldo;

	// construtor vazi
	public Cartao() {
		super();
	}

	// construtor cheio
	public Cartao(String nome, String bandeira, int numero, int cvv, double saldo) {
		super();
		this.nome = nome;
		this.bandeira = bandeira;
		this.numero = numero;
		this.cvv = cvv;
		this.saldo = saldo;
	}

	// Setters (Entrada) e getters(Exibir\ Retornar)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract double limite();

	//public String toString() {
		//return "Nome: " + nome + "\nBandeira: " + bandeira + "\nNumero do cartão: " + numero + "\nCVV: " + cvv
			//	+ "\nSaldo: " + saldo;
	//}

}
