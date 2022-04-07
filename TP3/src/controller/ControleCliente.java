package controller;

import model.Carrinho;
import model.Cliente;
import model.Dados;
import model.Telefone;

public class ControleCliente {

	public static Cliente cliente;
	public int qtdClientes = Dados.getClientes().size();

	/**
	 * Cria um cliente
	 */
	public ControleCliente() {
		cliente = new Cliente();
	}

	/**
	 * Cadastra um cliente ao sistema
	 * 
	 * @param n    - nome
	 * @param e    - email
	 * @param date - data de aniversario
	 * @param d    - ddd do telefone
	 * @param num  - numero do telefone
	 * @param c    - cria um carrinho para o cliente
	 */
	public void cadastrarCliente(String n, String e, String date, String d, String num, String c) {

		int ddd = Integer.parseInt(d);
		Telefone numero = new Telefone(ddd, num);
		Carrinho carrinho = new Carrinho(0.0, 0, null);

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

	/**
	 * Exclui um cliente do sistema
	 * 
	 * @param nomeCliente - string com o nome do cliente a ser excluido
	 * @return
	 */
	public static boolean excluirCliente(String nomeCliente) {
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(nomeCliente)) {
				Dados.getClientes().remove(edit);
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna se existe um usuario com o nome recebido
	 * 
	 * @param c - nome do possivel cliente
	 * @return
	 */
	public static boolean existeUsuario(String c) {
		for (Cliente edit : Dados.getClientes()) {
			if (edit.getNome().equals(c)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna um array com o nome dos clientes cadastrados no sistema
	 * 
	 * @return
	 */
	public String[] showNames() {
		String[] names = new String[Dados.getClientes().size()];
		for (Cliente edit : Dados.getClientes()) {
			names[Dados.getClientes().indexOf(edit)] = edit.getNome();
		}
		return names;
	}

	/**
	 * Retorna uma string com as informacoes do cliente
	 * 
	 * @param nome - nome do cliente usando o sistema
	 * @return
	 */
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
