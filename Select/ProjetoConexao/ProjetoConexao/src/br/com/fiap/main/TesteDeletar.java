package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fia.dao.ProdutoDAO;
import br.com.fiap.beans.Produto;

public class TesteDeletar {

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Produto produto = new Produto();
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		produto.setCodigo(inteiro("Codigo"));
		
		System.out.println(produtoDAO.deletar(produto));
		
	}

}
