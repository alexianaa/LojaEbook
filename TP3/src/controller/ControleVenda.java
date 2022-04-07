package controller;

import model.Cliente;
import model.Dados;
import model.Ebook;

public class ControleVenda {

	public static String[] infoCarrinho(String cliente) {
		String[] carrinho = new String[10];
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(cliente)) {
				Ebook[] preCarrinho = edit.getCarrinho().getEbooks();
				if (preCarrinho != null) {
					for (int i = 0; i < preCarrinho.length; i++) {
						carrinho[i] = preCarrinho[i].toString() + " \n";
					}
				}
			}
		}
		return carrinho;
	}

}
