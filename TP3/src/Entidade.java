
public abstract class Entidade {

	protected String nome;
	protected String email;
	protected int id;
	protected Telefone numCel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Telefone getNumCel() {
		return numCel;
	}

	public void setNumCel(Telefone numCel) {
		this.numCel = numCel;
	}

}
