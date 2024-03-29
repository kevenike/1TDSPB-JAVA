package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	
	public Connection minhaConexao;

	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert
	public String inserir(Produto produto) throws SQLException {
		
		PreparedStatement statement = minhaConexao.prepareStatement
					(" insert into T_FIAP_PRODUTO values(?, ?, ?, ?)");
				
		statement.setInt(1, produto.getCodigo());
		statement.setString(2, produto.getTipo());
		statement.setString(3, produto.getMarca());
		statement.setDouble(4, produto.getValor());
		
		statement.execute();
		statement.close();
		
		
		return "Produto Cadastrado com Sucesso!";
	}
	
	
}
