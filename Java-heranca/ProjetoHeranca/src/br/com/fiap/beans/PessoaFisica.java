package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {

	// variaveis
	private String cpf;

	public PessoaFisica() {
		super();
	}
	
	// metodo construtor cheio
	public PessoaFisica(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}
	
	// Setters (entrada) e Getters (exibir \ retornar)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String indentificador() {
		return "Pessoa Física";
	}

}
