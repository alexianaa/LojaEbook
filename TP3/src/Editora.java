import java.util.Scanner;

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

	public static Editora cadastrarEditora() {
		Scanner ler = new Scanner(System.in);
		String nome, email, cnpj, numero, dataAfiliacao;

		System.out.println("Digite o nome da Editora: ");
		nome = ler.next();

		System.out.println("Digite o email da editora: ");
		email = ler.next();

		System.out.println("Digite o ddd do numero da editora: ");
		int ddd = ler.nextInt();

		System.out.println("Digite o numero da editora: ");
		numero = ler.next();

		System.out.println("Digite o cnpj: ");
		cnpj = ler.next();

		System.out.println("Digite a data de hoje dd/mm/yyyy: ");
		dataAfiliacao = ler.next();

		Telefone num = new Telefone(ddd, numero);

		// gerar id
		String idNovoEditora = "0";
		for (Editora edit : Dados.getEditoras()) {
			if (edit.id.equals(idNovoEditora)) {
				idNovoEditora += 1;
				continue;
			}
		}

		Editora editora = new Editora(nome, email, idNovoEditora, num, cnpj, dataAfiliacao);
		Dados.getEditoras().add(editora);
		return editora;
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
