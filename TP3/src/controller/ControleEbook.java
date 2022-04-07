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

	public static String[] infoEbook(String titulo) {
		String[] ebook = new String[7];

		for (Ebook edit : Dados.getEbooks()) {
			if (edit.getTitulo().equals(titulo)) {
				Double tamanhoArquivo = edit.getTamanhoArquivo();
				Double valor = edit.getValorLivro();
				Integer anoPublicacao = edit.getanoPublicacao();
				Integer numPaginas = edit.getNumPaginas();
				ebook[0] = edit.getCategoria();
				ebook[1] = edit.getAutor();
				ebook[2] = edit.getIdioma();
				ebook[3] = numPaginas.toString();
				ebook[4] = valor.toString();
				ebook[5] = anoPublicacao.toString();
				ebook[6] = tamanhoArquivo.toString();
			}
		}
		return ebook;
	}

	public static boolean existeEbook(String c) {
		for (Ebook edit : Dados.getEbooks()) {
			if (edit.getTitulo().equals(c)) {
				return true;
			}
		}
		return false;
	}
}
