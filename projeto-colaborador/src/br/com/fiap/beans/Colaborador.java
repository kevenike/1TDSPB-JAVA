package br.com.fiap.beans;

public class Colaborador {
	
	private String nome;
	private String cargo;
	private double valorHora;
	private double qtdadeHora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQtdadeHora() {
		return qtdadeHora;
	}
	public void setQtdadeHora(double qtdadeHora) {
		this.qtdadeHora = qtdadeHora;
	}
	
	// get com mais de um atributo
	public String getTudo() {
		
		return "\nNome: " + nome + "\nCargo: " + cargo + "\nValor da Hora: " + valorHora +
				"\nQuantidade de Horas: " + qtdadeHora;
	}
	
	// Metodo worker
	public double calcularSalrio() {
		return valorHora * qtdadeHora; 
	}
	
	// If else
	public String pagrTaxa() {
		if(calcularSalrio() >= 17500.55) {
			return "paga Taxa";	
		}else {
			return "Não paga taxa";
		}
	}
	
	
}
