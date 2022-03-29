package controle;

import java.util.Scanner;

import modelo.Carrinho;
import modelo.Cliente;
import modelo.Dados;
import modelo.Ebook;
import modelo.Telefone;
import modelo.Venda;

public class ControleCliente {
	public static Cliente cadastrarCliente() {
		Scanner ler = new Scanner(System.in);
		String nome, email, numero, cpf, data, genero;

		System.out.println("Digite o seu nome: ");
		nome = ler.next();

		System.out.println("Digite o seu email: ");
		email = ler.next();

		System.out.println("Digite o seu ddd: ");
		int ddd = ler.nextInt();

		System.out.println("Digite o seu numero: ");
		numero = ler.next();

		System.out.println("Digite o seu cpf: ");
		cpf = ler.next();

		System.out.println("Digite o seu aniversario no formato dd/mm/yyyy: ");
		data = ler.next();

		System.out.println("Digite o seu genero: ");
		genero = ler.next();

		Telefone num = new Telefone(ddd, numero);
		Venda venda = new Venda("", 0);
		Carrinho carrinho = new Carrinho(0.0, 0, null, venda);

		// gerar id
		int idNovo = 0;
		for (Cliente edit : Dados.getClientes()) {
			if (edit.id == idNovo) {
				idNovo += 1;
				continue;
			}
		}

		Cliente cliente = new Cliente(nome, email, idNovo, num, data, cpf, genero, carrinho);
		Dados.getClientes().add(cliente);
		return cliente;
	}

	public static void excluirCliente() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		String opcaoString = ler.next();
		for (Cliente edit : Dados.getClientes()) {
			if (edit.nome.equals(opcaoString)) {
				Dados.getClientes().remove(edit);
				break;
			}
		}
	}

	public void adicionarCarrinho(Ebook ebook, Carrinho carrinho) {
		carrinho.setPreco(ebook.getPreco() + carrinho.getPreco());
		carrinho.adicionarEbook(ebook);
		carrinho.setQuantidadeEbooks(carrinho.getQuantidadeEbooks() + 1);
	}
}
