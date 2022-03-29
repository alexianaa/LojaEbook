package modelo;

public class Ebook {

	private String titulo;
	private String autor;
	private String categoria;
	private String sinopse;
	private String idioma;
	private int idEbook;
	private double valorLivro;
	private double tamanhoArquivo;
	private int numPaginas;
	private int anoPublicacao;
	private Editora infoEditora;

	public Ebook(int id, String t, String a, String c, String s, String i, double p, double tam, int pag, int ano,
			Editora info) {
		idEbook = id;
		titulo = t;
		autor = a;
		categoria = c;
		sinopse = s;
		idioma = i;
		valorLivro = p;
		tamanhoArquivo = tam;
		numPaginas = pag;
		anoPublicacao = ano;
		infoEditora = info;
	}

	@Override
	public String toString() {
		return "Ebook: " + this.titulo +
				"\nAutor: " + this.autor +
				"\nCategoria: " + this.categoria +
				"\nSinopse: " + this.sinopse +
				"\nIdioma: " + this.idioma +
				"\nPreco: " + this.valorLivro +
				"\nTamanho do arquivo: " + this.tamanhoArquivo +
				"\nQuantidade de paginas: " + this.numPaginas +
				"\nAno de publicacao: " + this.anoPublicacao +
				"\nEditora: " + this.infoEditora.nome;
	}

	public int getIdEbook() {
		return idEbook;
	}

	public void setIdEbook(int idEbook) {
		this.idEbook = idEbook;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public double getValorLivro() {
		return valorLivro;
	}

	public void setValorLivro(double valor) {
		this.valorLivro = valor;
	}

	public double getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(double tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setPaginas(int paginas) {
		this.numPaginas = paginas;
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
