package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastrar {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Produto produto = new Produto();
		
		ProdutoDAO dao = new ProdutoDAO();
		
		produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo")));
		produto.setTipo(JOptionPane.showInputDialog("Tipo"));
		produto.setMarca(JOptionPane.showInputDialog("Marca"));
		produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
		
		System.out.println(dao.inserir(produto));
	}
}
