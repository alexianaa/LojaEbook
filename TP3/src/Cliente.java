import java.util.Date;

public class Cliente extends Entidade {
	private Date dataNascimento;
	private int cpf;
	private String g�nero;
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
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
}
