package controller;

import model.Dados;
import model.Editora;
import model.Telefone;

public class ControleEditora {

	public static Editora editora;
	public int qtdEditoras = Dados.getEditoras().size();

	/**
	 * Cria um controle editora
	 */
	public ControleEditora() {

	}

	/**
	 * Cria uma editora e cadastra no sistema de dados
	 * 
	 * @param n   nome
	 * @param e   email
	 * @param ddd ddd do telefone
	 * @param num numero de telefone
	 * @param c   cnpj
	 * @param d   data de afiliacao
	 * @return boolean
	 */
	public boolean cadastrar(String n, String e, int ddd, String num, String c, String d) {

		Telefone telefone = new Telefone(ddd, num);

		// gerar id
		int idNovo = 0;
		for (Editora edit : Dados.getEditoras()) {
			if (edit.getId() == idNovo) {
				idNovo += 1;
				continue;
			}
		}

		Editora editora = new Editora(n, e, idNovo, telefone, c, d);
		Dados.getEditoras().add(editora);
		return true;
	}

	/**
	 * Exclui um ebook do sistema
	 * 
	 * @param nomeEditora nome da editora a ser deletada
	 * @return
	 */
	public static boolean excluirEditora(String nomeEditora) {
		for (Editora edit : Dados.getEditoras()) {
			if (edit.getNome().equals(nomeEditora)) {
				Dados.getEditoras().remove(edit);
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna as informacoes da editora selecionada
	 * 
	 * @param nome nome da editora a ser buscado
	 * @return String[]
	 */
	public static String[] infoEditora(String nome) {
		String[] editora = new String[5];

		for (Editora edit : Dados.getEditoras()) {
			if (edit.getNome().equals(nome)) {
				Integer id = edit.getId();

				editora[0] = edit.getEmail();
				editora[1] = edit.getNumCel().toString();
				editora[2] = edit.getCnpj();
				editora[3] = edit.getDataAfiliacao();
				editora[4] = id.toString();
			}
		}
		return editora;
	}

	/**
	 * Retorna se a Editora existe
	 * 
	 * @param n nome da editora
	 * @return boolean
	 */
	public static boolean existeEditora(String n) {
		for (Editora edit : Dados.getEditoras()) {
			if (edit.getNome().equals(n)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna uma string com o nome das editoras cadastradas
	 * 
	 * @return String[]
	 */
	public String[] showNames() {
		String[] names = new String[Dados.getEditoras().size()];
		for (Editora edit : Dados.getEditoras()) {
			names[Dados.getEditoras().indexOf(edit)] = edit.getNome();
		}
		return names;
	}

}
