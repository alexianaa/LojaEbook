
public class Carrinho {
	private double preco;
	private int quantidadeEbooks;
	private Ebook[] ebooks = new Ebook[50];

	public Carrinho(double p, int quant, Ebook ebook) {
		this.preco = p;
		this.quantidadeEbooks = quant;
		this.ebooks[0] = ebook;
	}
	
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

	public Ebook[] getEbooks() {
		return ebooks;
	}

	public void setEbooks(Ebook[] ebooks) {
		this.ebooks = ebooks;
	}
	
	public static void excluirEbook(Ebook ebook) {
	
	}
	
	public static void visualizarItems(Carrinho carrinho) {
		for(int i = 0; i == carrinho.ebooks.length; i++) {
			System.out.println(carrinho.ebooks.toString());
		}
	}	

	public void adicionarEbook(Ebook ebook) {
		for(int i = 0; i < 50; i++) {
			if(ebooks[i] == null) {				
				ebooks[i] = ebook;
				break;
			}
		}
	}
	
}
