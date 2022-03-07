import java.util.*;

public class Processo {

	public static void main(String[] args) {
		String email = "arqueiro@gmail.com";
		String celular = "988494263";
		Telefone num = new Telefone(82,celular);
		String editoraNome = "arqueiro";
		String id = "1";
		String cnpj = "4382974829843";
		Date afiliacao = new Date();
		Editora arqueiro = new Editora(editoraNome, email, id, num, cnpj, afiliacao);
		
		arqueiro.VisualizarEditora(arqueiro);

	}


}
