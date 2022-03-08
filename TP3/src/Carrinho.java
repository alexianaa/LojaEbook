import java.util.Scanner;

public class Carrinho {
	private double preco;
	private int quantidadeEbooks;
	private Ebook[] ebooks = new Ebook[50];

	public Carrinho(double p, int quant, Ebook ebook) {
		this.preco = p;
		this.quantidadeEbooks = quant;
		this.ebooks[0] = ebook;
	}
	
	@Override
	public String toString() {
		return "Total: " + this.preco + 
				"\nQuantidade de ebooks: " + this.quantidadeEbooks;
	}

	public void adicionarEbook(Ebook ebook) {
		for (int i = 0; i < 50; i++) {
			if (ebooks[i] == null) {
				ebooks[i] = ebook;
				break;
			}
		}
	}
	
	public static void excluirEbook(Cliente cliente) {
		Scanner ler = new Scanner(System.in);
		String opcaoString;
		System.out.println("Digite o nome do ebook: ");
		boolean achou = false;
		opcaoString = ler.next();
		for(Ebook edit : cliente.getCarrinho().getEbooks()) { // olha os ebooks do carrinho
			if(edit != null && edit.getNomeEbook().equals(opcaoString)) { // se o espaco nao for vazio efor igual ao ebook selecionado
				deletar(cliente.getCarrinho(),edit);
				System.out.println("Ebook exluido do carrinho\n");
				achou = true;
			}
		}
		if(achou == false) {
			System.out.println("Ebook nao localizado");
		}
	}
	
	public static void deletar(Carrinho carrinho, Ebook ebook) {
		for(int i = 0; i < 50; i++) {
			if(carrinho.ebooks[i] == ebook) {
				carrinho.ebooks[i] = null;
			}
		}
	}

	public static void mostrarEbooks(Cliente cliente) {
		for(Ebook edit : cliente.getCarrinho().getEbooks()) {
			if(edit != null) {
				System.out.println(edit + "\n");
			}
		}
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

	
}
