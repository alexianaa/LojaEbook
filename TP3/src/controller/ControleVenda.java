package controller;

import model.Cliente;
import model.Dados;
import model.Ebook;

public class ControleVenda {

	/**
	 * Retorna em um array de string as informacoes do carrinho
	 * 
	 * @param cliente
	 * @return String[]
	 */
	public static String[] infoCarrinho(String cliente) {
		String[] carrinho = new String[10];
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(cliente)) {
				Ebook[] preCarrinho = edit.getCarrinho().getEbooks();
				if (preCarrinho != null) {
					for (int i = 0; preCarrinho[i] != null; i++) {
						carrinho[i] = preCarrinho[i].toString();
					}
				}
			}
		}
		return carrinho;
	}

}
