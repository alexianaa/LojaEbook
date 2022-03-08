
public class Telefone {
	private int ddd;
	private String celular;
	
	public Telefone(int i, String j) {
		this.ddd = i;
		this.celular = j;
	}
	
	@Override
	public String toString() {
		return "("  + this.ddd + ")" + this.celular;
	}
	
	public static String visualizarTelefone(Telefone num) {
		String cel = "(" + num.ddd + ")" + num.celular;
		return cel;
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
