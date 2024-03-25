package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fia.dao.ProdutoDAO;
import br.com.fiap.beans.Produto;

public class TesteAtualizar {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Produto produto = new Produto();
		
		ProdutoDAO produtoDAO = new ProdutoDAO();

		produto.setCodigo(inteiro("Codigo"));
		produto.setTipo(texto("Tipo"));
		produto.setMarca(texto("Marca"));
		produto.setValor(real("Valor"));
		
		System.out.println(produtoDAO.atualizar(produto));
		
	}

}
