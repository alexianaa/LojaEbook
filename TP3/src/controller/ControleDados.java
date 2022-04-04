package controller;

import model.*;

public class ControleDados {

	private Dados d = new Dados();

	public ControleDados() {
		d.preencher();
	}

	public void setDados(Dados d) {
		this.d = d;
	}

}
