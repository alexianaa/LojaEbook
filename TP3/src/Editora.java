import java.util.Date;

public class Editora extends Entidade {
	
	private String cnpj;
	private Date dataAfiliacao;
	
	public Editora(String n, String e, String i, Telefone num, String c, Date d) {
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
	
	public Date getDataAfiliacao() {
		return dataAfiliacao;
	}
	
	public void setDataAfiliação(Date dataAfiliacao) {
		this.dataAfiliacao = dataAfiliacao;
	}
	
	public void VisualizarEditora(Editora ebookEditora) {
		System.out.println("Editora:      " + ebookEditora.nome   + "\n" + 
							"Email:        " + ebookEditora.email  + "\n" +
							"Telefone:     " + Telefone.VisualizarTelefone(numCel) + "\n" +
							"CNPJ:         " + ebookEditora.cnpj   + "\n" +
							"Afiliação em: " + ebookEditora.dataAfiliacao + "\n"
						  );
	}
}
