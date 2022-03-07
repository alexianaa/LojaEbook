
public class Cliente extends Entidade {

	private String dataNascimento;
	private String cpf;
	private String genero;

	public Cliente(String n, String e, String i, Telefone num, String d, String c, String g) {
		nome = n;
		email = e;
		id = i;
		numCel = num;
		dataNascimento = d;
		cpf = c;
		genero = g;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void visualizarCliente(Cliente cliente) {
		System.out.println("cliente: " + cliente.nome + "\n");
	}

}
