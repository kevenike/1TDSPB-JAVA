package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Credito;
import br.com.fiap.beans.Debito;

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
		//instaciar objetos
		
		// String nome, String bandeira, int numero, int cvv, double saldo, double parcela
		Credito credito = new Credito(
				texto("Nome"), texto("bandeira"),
				inteiro("Numero"), inteiro("CVV"),
				real("Saldo"), real("Parcela"));
		
		Debito debito = new Debito(
				texto("Nome"), texto("Bandeira"),
				inteiro("Numero"), inteiro("CVV"),
				real("Saldo"), real("Consignado"));
		
		System.out.println("\n--ENTRADA-CREDITO--\n" +
							"\nNome: " +  credito.getNome() +
							"\nBandeira: " + credito.getBandeira() +
							"\nNumero do cartão" + credito.getNumero() +
							"\nCVV: " + credito.getCvv() +
							"\nSaldo: " + credito.getSaldo() + 
							"\nLimite credito: " + credito.limite() +
							"\n\n----ENTRADA-DEBITO---\n" +
							"\nNome: " +  debito.getNome() +
							"\nBandeira: " + debito.getBandeira() +
							"\nNumero do cartão" + debito.getNumero() +
							"\nCVV: " + debito.getCvv() +
							"\nSaldo: " + debito.getSaldo() +
							"\nLimite Debito: " + debito.limite()
							);
		
		
	}
}
