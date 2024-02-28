package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// Instaciar objetos
		Cliente cliente = new Cliente();
		Colaborador colaborador = new Colaborador();
		Endereco endereco = new Endereco();
		
		//Entrada Cliente
		cliente.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
		
		
		// Entrada Endereço
		endereco.setLogradouro(JOptionPane.showInputDialog("Infoeme o Logradouro"));
		endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Numero")));
		
		cliente.setEndereco(endereco);

		// Entrada colaborador
		colaborador.setNome(JOptionPane.showInputDialog("Digite o nome do calaborador"));
		colaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario do colaborador")));
		
		// Saida 
		System.out.println("IMFORMAÇOES CLIENTE" + 
		"\nNome: " + cliente.getNome() + 
		"\nIdade: " + cliente.getIdade() +
		"\n\nINFORME O INDEREÇO" + 
		"\nLugradouro: " + cliente.getEndereco().getLogradouro() + 
		"\nNumero: " + cliente.getEndereco().getNumero() + 
		"\n\nINFORME O COLABORADOR" +
		 colaborador.getTudo());
		
		System.out.println("\nTAXA: " + colaborador.pagaTaxa());
		

	}

}
