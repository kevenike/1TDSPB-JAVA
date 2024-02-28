package br.com.fiap.beans;

public abstract class Pessoa {
	
	// variaveis
	private String nome;
	private String email;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}
	// metodo construtor cheio
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	// Setters (entrada) e Geetters (exibir \ retornar)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public abstract String indentificador();
	
	
	
	
	
}
