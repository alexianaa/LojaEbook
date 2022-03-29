package modelo;

public class Cliente extends Entidade {

	private String dataNascimento;
	private String cpf;
	private Carrinho carrinho;

	public Cliente(){
		super();
	}

	public Cliente(String n, String e, int i, Telefone num, String d, String c, Carrinho car) {
		this.nome = n;
		this.email = e;
		this.id = i;
		this.numCel = num;
		dataNascimento = d;
		cpf = c;
		carrinho = car;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome +
				"\nEmail: " + this.email +
				"\nTelefone: " + this.numCel +
				"\nData de nascimento: " + this.dataNascimento +
				"\nCPF: " + this.cpf +
				"\nCarrinho: " + this.carrinho;
	}


	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
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
	
	public String getNomeCliente() {
		return nome;
	}

	public void setNomeCliente(String nome) {
		this.nome = nome;
	}

}
