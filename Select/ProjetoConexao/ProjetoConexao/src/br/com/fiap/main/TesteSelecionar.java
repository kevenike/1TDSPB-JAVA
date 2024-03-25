package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fia.dao.ProdutoDAO;
import br.com.fiap.beans.Produto;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		List<Produto> listaProduto = (ArrayList<Produto>) produtoDAO.selecionar();
		
		if(listaProduto != null) {
			// Foreach
			for(Produto p : listaProduto) {
				System.out.println(p.getCodigo() + " " + p.getTipo() + " " + p.getMarca() + " " + p.getValor() + " ");
			}
		}

	}

}
