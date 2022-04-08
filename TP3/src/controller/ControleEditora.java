package controller;

import model.Dados;
import model.Editora;

public class ControleEditora {

	public static Editora editora;
	public int qtdEditoras = Dados.getEditoras().size();

	public ControleEditora() {

	}

	/**
	 * Cadastra uma editora no sistema
	 */
	public void cadastrar() {

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
