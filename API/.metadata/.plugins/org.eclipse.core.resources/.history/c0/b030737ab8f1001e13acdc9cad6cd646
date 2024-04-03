package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteViaCep {

	public static void main(String[] args) {
		// Instancia objetos
		ViaCepService viaCep = new ViaCepService();
		
		
		String cep = JOptionPane.showInputDialog("Informe o cep para pesquisa");
		
		Endereco endereco = new viaCep.getEndereco(cep);
		
		System.out.println(endereco);
		
		
	}

}
