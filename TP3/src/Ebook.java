import java.util.Scanner;

public class Ebook {

	private String nomeEbook;
	private String autor;
	private String categoria;
	private String sinopse;
	private String idioma;
	private int idEbook;
	private double preco;
	private double tamanhoArquivo;
	private int paginas;
	private int anoPublicacao;
	private Editora infoEditora;

	public Ebook(int id, String nome, String a, String c, String s, String i, double p, double tam, int pag, int ano,
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

	@Override
	public String toString() {
		return "Ebook: " + this.nomeEbook +
				"\nAutor: " + this.autor +
				"\nCategoria: " + this.categoria +
				"\nSinopse: " + this.sinopse +
				"\nIdioma: " + this.idioma +
				"\nPreco: " + this.preco +
				"\nTamanho do arquivo: " + this.tamanhoArquivo +
				"\nPaginas: " + this.paginas +
				"\nAno de publicacao: " + this.anoPublicacao +
				"\nEditora: " + this.infoEditora.nome;
	}

	public static Ebook cadastrar() {
		Scanner ler = new Scanner(System.in);
		Editora infoEditora = null;
		String nomeEbook, autor, categoria, sinopse, nomeEditora, idioma;
		double tamanhoArquivo, preco;
		int anoPublicacao, paginas;

		System.out.println("Digite o nome do Ebook: ");
		nomeEbook = ler.nextLine();

		System.out.println("Digite o autor do Ebook: ");
		autor = ler.nextLine();

		System.out.println("Digite a categoria do Ebook: ");
		categoria = ler.nextLine();

		System.out.println("Digite a sinopse do Ebook: ");
		sinopse = ler.nextLine();

		System.out.println("Digite o idioma em que o Ebook esta disponivel(unico): ");
		idioma = ler.nextLine();

		System.out.println("Digite qual a Editora: ");
		nomeEditora = ler.nextLine();
		boolean achou = false;
		for (Editora edit : Dados.getEditoras()) {
			if (nomeEditora.equals(edit.nome)) {
				infoEditora = edit;
				achou = true;
			}
		}
		if (achou == false) {
			System.out.println("Aviso: esta editora nao foi cadastrada");
		}

		System.out.println("Digite o tamanho do Arquivo: ");
		tamanhoArquivo = ler.nextDouble();

		System.out.println("Digite o preco do Ebook: ");
		preco = ler.nextDouble();

		System.out.println("Digite o ano de publicacao: ");
		anoPublicacao = ler.nextInt();

		System.out.println("Digite o numero de paginas: ");
		paginas = ler.nextInt();

		// gerar id
		int idEbookNovo = 0;
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.idEbook == idEbookNovo) {
				idEbookNovo += 1;
				continue;
			}
		}

		Ebook Ebook = new Ebook(idEbookNovo, nomeEbook, autor, categoria, sinopse, idioma, preco, tamanhoArquivo,
				paginas, anoPublicacao, infoEditora);
		Dados.getEbooks().add(Ebook);
		return Ebook;
	}

	public static void excluirEbook() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do Ebook: ");
		String opcaoString = ler.next();
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.nomeEbook.equals(opcaoString)) {
				Dados.getEbooks().remove(edit);
				break;
			}
		}
	}

	public static void buscarEbook(Cliente cliente) {
		Scanner ler = new Scanner(System.in);
		String opcaoString;
		int opcao;
		System.out.println("- Buscar Ebooks -");
		System.out.println("Digite o nome do ebook: ");
		boolean achou = false;
		opcaoString = ler.next();
		for (Ebook edit : Dados.getEbooks()) {
			if (opcaoString.equals(edit.getNomeEbook())) { // encontrou o ebook
				System.out.println(
						"Ebook encontrado!\n\n" + edit + "\n\nVoce deseja: \n" + "1. Adicionar ao carrinho\n"
								+ "2. Cancelar busca");
				achou = true;
				opcao = ler.nextInt();
				if (opcao == 1) {
					cliente.adicionarCarrinho(edit, cliente.getCarrinho());
					System.out.println("Adicionado com sucesso\n");
				} else if (opcao == 2) {
					System.out.println("Busca cancelada");
				} else {
					System.out.println("Opcao Invalida");
				}
			}
		}
		if (achou == false) {
			System.out.println("Opcao nao existe\n");
		}
	}

	public int getIdEbook() {
		return idEbook;
	}

	public void setIdEbook(int idEbook) {
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
}
