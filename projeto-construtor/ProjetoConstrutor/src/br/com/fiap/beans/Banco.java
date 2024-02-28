package br.com.fiap.beans;

public class Banco {
	// variaveis
	private String nome;
	private int agencia;
	private Endereco endereco;
	private Cliente cliente;

	// construtor vazio
	public Banco() {
		super();
	}

	// contrutor cheio
	public Banco(String nome, int agencia) {
		super();
		this.nome = nome.toUpperCase();
		this.agencia = agencia;
	}

	// Setters (entrada) e Getters (exibir\ retornar)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
