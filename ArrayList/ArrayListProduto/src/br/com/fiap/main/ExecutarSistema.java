package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class ExecutarSistema {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	
	static  int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(List<Produto> lp, Produto p) {
		double total =0;
		
		for (Produto pr : lp) {
			total += pr.getValor() * p.getQuantidade();
		}
		
		return total;
	}
		
	public static void main(String[] args) {
		// instanciar
		
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Produto objProduto;
		
		do {
			objProduto = new Produto ();
			objProduto.setCodigo(inteiro("Infome o codigo"));
			objProduto.setTipo(texto("Digite o tipo de produto"));
			objProduto.setMarca(texto("Marca"));
			objProduto.setQuantidade(inteiro("Quantidade"));
			objProduto.setValor(real("Valor"));
			listaProduto.add(objProduto);
			
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar Produto No Carrinho?",
			 "Carrinho de Compra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		// Saidas 
		
		// o foreach percorre todos os elementos do Produto para serem exibidos
		for(Produto produto : listaProduto) {
			System.out.println(produto.toString());
			
			System.out.println("\n\n\n\nVALOR TOTAL: " + valorTotal(listaProduto, objProduto));
		}
		
		
		
  }
}
