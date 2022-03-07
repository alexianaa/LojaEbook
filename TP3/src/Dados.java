import java.util.ArrayList;

public class Dados {

	private static final ArrayList<Editora> editoras = new ArrayList<>();
	private static final ArrayList<Ebook> ebooks = new ArrayList<>();
	private static final ArrayList<Cliente> clientes = new ArrayList<>();
	
	public Dados() {
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
