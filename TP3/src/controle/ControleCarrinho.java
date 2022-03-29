package controle;

public class ControleCarrinho {

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
		for (Ebook edit : cliente.getCarrinho().getEbooks()) { // olha os ebooks do carrinho
			if (edit != null && edit.getNomeEbook().equals(opcaoString)) { // se o espaco nao for vazio efor igual ao
																			// ebook selecionado
				deletar(cliente.getCarrinho(), edit);
				System.out.println("Ebook exluido do carrinho\n");
				achou = true;
			}
		}
		if (achou == false) {
			System.out.println("Ebook nao localizado");
		}
	}

	public static void deletar(Carrinho carrinho, Ebook ebook) {
		for (int i = 0; i < 50; i++) {
			if (carrinho.ebooks[i] == ebook) {
				carrinho.ebooks[i] = null;
			}
		}
	}

	public static void mostrarEbooks(Cliente cliente) {
		for (Ebook edit : cliente.getCarrinho().getEbooks()) {
			if (edit != null) {
				System.out.println(edit + "\n");
			}
		}
	}

}
