package controller;

// import model .*;

public class ControleEditora {

    public static void cadastrar() {
		/*
		Scanner ler = new Scanner(System.in);
		String nome, email, cnpj, numero, dataAfiliacao;

		System.out.println("Digite o nome da Editora: ");
		nome = ler.next();

		System.out.println("Digite o email da editora: ");
		email = ler.next();

		System.out.println("Digite o ddd do numero da editora: ");
		int ddd = ler.nextInt();

		System.out.println("Digite o numero da editora: ");
		numero = ler.next();

		System.out.println("Digite o cnpj: ");
		cnpj = ler.next();

		System.out.println("Digite a data de hoje dd/mm/yyyy: ");
		dataAfiliacao = ler.next();

		Telefone num = new Telefone(ddd, numero);

		// gerar id
		int idNovoEditora = 0;
		for (Editora edit : Dados.getEditoras()) {
			if (edit.id == idNovoEditora) {
				idNovoEditora += 1;
				continue;
			}
		}

		Editora editora = new Editora(nome, email, idNovoEditora, num, cnpj, dataAfiliacao);
		Dados.getEditoras().add(editora);
		return editora; */
	}

	public static void buscarEditora() {
		/*
		Scanner ler = new Scanner(System.in);
		System.out.println("Voce deseja buscar pelo nome ou pelo id?");
		System.out.println("1. Nome\n" + "2. Id\n");

		boolean achou = false;
		int opcao = ler.nextInt();

		String nomeBusca;

		if (opcao == 1) { // busca pelo nome
			System.out.println("Digite o nome da Editora:");
			nomeBusca = ler.next();
			for (Editora edit : Dados.getEditoras()) {
				if (nomeBusca.equals(edit.nome)) {
					achou = true;
					System.out.println(edit);
					break;
				}
			}
		} else if (opcao == 2) { // busca pelo id
			System.out.println("Digite o id da editora:");
			opcao = ler.nextInt();
			for (Editora edit : Dados.getEditoras()) {
				if (opcao == edit.getId()) {
					achou = true;
					System.out.println(edit);
					break;
				}
			}
		} else {
			System.out.println("Opcao invalida");
		}

		if (achou == false) {
			System.out.println("Editora n�o encontrada\n");
		}
		*/
	}

	public static void excluirEditora() {
		/*
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome da editora: ");
		String opcaoString = ler.next();
		for (Editora edit : Dados.getEditoras()) {
			if (edit.nome.equals(opcaoString)) {
				Dados.getEditoras().remove(edit);
				break;
			}
		}
		*/
	}

}
