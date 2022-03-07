
public class Editora extends Entidade {

	private String cnpj;
	private String dataAfiliacao;

	public Editora(String n, String e, String i, Telefone num, String c, String d) {
		nome = n;
		email = e;
		id = i;
		numCel = num;
		cnpj = c;
		dataAfiliacao = d;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDataAfiliacao() {
		return dataAfiliacao;
	}

	public void setDataAfiliacao(String dataAfiliacao) {
		this.dataAfiliacao = dataAfiliacao;
	}

	public void VisualizarEditora(Editora ebookEditora) {
		System.out.println("Editora:      " + ebookEditora.nome + "\n" +
				"Email:        " + ebookEditora.email + "\n" +
				"Telefone:     " + Telefone.VisualizarTelefone(numCel) + "\n" +
				"CNPJ:         " + ebookEditora.cnpj + "\n" +
				"Afiliacao em: " + ebookEditora.dataAfiliacao + "\n");
	}
}
