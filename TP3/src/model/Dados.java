package model;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Dados {

	private static final ArrayList<Editora> editoras = new ArrayList<>();
	private static final ArrayList<Ebook> ebooks = new ArrayList<>();
	private static final ArrayList<Cliente> clientes = new ArrayList<>();

	public void preencher() {
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

		// cria 10 ebooks para as 3 editoras
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				Ebook ebook = new Ebook(j, "ebook" + i + j, "autor" + i + j, "categoria" + i + j, "sinopse" + i + j,
						"idioma" + i + j, 50.0, 150.0 + i + j, 350 + i + j, 2012 + i + j, Dados.getEditoras().get(i));
				Dados.getEbooks().add(ebook);
			}
		}

		// cria 10 clientes
		for (int a = 0; a < 10; a++) {
			Telefone num3 = new Telefone(61 + a, "num" + a);
			String date3 = simpleDateFormat.format(new Date());
			Venda venda = new Venda("", 0);
			Carrinho carrinho = new Carrinho(0.0, 0, null, venda);
			Cliente cliente = new Cliente("nome" + a, "email" + a, a, num3, date3, "10578932564" + a,
					carrinho);
			Dados.getClientes().add(cliente);
		}

	}

	public static ArrayList<Editora> getEditoras() {
		return editoras;
	}

	public static ArrayList<Ebook> getEbooks() {
		return ebooks;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

}
