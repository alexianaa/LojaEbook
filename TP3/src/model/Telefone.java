package model;

public class Telefone {
	private int ddd;
	private String celular;

	/**
	 * Cria um telefone
	 * 
	 * @param i - ddd
	 * @param j - numero do celular
	 */
	public Telefone(int i, String j) {
		this.ddd = i;
		this.celular = j;
	}

	@Override
	public String toString() {
		return "(" + this.ddd + ")" + this.celular;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}
