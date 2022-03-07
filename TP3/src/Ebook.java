
public class Ebook {
	
	private String idEbook;
	private String nomeEbook;
	private String autor;
	private String categoria; 
	private String sinopse;
	private String idioma;
	private double preco;
	private double tamanhoArquivo;
	private int paginas;
	private int anoPublicação;
	private Editora infoEditora;
	
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
	public int getAnoPublicação() {
		return anoPublicação;
	}
	public void setAnoPublicação(int anoPublicação) {
		this.anoPublicação = anoPublicação;
	}
	public Editora getInfoEditora() {
		return infoEditora;
	}
	public void setInfoEditora(Editora infoEditora) {
		this.infoEditora = infoEditora;
	}
}
