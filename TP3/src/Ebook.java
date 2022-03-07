
public class Ebook {
	
	private int idEbook;
	private String nomeEbook;
	private String autor;
	private String categoria; 
	private String sinopse;
	private String idioma;
	private double preco;
	private double tamanhoArquivo;
	private int paginas;
	private int anoPublicacao;
	private Editora infoEditora;
	
	public Ebook(int id, String nome, String a, String c, String s, String i, double p, double tam, int pag, int ano, Editora info) {
		idEbook = id;
		nomeEbook = nome;
		autor = a;
		categoria = c;
		sinopse = s;
		idioma = i;
		preco = p;
		tamanhoArquivo = tam;
		paginas = pag;
		anoPublicacao = ano;
		infoEditora = info;
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
	
	public void visualizarEbook(Ebook ebook) {
		 System.out.printf("Ebook: " + ebook.nomeEbook + "\n" + "Editora: " + ebook.infoEditora.nome + "\n");
	}
}
