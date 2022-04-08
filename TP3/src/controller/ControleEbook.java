package controller;

import model.Dados;
import model.Ebook;
import model.Editora;

public class ControleEbook {

	public ControleEbook() {

	}

	/**
	 * Cadastrar um ebook no sistema
	 * 
	 * @param t           titulo
	 * @param a           autor
	 * @param c           categora
	 * @param s           sinopse
	 * @param i           idioma
	 * @param p           preco do ebook
	 * @param tam         tamanho do arquivo
	 * @param pag         quantidade de paginas
	 * @param ano         ano de publicavao
	 * @param nomeEditora nome da Editora
	 */
	public void cadastrar(String t, String a, String c, String s, String i, double p, double tam, int pag, int ano,
			String nomeEditora) {

		// gerar id
		int idNovo = 0;
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.getIdEbook() == idNovo) {
				idNovo += 1;
				continue;
			}
		}

		// acessa o banco de dados, encontra a editora e acrescenta um ebook
		for (Editora edit : Dados.getEditoras()) {
			if (edit.getNome() == nomeEditora) {
				Editora editora = edit;
				Ebook ebook = new Ebook(idNovo, t, a, s, c, i, p, tam, pag, ano, editora);
				Dados.getEbooks().add(ebook);
			}
		}

	}

	/**
	 * Exclui um ebook do sistema
	 * 
	 * @param nomeEbook nome do ebook a ser deletado
	 * @return
	 */
	public static boolean excluirEbook(String nomeEbook) {
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.getTitulo().equals(nomeEbook)) {
				Dados.getEbooks().remove(edit);
				return true;
			}
		}
		return false;
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
