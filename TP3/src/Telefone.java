
public class Telefone {
	private int ddd;
	private String celular;
	
	public Telefone(int i, String j) {
		this.ddd = i;
		this.celular = j;
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
	
	public static String VisualizarTelefone(Telefone num) {
		String cel = "(" + num.ddd + ")" + num.celular;
		return cel;
	}
}
