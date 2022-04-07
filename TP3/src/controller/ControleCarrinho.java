package controller;

import model.Carrinho;
import model.Cliente;
import model.Ebook;

public class ControleCarrinho {

	/**
	 * Adiciona um ebook ao carrinho
	 * 
	 * @param ebook - ebook a ser adicionado
	 */
	public void adicionarEbook(Ebook ebook) {
		/*
		 * for (int i = 0; i < 50; i++) { if (ebooks[i] == null) { ebooks[i] = ebook;
		 * break; } }
		 */
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

	/**
	 * Retorna uma string com informacoes dos ebooks no carrinho
	 * 
	 * @param cliente - informa qual de qual cliente o carrinho sera selecionado
	 */
	public static void mostrarEbooks(Cliente cliente) {
		/*
		 * for (Ebook edit : cliente.getCarrinho().getEbooks()) { if (edit != null) {
		 * System.out.println(edit + "\n"); } }
		 */
	}

}
