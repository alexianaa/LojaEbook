import java.util.Date;

public class Cliente extends Entidade {
	
	private Date dataNascimento;
	private int cpf;
	private String gênero;
	
	public Cliente(String n, String e, String i, Telefone num) {
		nome = n;
		email = e;
		id = i;
		numCel = num;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getGênero() {
		return gênero;
	}
	
	public void setGênero(String gênero) {
		this.gênero = gênero;
	}
	
	
}
