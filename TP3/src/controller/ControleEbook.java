package controller;

import model.Dados;
import model.Ebook;

public class ControleEbook {

	public ControleEbook() {

	}

	/**
	 * Cadastra um ebook no sistema
	 */
	public static void cadastrar() {

	}

	/**
	 * Exclui um ebook do sistema
	 */
	public static void excluirEbook() {

	}

	/**
	 * Retorna informacoes do ebook selecionado
	 * 
	 * @param nome - string com o nome do ebook
	 */
	public static void buscarEbook(String nome) {

	}

	/**
	 * Retorna as informacoes do ebook
	 * 
	 * @param titulo titulo do livro a ser buscado
	 * @return String[]
	 */
	public static String[] infoEbook(String titulo) {
		String[] ebook = new String[7];

		for (Ebook edit : Dados.getEbooks()) {
			if (edit.getTitulo().equals(titulo)) {
				Double tamanhoArquivo = edit.getTamanhoArquivo();
				Double valor = edit.getValorLivro();
				Integer anoPublicacao = edit.getanoPublicacao();
				Integer numPaginas = edit.getNumPaginas();
				ebook[0] = edit.getCategoria();
				ebook[1] = edit.getAutor();
				ebook[2] = edit.getIdioma();
				ebook[3] = numPaginas.toString();
				ebook[4] = valor.toString();
				ebook[5] = anoPublicacao.toString();
				ebook[6] = tamanhoArquivo.toString();
			}
		}
		return ebook;
	}

	/**
	 * Retorna se o ebook existe
	 * 
	 * @param c titulo do ebook
	 */
	public static boolean existeEbook(String c) {
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.getTitulo().equals(c)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna uma string com os titulos dos ebooks cadastrados no sistema
	 * 
	 * @return String[]
	 */
	public String[] showTitulos() {
		String[] titulos = new String[Dados.getEbooks().size()];
		for (Ebook edit : Dados.getEbooks()) {
			titulos[Dados.getEbooks().indexOf(edit)] = edit.getTitulo();
		}
		return titulos;
	}
}
