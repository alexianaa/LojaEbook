import java.util.Scanner;

public class Ebook {

	private String nomeEbook;
	private String autor;
	private String categoria;
	private String sinopse;
	private String idioma;
	private String idEbook;
	private double preco;
	private double tamanhoArquivo;
	private int paginas;
	private int anoPublicacao;
	private Editora infoEditora;

	public Ebook(String id, String nome, String a, String c, String s, String i, double p, double tam, int pag, int ano,
			Editora info) {
		this.idEbook = id;
		this.nomeEbook = nome;
		this.autor = a;
		this.categoria = c;
		this.sinopse = s;
		this.idioma = i;
		this.preco = p;
		this.tamanhoArquivo = tam;
		this.paginas = pag;
		this.anoPublicacao = ano;
		this.infoEditora = info;
	}

	public static Ebook cadastrarEbook() {
		Scanner ler = new Scanner(System.in);
		String nomeEbook, autor, categoria, sinopse, idioma;
		double tamanhoArquivo, preco;
		int anoPublicacao, paginas;

		System.out.println("Digite o nome do Ebook: ");
		nomeEbook = ler.next();

		System.out.println("Digite o autor do Ebook: ");
		autor = ler.next();

		System.out.println("Digite a categoria do Ebook: ");
		categoria = ler.next();

		System.out.println("Digite a sinopse do Ebook: ");
		sinopse = ler.next();

		System.out.println("Digite o idioma em que o Ebook esta disponivel(unico): ");
		idioma = ler.next();

		System.out.println("Digite qual a Editora: ");
		Editora infoEditora = new Editora("0", "0", "0", null, "0", "0");

		System.out.println("Digite o tamanho do Arquivo: ");
		tamanhoArquivo = ler.nextDouble();

		System.out.println("Digite o preco do Ebook: ");
		preco = ler.nextDouble();

		System.out.println("Digite o tamanho do Arquivo: ");
		anoPublicacao = ler.nextInt();

		System.out.println("Digite o numero de paginas: ");
		paginas = ler.nextInt();

		// gerar id
		String idEbookNovo = "0";
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.idEbook.equals(idEbookNovo)) {
				idEbookNovo += 1;
				continue;
			}
		}

		Ebook Ebook = new Ebook(idEbookNovo, nomeEbook, autor, categoria, sinopse, idioma, preco, tamanhoArquivo,
				paginas, anoPublicacao, infoEditora);
		Dados.getEbooks().add(Ebook);
		return Ebook;
	}

	public String getIdEbook() {
		return idEbook;
	}

	public void setIdEbook(String idEbook) {
		this.idEbook = idEbook;
	}

	public String getNomeEbook() {
		return nomeEbook;
	}

	public void setNomeEbook(String nomeEbook) {
		this.nomeEbook = nomeEbook;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(double tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getanoPublicacao() {
		return anoPublicacao;
	}

	public void setanoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Editora getInfoEditora() {
		return infoEditora;
	}

	public void setInfoEditora(Editora infoEditora) {
		this.infoEditora = infoEditora;
	}

	public void visualizarEbook(Ebook ebook) {
		System.out.println("Ebook: " + ebook.nomeEbook + "\n" + "Editora: " + ebook.infoEditora.nome + "\n");
	}
}
