import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processo {
	static Scanner ler = new Scanner(System.in);
	static int opcao;
	static String opcaoString;
	
	public static void main(String[] args) {
		preencher();
		
		System.out.println("--------Menu--------");
		System.out.println("1. Comprar Ebook\n" + "2. Ver Carrinho\n" + "3. Buscar Editora\n" + "4. Cadastrar Ebook\n" + "5. Cadastrar Editora\n" + "6. Sair da loja");
		System.out.println("--------------------");
		opcao = ler.nextInt();
		
		while(opcao != 6) {			
			if(opcao == 1) {
				ComprarEbook();
			}else if(opcao == 2) {
				VerCarrinho();
			}else if(opcao == 3) {
				BuscarEditora();
			}else if(opcao == 4) {
				CadastrarEbook();
			}else if(opcao == 5) {
				CadastrarEditora();
			}else if(opcao == 6) {
				SairLoja();
			}else {
				System.out.println("Opção inválida");
			}
			
			System.out.println("--------Menu--------");
			System.out.println("1. Comprar Ebook\n" + "2. Ver Carrinho\n" + "3. Buscar Editora\n" + "4. Cadastrar Ebook\n" + "5. Cadastrar Editora\n" + "6. Sair da loja");
			System.out.println("--------------------");
			opcao = ler.nextInt();
		}
	}
	
	public static void ComprarEbook() {
		// menu de compra
		System.out.println("----Comprar Ebooks----");
		System.out.println("1. Listar Ebooks\n" + "2. Buscar Ebooks\n" + "3. Finalizar compra\n" + "4. Voltar");
		System.out.println("----------------------\n");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			System.out.println("- Listar Ebooks -");
			for(Ebook edit : Dados.getEbooks()) {
				edit.visualizarEbook(edit);
			}
			ComprarEbook();
		}else if(opcao == 2) {
			System.out.println("- Buscar Ebooks -");
			System.out.println("Digite o nome do ebook: ");
			boolean achou = false;
			opcaoString = ler.next();
			for(Ebook edit : Dados.getEbooks()) {
				if(opcaoString.equals(edit.getNomeEbook())) { // encontrou o ebook
					System.out.println("Ebook encontrado, você deseja: \n" + "1. Adicionar ao carrinho\n" + "2. Cancelar busca");
					achou = true;
					opcao = ler.nextInt();
					if(opcao == 1) {
						//ebook.carrinho
					}else if(opcao == 2) {
						System.out.println("Busca cancelada");
					}else {
						System.out.println("Opção Inválida");
					}
				}
			}
			if(achou == false) {
				System.out.println("Opção não existe\n");
			}
			ComprarEbook();
		}else if(opcao == 3) {
			System.out.println("- Finalizar compra -");
			System.out.println("Redirecionando para venda...");
		}else if(opcao == 4) {
			
		}else {
			System.out.println("Opção Inválida");
			ComprarEbook();
		}
	}
	
	public static void VerCarrinho() {
		System.out.println("carrinho");
	}
	
	public static void BuscarEditora() {
		System.out.println("editora");
	}
	
	public static void CadastrarEbook() {
		System.out.println("ebook");
	}
	
	public static void CadastrarEditora() {
		System.out.println("editora");
	}
	
	public static void SairLoja() {
		System.out.println("sair");
	}
	
	public static void preencher() {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		//cria as editoras
		Telefone num = new Telefone(82,"988454163");
		String date = simpleDateFormat.format(new Date());
		Editora arqueiro = new Editora("arqueiro", "arqueiro@gmail.com", "1", num, "4382974829843", date);
		Dados.getEditoras().add(arqueiro);
		
		Telefone num1 = new Telefone(61,"987569520");
		String date1 = simpleDateFormat.format(new Date());
		Editora Rocco = new Editora("Rocco", "Rocco@gmail.com", "2", num1, "5784374820233", date1);
		Dados.getEditoras().add(Rocco);
		
		Telefone num2 = new Telefone(61,"987569520");
		String date2 = simpleDateFormat.format(new Date());
		Editora Sextante = new Editora("Sextante", "Sextante@gmail.com", "3", num2, "5788425974233", date2);
		Dados.getEditoras().add(Sextante);
		
		// cria 5 ebooks para as 3 editoras
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				Ebook ebook = new Ebook(j, "ebook"+i+j, "autor"+i+j, "categoria"+i+j, "sinopse"+i+j, "idioma"+i+j, 50.0, 150.0+i+j, 350+i+j, 2012+i+j, Dados.getEditoras().get(i));
				Dados.getEbooks().add(ebook);
			}
		}
		
		//cria 3 clientes
		for(int a = 0; a <3; a++) {
			Telefone num3 = new Telefone(61+a,"num"+a);
			String date3 = simpleDateFormat.format(new Date());
			Cliente cliente = new Cliente("nome"+a, "email"+a, "id"+a, num3, date3, "10578932564"+a, "genero"+a);
			Dados.getClientes().add(cliente);
		}
		
		
	}

}
