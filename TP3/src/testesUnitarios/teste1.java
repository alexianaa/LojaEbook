package testesUnitarios;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import controller.ControleCliente;
import controller.ControleEbook;
import controller.ControleEditora;
import model.Carrinho;
import model.Cliente;
import model.Dados;
import model.Ebook;
import model.Editora;
import model.Telefone;

public class teste1 {

	@Test
	void testExisteEditora() {

		Editora editora = new Editora("nome", "email@email.com", 5, new Telefone(61, "61616161"), "teste", "teste");

		Dados.getEditoras().add(editora);

		// verifica se a editora nome foi criada
		assertTrue(ControleEditora.existeEditora("nome"));
		assertFalse(ControleEditora.existeEditora("Faustao"));
	}

	@Test
	void testExisteCliente() {
		Telefone celular = new Telefone(61, "61616161");
		Carrinho carrinho = new Carrinho(20.5, 5, null);

		Cliente cliente = new Cliente("rogerinho", "teste", 50, celular, "teste", "teste", carrinho);

		Dados.getClientes().add(cliente);

		// verifica se o cliente rogerinho foi criado
		assertTrue(ControleCliente.existeUsuario("rogerinho"));
		assertFalse(ControleCliente.existeUsuario("Faustao"));
	}

	@Test
	void testExisteEbook() {

		Ebook ebook = new Ebook(5, "timtim", "a", "c", "s", "i", 50.0, 500.0, 20, 2020, null);

		Dados.getEbooks().add(ebook);

		// verifica se o ebook timtim foi criado
		assertTrue(ControleEbook.existeEbook("timtim"));
		assertFalse(ControleEbook.existeEbook("Faustao"));
	}
}