package model;

public class Carrinho {

	private double valorTotal;
	private int quantidadeEbooks;
	private Ebook[] ebooks = new Ebook[50];
	private Venda venda;

	public Carrinho(double p, int quant, Ebook ebook, Venda v) {
		this.valorTotal = p;
		this.quantidadeEbooks = quant;
		this.ebooks[0] = ebook;
		this.venda = v;
	}

	@Override
	public String toString() {
		return "Total: " + this.valorTotal +
				"\nQuantidade de ebooks: " + this.quantidadeEbooks;
	}

	public double getvalorTotal() {
		return valorTotal;
	}

	public void setvalorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantidadeEbooks() {
		return quantidadeEbooks;
	}

	public void setQuantidadeEbooks(int quantidadeEbooks) {
		this.quantidadeEbooks = quantidadeEbooks;
	}

	public Ebook[] getEbooks() {
		return ebooks;
	}

	public void setEbooks(Ebook[] ebooks) {
		this.ebooks = ebooks;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
}
