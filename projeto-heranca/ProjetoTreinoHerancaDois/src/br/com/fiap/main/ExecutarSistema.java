package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.DepCalcados;
import br.com.fiap.beans.DepEletronico;
import br.com.fiap.beans.Endereco;

public class ExecutarSistema {
	// String
		static String texto(String j){
			return JOptionPane.showInputDialog(j);
		}
		
		// int
		static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));
		}
		
		// double
		static double real(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}
		
		public static void main(String[] args) {
			//String nomeProduto, double valorProduto, int quantidadeProduto, String marcaCelular
			DepEletronico eletronico = new DepEletronico(
					texto("Nome do produto"), real("valor"),
					inteiro("Quantido"), texto("Matca"));
			
			// String nomeProduto, double valorProduto, int quantidadeProduto, String sapato
			DepCalcados calcados = new DepCalcados();
			
			//String lougradoro, String cep, int numero, String bairro
			Endereco endereco = new Endereco();
		}

}
