import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processo {
	static Scanner ler = new Scanner(System.in);
	static int opcao;
	static String opcaoString;

	public static void main(String[] args) {
		preencher();
		System.out.println("-----Ja tem cadastro?-----");
		System.out.println("1. Sim\n" + "2. Nao");
		System.out.println("--------------------------");
		opcao = ler.nextInt();

		if (opcao == 1) { // login
			System.out.println("- Digite o nome de usuario -");
			opcaoString = ler.next();
			for (Cliente edit : Dados.getClientes()) {
				if (edit.nome.equals(opcaoString)) {
					menuInicial(edit, 0);
				}
			}
		} else if (opcao == 2) { // cadastro
			System.out.println("- Realizar cadastro -");
			Cliente cliente = Cliente.cadastrarCliente();
			menuInicial(cliente, 0);
		} else {
			System.out.println("- Opcao invalida -");
		}

	}

	public static void menuInicial(Cliente cliente, int opcao) {
		System.out.println("--------Menu--------");
		System.out.println("1. Ebooks\n" + "2. Carrinho\n" + "3. Gerenciar Clientes\n" + "4. Gerenciar Editoras\n"
				+ "5. Sair da loja");
		System.out.println("--------------------");
		opcao = ler.nextInt();

		if (opcao == 1) {
			comprarEbook(cliente);
		} else if (opcao == 2) {
			if (cliente.getCarrinho().getQuantidadeEbooks() == 0) {
				System.out.println("Nao ha ebooks no carrinho");
			} else { // menu do carrinho
				System.out.println("---- Carrinho -----");
				System.out.println(
						"1. Mostrar ebooks\n" + "2. Excluir Ebook\n" + "3. Finalizar compra\n" + "3. Cancelar compra");
				System.out.println("-------------------");
				opcao = ler.nextInt();
				if (opcao == 1) { // mostra os ebooks no carrinho
					Carrinho.mostrarEbooks(cliente);
				} else if (opcao == 2) { // exclui o ebook selecionado
					Carrinho.excluirEbook(cliente);
				} else if (opcao == 3) { // ir para venda
					System.out.println("- Finalizar compra -");
					System.out.println("Redirecionando para venda...");
					Venda.processoVenda(cliente);
				} else {
					System.out.println("Opcao invalida");
				}

			}
		} else if (opcao == 3) {
			gerenciar(cliente);
		} else if (opcao == 4) {
			gerenciar();
		} else if (opcao == 5) {
			System.out.println("- Sair -");
			return;
		} else {
			System.out.println("Opcao invalida");
		}

		menuInicial(cliente, opcao);

	}

	public static void gerenciar() {
		System.out.println("- Gerenciar editoras -");
		System.out.println("1. listar editoras");
		System.out.println("2. Buscar editoras");
		System.out.println("3. Cadastrar editoras");
		System.out.println("4. Excluir editoras");
		System.out.println("5. Ver os perfis das editoras");
		opcao = ler.nextInt();

		if (opcao == 1) {
			System.out.println("- Listar Editoras -");
			for (Editora edit : Dados.getEditoras()) {
				System.out.println(edit.getNomeEditora());
			}
		} else if (opcao == 2) {
			System.out.println("- Buscar Editora -");
			Editora.buscarEditora();
		} else if (opcao == 3) {
			System.out.println("- Cadastrar Editora -");
			Editora.cadastrar();
		} else if (opcao == 4) {
			System.out.println("- Excluir Editora -");
			Editora.excluirEditora();
		} else if (opcao == 5) {
			System.out.println("- Listar os perfis das Editoras -");
			for (Editora edit : Dados.getEditoras()) {
				System.out.println("\n" + edit + "\n");
			}
		} else {
			System.out.println("Opcao invalida");
		}
	}

	public static void gerenciar(Cliente cliente) {
		System.out.println("- Gerenciar clientes -");
		System.out.println("1. ver clientes");
		System.out.println("2. cadastrar cliente");
		System.out.println("3. Excluir cliente ");
		System.out.println("4. Ver perfis dos clientes");
		opcao = ler.nextInt();

		if (opcao == 1) {
			System.out.println("- Listar Clientes -");
			for (Cliente edit : Dados.getClientes()) {
				System.out.println(edit.getNomeCliente());
			}
		} else if (opcao == 2) {
			System.out.println("- Cadastrar cliente -");
			Cliente.cadastrarCliente();
		} else if (opcao == 3) {
			System.out.println("- Excluir cliente -");
			Cliente.excluirCliente();
		} else if (opcao == 4) {
			System.out.println("- Listar Perfis de Clientes -");
			for (Cliente edit : Dados.getClientes()) {
				System.out.println("\n" + edit + "\n");
			}
		} else {
			System.out.println("Opcao invalida\n");
		}
	}

	public static void comprarEbook(Cliente cliente) {
		// menu de compra
		System.out.println("------  Ebooks  ------");
		System.out.println("1. Listar Ebooks\n" + "2. Buscar Ebooks\n" + "3. Cadastrar Ebooks\n" + "4. Excluir Ebooks\n"
				+ "5. Finalizar compra\n"
				+ "6. Especificacoes dos Ebooks\n" + "7. Voltar");
		System.out.println("----------------------\n");
		opcao = ler.nextInt();

		if (opcao == 1) {
			System.out.println("- Listar Ebooks -");
			for (Ebook edit : Dados.getEbooks()) {
				System.out.println(edit.getNomeEbook());
			}
			comprarEbook(cliente);
		} else if (opcao == 2) {
			Ebook.buscarEbook(cliente);
			comprarEbook(cliente);
		} else if (opcao == 3) {
			System.out.println("- Cadastrar Ebook -");
			Ebook.cadastrar();
			comprarEbook(cliente);
		} else if (opcao == 4) {
			System.out.println("- Excluir Ebook -");
			Ebook.excluirEbook();
			comprarEbook(cliente);
		} else if (opcao == 5) {
			System.out.println("- Finalizar compra -");
			System.out.println("Redirecionando para venda...");
			Venda.processoVenda(cliente);
			comprarEbook(cliente);
		} else if (opcao == 6) {
			System.out.println("- Especificacoes dos Ebooks -");
			for (Ebook edit : Dados.getEbooks()) {
				System.out.println("\n" + edit + "\n");
				comprarEbook(cliente);
			}
		} else if (opcao == 7) {

		} else {
			System.out.println("Opcao Invalida");
			comprarEbook(cliente);
		}
	}

	public static void preencher() {
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		// cria as editoras
		Telefone num = new Telefone(82, "988454163");
		String date = simpleDateFormat.format(new Date());
		Editora arqueiro = new Editora("arqueiro", "arqueiro@gmail.com", 0, num, "4382974829843", date);
		Dados.getEditoras().add(arqueiro);

		Telefone num1 = new Telefone(61, "987569520");
		String date1 = simpleDateFormat.format(new Date());
		Editora Rocco = new Editora("Rocco", "Rocco@gmail.com", 1, num1, "5784374820233", date1);
		Dados.getEditoras().add(Rocco);

		Telefone num2 = new Telefone(61, "987569520");
		String date2 = simpleDateFormat.format(new Date());
		Editora Sextante = new Editora("Sextante", "Sextante@gmail.com", 2, num2, "5788425974233", date2);
		Dados.getEditoras().add(Sextante);

		// cria 5 ebooks para as 3 editoras
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				Ebook ebook = new Ebook(j, "ebook" + i + j, "autor" + i + j, "categoria" + i + j, "sinopse" + i + j,
						"idioma" + i + j, 50.0, 150.0 + i + j, 350 + i + j, 2012 + i + j, Dados.getEditoras().get(i));
				Dados.getEbooks().add(ebook);
			}
		}

		// cria 3 clientes
		for (int a = 0; a < 3; a++) {
			Telefone num3 = new Telefone(61 + a, "num" + a);
			String date3 = simpleDateFormat.format(new Date());
			Venda venda = new Venda("", 0);
			Carrinho carrinho = new Carrinho(0.0, 0, null, venda);
			Cliente cliente = new Cliente("nome" + a, "email" + a, a, num3, date3, "10578932564" + a,
					"genero" + a, carrinho);
			Dados.getClientes().add(cliente);
		}

	}

}
