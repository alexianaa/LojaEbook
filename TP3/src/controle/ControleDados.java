package controle;

import modelo.*;

public class ControleDados {
	
	private Dados d = new Dados();

	public ControleDados(){
		d.preencher();
	}

	public void setDados(Dados d) {
		this.d = d;
	}

}
