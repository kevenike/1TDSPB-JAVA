package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class ExecutarSistema {
	// String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {

		PessoaFisica fisica = new PessoaFisica(texto("digite o nome"), texto("Digite o email"), texto("Digite o cpf"));

		PessoaJuridica juridica = new PessoaJuridica(texto("Digite o nome da pessoa juridica"),
				texto("Digite o email da pessoa juridica"), texto("Digite o cnpj"));

		Endereco endereco = new Endereco(texto("Digite o endereço"));

		
		System.out.println(fisica.indentificador() +
					       "\nNOME PESSOA FISICA" + fisica.getNome() +
					       "\nEMAIL PESSOA FISICA: " + fisica.getEmail() +
					       "\nCPF: " + fisica.getCpf());
		
         
		System.out.println("\n" + juridica.indentificador() +
						"\nNOME PESSOA JURIDICA: " + juridica.getNome() +
						"\nEMAIL PESSOA JURIDICA: " + juridica.getEmail() +
						"\nCNPJ: " + juridica.getCnpj());
		
		
		System.out.println("\n\n---ENDERECO---\n" +
						   "\nLOGRADOURO: " + endereco.getLogradouro());
	}
}
