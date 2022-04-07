package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Dados;
import model.Ebook;
import model.Editora;

public class ControleDados {

	private Dados d = new Dados();

	/**
	 * Cria os primeiros dados do sistema
	 */
	public ControleDados() {
		d.preencher();
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public static ArrayList<Cliente> getClientes() {
		return Dados.getClientes();
	}

	public static ArrayList<Ebook> getEbooks() {
		return Dados.getEbooks();
	}

	public static ArrayList<Editora> getEditoras() {
		return Dados.getEditoras();
	}

}
