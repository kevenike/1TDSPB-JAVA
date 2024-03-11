package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConnectionFactory;

public class TesteConexao {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Connection cn = new ConnectionFactory().conexao();
		
		System.out.println("Conectado com sucesso!");
		
		cn.close();
	}

}
