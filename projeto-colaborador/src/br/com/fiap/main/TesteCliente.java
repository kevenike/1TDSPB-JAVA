package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente ObjCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Colaborador objColaborador = new Colaborador();
		
		// Entradas
		// Cliente
		ObjCliente.setNome(JOptionPane.showInputDialog("Digite o Nome"));
		ObjCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade")));
		
		// Endereco
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		objEndereco.setCep(JOptionPane.showInputDialog("Cep"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
		
		ObjCliente.setEndereco(objEndereco);
		
		// Colaborador
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		objColaborador.setCargo(JOptionPane.showInputDialog("Cargo"));
		objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Informe Valor da hora trabalhada")));
		objColaborador.setQtdadeHora(Double.parseDouble(JOptionPane.showInputDialog("Informe Quantidade de hora trabalhada")));
		
		
		System.out.println("----INFORMACOES DO CLIENTE----\n" + 
						"Nome do cliente : " + ObjCliente.getNome() +
						"\nIdade : " + ObjCliente.getIdade() +
						"\nLougradouro : " + ObjCliente.getEndereco().getLogradouro() +
						"\nCep : " + ObjCliente.getEndereco().getCep() +
						"\nNumero : " + ObjCliente.getEndereco().getNumero() +
						"\n\n----INFOMACOES DO COLABORADOR----" +
						 objColaborador.getTudo() + 
						 "\nSalario: " + objColaborador.calcularSalrio() +
						 "\n\n----IRFORMACOES DA TAXA----" +
						 "\nTaxa: " + objColaborador.pagrTaxa());
	}

}
