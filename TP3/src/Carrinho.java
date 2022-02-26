
public class Carrinho {
	private double preco;
	private int quantidadeEbooks;
	private Cliente usuario;
	private Ebook[] ebooks = new Ebook[50];
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEbooks() {
		return quantidadeEbooks;
	}
	public void setQuantidadeEbooks(int quantidadeEbooks) {
		this.quantidadeEbooks = quantidadeEbooks;
	}
	public Cliente getUsuario() {
		return usuario;
	}
	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}
	public Ebook[] getEbooks() {
		return ebooks;
	}
	public void setEbooks(Ebook[] ebooks) {
		this.ebooks = ebooks;
	}
}
