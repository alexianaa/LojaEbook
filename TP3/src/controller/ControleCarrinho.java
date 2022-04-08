package controller;

import model.Carrinho;
import model.Cliente;
import model.Dados;
import model.Ebook;

public class ControleCarrinho {

	/**
	 * Adiciona um ebook ao carrinho
	 * 
	 * @param tituloEbook ebook a ser adicionado
	 * @param cliente     nome do cliente adicionando o ebook
	 */
	public static boolean adicionarEbook(String tituloEbook, String cliente) {
		// selecionar o carrinho do cliente
		for (Cliente usuario : Dados.getClientes()) {
			if (usuario.getNome().equals(cliente)) {
				// achar o ebook nos dados
				for (Ebook livro : Dados.getEbooks()) {
					if (livro.getTitulo().equals(tituloEbook)) {
						// editar a quantidade de ebooks
						int quantCarrinho = usuario.getCarrinho().getQuantidadeEbooks();
						usuario.getCarrinho().setQuantidadeEbooks(quantCarrinho + 1);
						// mudar o valor total do carrinho
						double valorAntigo = usuario.getCarrinho().getvalorTotal();
						double valorLivro = livro.getValorLivro();
						usuario.getCarrinho().setvalorTotal(valorAntigo + valorLivro);
						// acrescenta um ebook pegando a lista antiga e entregando uma lista nova
						Ebook[] listaAntiga = usuario.getCarrinho().getEbooks();
						if (listaAntiga != null) {
							Ebook[] listaNova = new Ebook[listaAntiga.length + 1];
							for (int i = 0; i <= listaAntiga.length; i++) {
								if (i == listaAntiga.length) {
									listaNova[i] = livro;
								} else {
									listaNova[i] = listaAntiga[i];
								}
							}
							usuario.getCarrinho().setEbooks(listaNova);
							return true;
						} else {
							Ebook[] listaNova = new Ebook[1];
							listaNova[0] = livro;
							usuario.getCarrinho().setEbooks(listaNova);
							return true;
						}
					}
				}
			}
		}

		return false;

	}

	public static double getValor(String cliente) {
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(cliente)) {
				return edit.getCarrinho().getvalorTotal();
			}
		}
		return 0.0;
	}

	/**
	 * Excluir um ebook do carrinho
	 * 
	 * @param nomeEbook - nome do ebook a ser excluido
	 */
	public static void excluirEbook(String nomeEbook) {
		/*
		 * Scanner ler = new Scanner(System.in); String opcaoString;
		 * System.out.println("Digite o nome do ebook: "); boolean achou = false;
		 * opcaoString = ler.next(); for (Ebook edit :
		 * cliente.getCarrinho().getEbooks()) { // olha os ebooks do carrinho if (edit
		 * != null && edit.getNomeEbook().equals(opcaoString)) { // se o espaco nao for
		 * vazio efor igual ao // ebook selecionado deletar(cliente.getCarrinho(),
		 * edit); System.out.println("Ebook exluido do carrinho\n"); achou = true; } }
		 * if (achou == false) { System.out.println("Ebook nao localizado"); }
		 */
	}

	/**
	 * Deleta todos os ebooks do carrinho
	 * 
	 * @param carrinho - informacoes do carrinho
	 */
	public static void deletar(Carrinho carrinho) {
		/*
		 * for (int i = 0; i < 50; i++) { if (carrinho.ebooks[i] == ebook) {
		 * carrinho.ebooks[i] = null; } }
		 */
	}

}
