package model;

public class Carrinho {

	private double valorTotal;
	private int quantidadeEbooks;
	private Ebook[] ebooks = new Ebook[50];

	/**
	 * Cria um carrinho
	 * 
	 * @param p     - soma do valor de todos os ebooks do carrinho
	 * @param quant - quantidade de ebooks no carrinho
	 * @param ebook - array de ebooks
	 */
	public Carrinho(double p, int quant, Ebook[] ebook) {
		this.valorTotal = p;
		this.quantidadeEbooks = quant;
		this.ebooks = ebook;
	}

	@Override
	public String toString() {
		return "Total: " + this.valorTotal + "\nQuantidade de ebooks: " + this.quantidadeEbooks;
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

}
