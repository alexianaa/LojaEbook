import java.text.SimpleDateFormat;
import java.util.Date;

public class Processo {

	public static void main(String[] args) {
		preencher();

	}

	public static void preencher() {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		// cria as editoras
		Telefone num = new Telefone(82, "988454163");
		String date = simpleDateFormat.format(new Date());
		Editora arqueiro = new Editora("arqueiro", "arqueiro@gmail.com", "1", num, "4382974829843", date);
		Dados.getEditoras().add(arqueiro);

		Telefone num1 = new Telefone(61, "987569520");
		String date1 = simpleDateFormat.format(new Date());
		Editora Rocco = new Editora("Rocco", "Rocco@gmail.com", "2", num1, "5784374820233", date1);
		Dados.getEditoras().add(Rocco);

		Telefone num2 = new Telefone(61, "987569520");
		String date2 = simpleDateFormat.format(new Date());
		Editora Sextante = new Editora("Sextante", "Sextante@gmail.com", "3", num2, "5788425974233", date2);
		Dados.getEditoras().add(Sextante);

		// cria 5 ebooks para as 3 editoras
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				Ebook ebook = new Ebook(j, "ebook" + j, "autor" + j, "categoria" + j, "sinopse" + j, "idioma" + j, 50.0,
						150.0 + j, 350 + j, 2020 + j, Dados.getEditoras().get(i));
				Dados.getEbooks().add(ebook);
			}
		}

		// cria 3 clientes
		for (int a = 0; a < 3; a++) {
			Telefone num3 = new Telefone(61 + a, "num" + a);
			String date3 = simpleDateFormat.format(new Date());
			Cliente cliente = new Cliente("nome" + a, "email" + a, "id" + a, num3, date3, "10578932564" + a,
					"genero" + a);
			Dados.getClientes().add(cliente);
		}

	}

}
