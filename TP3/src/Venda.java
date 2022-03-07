import java.util.Scanner;

public class Venda {
	private String formaPagamento;
	private double preco;
	private Carrinho carrinho;

	public Venda() {
		super();
		double p = 2.22;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite a forma de pagamento (credito ou debito)");
		String f = ler.nextLine();
		switch (f) {
			case "credito":
				this.formaPagamento = f;
				System.out.println(carrinho + "\n" + f + "\n" + "R$" + p);
				System.out.println("deseja confirmar a compra? 1. Sim 2.Nao");
				int k = ler.nextInt();
				switch (k) {
					case 1:
						System.out.println("compre efetuada! volte sempre!");
						break;
					case 2:
						System.out.println("compra cancelada");
						break;
					default:
						System.out.println("opção inválida");

						break;
				}
				break;
			case "debito":
				this.formaPagamento = f;
				System.out.println(carrinho + "\n" + f + "\n" + "R$" + p);
				System.out.println("deseja confirmar a compra? 1. Sim 2.Nao");
				int k2 = ler.nextInt();
				switch (k2) {
					case 1:
						System.out.println("compre efetuada! volte sempre!");
						break;
					case 2:
						System.out.println("compra cancelada");
						break;
					default:
						System.out.println("opção inválida");
						break;
				}
				break;
			default:
				System.out.println("operacao invalida");
				return;
		}

	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
}
