package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class ExecutarSistema {

	public static void main(String[] args) {
		// Instancia objeto
		Banco objBanco = new Banco(JOptionPane.showInputDialog("Nome do Banco"),
				Integer.parseInt(JOptionPane.showInputDialog("Numero da agencia")));

		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o logradouro"),
				JOptionPane.showInputDialog("Digite o cep"), JOptionPane.showInputDialog("Digite o bairro"),
				Integer.parseInt(JOptionPane.showInputDialog("Numero da residencia")));

		objBanco.setEndereco(objEndereco);

		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Nome do cliente"),
				JOptionPane.showInputDialog("Digite o cpf"),
				Integer.parseInt(JOptionPane.showInputDialog("DIgite a conta")),
				Double.parseDouble(JOptionPane.showInputDialog("Infome o valor do deoposito")),
				JOptionPane.showInputDialog("Digite o email"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo")));

		objBanco.setCliente(objCliente);

		System.out.println("Banco: " + objBanco.getNome() + "\nAgencia: " + objBanco.getAgencia()
				+ "\n\n--------IMFORMACOES DO ENDERECO----------------\n" + "\nLogradouro: "
				+ objBanco.getEndereco().getLogradouro() + "\nCEP: " + objBanco.getEndereco().getCep() + "\nBairro: "
				+ objBanco.getEndereco().getBairro() + "\nNumero da Residencia: " + objBanco.getEndereco().getNumero()
				+ "\n\n---------IMFOMACOES DO CLIENTE---------------\n" + "\nCliente: "
				+ objBanco.getCliente().getNome() + "\nCPF: " + objBanco.getCliente().getCpf() + "\nNumero da Conta: "
				+ objBanco.getCliente().getConta() + "\nEmail: " + objBanco.getCliente().getEmail()
				+ "\nSaldo anterior : " + objBanco.getCliente().getSaldo());

		System.out.println("SALDO ATUALIZADO\n" + objBanco.getCliente().atualizacaoSaldo());

	}

}
