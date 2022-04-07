package controller;

import model.*;

public class ControleEbook {

	public static void cadastrar() {
		/*
		 * Scanner ler = new Scanner(System.in);
		 * Editora infoEditora = null;
		 * String nomeEbook, autor, categoria, sinopse, nomeEditora, idioma;
		 * double tamanhoArquivo, preco;
		 * int anoPublicacao, paginas;
		 * 
		 * System.out.println("Digite o nome do Ebook: ");
		 * nomeEbook = ler.nextLine();
		 * 
		 * System.out.println("Digite o autor do Ebook: ");
		 * autor = ler.nextLine();
		 * 
		 * System.out.println("Digite a categoria do Ebook: ");
		 * categoria = ler.nextLine();
		 * 
		 * System.out.println("Digite a sinopse do Ebook: ");
		 * sinopse = ler.nextLine();
		 * 
		 * System.out.println("Digite o idioma em que o Ebook esta disponivel(unico): "
		 * );
		 * idioma = ler.nextLine();
		 * 
		 * System.out.println("Digite qual a Editora: ");
		 * nomeEditora = ler.nextLine();
		 * boolean achou = false;
		 * for (Editora edit : Dados.getEditoras()) {
		 * if (nomeEditora.equals(edit.nome)) {
		 * infoEditora = edit;
		 * achou = true;
		 * }
		 * }
		 * if (achou == false) {
		 * System.out.println("Aviso: esta editora nao foi cadastrada");
		 * }
		 * 
		 * System.out.println("Digite o tamanho do Arquivo: ");
		 * tamanhoArquivo = ler.nextDouble();
		 * 
		 * System.out.println("Digite o preco do Ebook: ");
		 * preco = ler.nextDouble();
		 * 
		 * System.out.println("Digite o ano de publicacao: ");
		 * anoPublicacao = ler.nextInt();
		 * 
		 * System.out.println("Digite o numero de paginas: ");
		 * paginas = ler.nextInt();
		 * 
		 * // gerar id
		 * int idEbookNovo = 0;
		 * for (Ebook edit : Dados.getEbooks()) {
		 * if (edit.idEbook == idEbookNovo) {
		 * idEbookNovo += 1;
		 * continue;
		 * }
		 * }
		 * 
		 * Ebook Ebook = new Ebook(idEbookNovo, nomeEbook, autor, categoria, sinopse,
		 * idioma, preco, tamanhoArquivo,
		 * paginas, anoPublicacao, infoEditora);
		 * Dados.getEbooks().add(Ebook);
		 * return Ebook;
		 */
	}

	public static void excluirEbook() {
		/*
		 * Scanner ler = new Scanner(System.in);
		 * System.out.println("Digite o nome do Ebook: ");
		 * String opcaoString = ler.next();
		 * for (Ebook edit : Dados.getEbooks()) {
		 * if (edit.nomeEbook.equals(opcaoString)) {
		 * Dados.getEbooks().remove(edit);
		 * break;
		 * }
		 * }
		 */
	}

	public static void buscarEbook(Cliente cliente) {
		/*
		 * Scanner ler = new Scanner(System.in);
		 * String opcaoString;
		 * int opcao;
		 * System.out.println("- Buscar Ebooks -");
		 * System.out.println("Digite o nome do ebook: ");
		 * boolean achou = false;
		 * opcaoString = ler.next();
		 * for (Ebook edit : Dados.getEbooks()) {
		 * if (opcaoString.equals(edit.getNomeEbook())) { // encontrou o ebook
		 * System.out.println(
		 * "Ebook encontrado!\n\n" + edit + "\n\nVoce deseja: \n" +
		 * "1. Adicionar ao carrinho\n"
		 * + "2. Cancelar busca");
		 * achou = true;
		 * opcao = ler.nextInt();
		 * if (opcao == 1) {
		 * cliente.adicionarCarrinho(edit, cliente.getCarrinho());
		 * System.out.println("Adicionado com sucesso\n");
		 * } else if (opcao == 2) {
		 * System.out.println("Busca cancelada");
		 * } else {
		 * System.out.println("Opcao Invalida");
		 * }
		 * }
		 * }
		 * if (achou == false) {
		 * System.out.println("Opcao nao existe\n");
		 * }
		 */
	}

	public String[] showEbookTitulos() {
		String[] titulos = new String[Dados.getEbooks().size()];
		for (Ebook edit : Dados.getEbooks()) {
			titulos[Dados.getEbooks().indexOf(edit)] = edit.getTitulo();
		}
		return titulos;
	}
}
