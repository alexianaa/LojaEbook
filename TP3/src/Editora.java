
public class Editora extends Entidade {

	private String cnpj;
	private String dataAfiliacao;

	public Editora(String n, String e, String i, Telefone num, String c, String d) {
		this.nome = n;
		this.email = e;
		this.id = i;
		this.numCel = num;
		this.cnpj = c;
		this.dataAfiliacao = d;
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
	
	public static void cadastrarEditora(){
		
	}
	
	public static void excluirEditora(){
		
	}

	public void VisualizarEditora(Editora ebookEditora) {
		System.out.println("Editora:      " + ebookEditora.nome + "\n" +
				"Email:        " + ebookEditora.email + "\n" +
				"Telefone:     " + Telefone.VisualizarTelefone(numCel) + "\n" +
				"CNPJ:         " + ebookEditora.cnpj + "\n" +
				"Afiliacao em: " + ebookEditora.dataAfiliacao + "\n");
	}
}
