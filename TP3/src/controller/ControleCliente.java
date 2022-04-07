package controller;

import model.Carrinho;
import model.Cliente;
import model.Dados;
import model.Ebook;
import model.Telefone;
import model.Venda;

public class ControleCliente {

	public static Cliente cliente;
	public int qtdClientes = Dados.getClientes().size();

	public ControleCliente() {
		cliente = new Cliente();
	}

	public void cadastrarCliente(String n, String e, String date, String d, String num, String c) {

		int ddd = Integer.parseInt(d);
		Telefone numero = new Telefone(ddd, num);
		Venda venda = new Venda("", 0);
		Carrinho carrinho = new Carrinho(0.0, 0, null, venda);

		// gerar id
		int idNovo = 0;
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getId() == idNovo) {
				idNovo += 1;
				continue;
			}
		}

		Cliente cliente = new Cliente(n, e, idNovo, numero, date, c, carrinho);
		Dados.getClientes().add(cliente);
	}

	public void excluirCliente() {
		/*
		 * Scanner ler = new Scanner(System.in);
		 * System.out.println("Digite o nome do cliente: "); String opcaoString =
		 * ler.next(); for (Cliente edit : Dados.getClientes()) { if
		 * (edit.nome.equals(opcaoString)) { Dados.getClientes().remove(edit); break; }
		 * }
		 */
	}

	public void adicionarCarrinho(Ebook ebook, Carrinho carrinho) {
		/*
		 * carrinho.setPreco(ebook.getPreco() + carrinho.getPreco());
		 * carrinho.adicionarEbook(ebook);
		 * carrinho.setQuantidadeEbooks(carrinho.getQuantidadeEbooks() + 1);
		 */
	}

	public static boolean existeUsuario(String c) {
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(c)) {
				return true;
			}
		}
		return false;
	}

	public String[] showNames() {
		String[] names = new String[Dados.getClientes().size()];
		for (Cliente edit : Dados.getClientes()) {
			names[Dados.getClientes().indexOf(edit)] = edit.getNome();
		}
		return names;
	}

	public static String[] returnCliente(String nome) {
		String[] infos = new String[5];
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(nome)) {
				Telefone num = edit.getNumCel();
				infos[0] = edit.getNome();
				infos[1] = edit.getEmail();
				infos[2] = num.toString();
				infos[3] = edit.getDataNascimento();
				infos[4] = edit.getCpf();
				break;
			}
		}

		return infos;
	}

}
