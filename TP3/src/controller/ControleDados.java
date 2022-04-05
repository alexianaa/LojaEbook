package controller;

import java.util.ArrayList;

import model .*;

public class ControleDados {
	
	private Dados d = new Dados();

	public ControleDados(){
		d.preencher();
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public static ArrayList<Cliente> getClientes(){
		return Dados.getClientes();
	}

	public static ArrayList<Ebook> getEbooks(){
		return Dados.getEbooks();
	}

	public static ArrayList<Editora> getEditoras(){
		return Dados.getEditoras();
	}

	public String[] showNames(){
		String[] names = new String[Dados.getClientes().size()];
		for (Cliente edit : Dados.getClientes()) {
			names[Dados.getClientes().indexOf(edit)] = edit.getNome();
		}
		return names;
	}

}
