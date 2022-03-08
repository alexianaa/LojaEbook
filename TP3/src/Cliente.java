import java.util.Scanner;

public class Cliente extends Entidade {

	private String dataNascimento;
	private String cpf;
	private String genero;
	private Carrinho carrinho;

	public Cliente(String n, String e, String i, Telefone num, String d, String c, String g, Carrinho car) {
		this.nome = n;
		this.email = e;
		this.id = i;
		this.numCel = num;
		this.dataNascimento = d;
		this.cpf = c;
		this.genero = g;
		this.carrinho = car;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static Cliente cadastrarCliente(){
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
		
		System.out.println("Digite o seu gênero: ");
		genero = ler.next();
		
		Telefone num = new Telefone(ddd , numero);
		Carrinho carrinho = new Carrinho(0.0,0, null);
		
		// gerar id
		String idnovo = "0";
		for(Cliente edit : Dados.getClientes()) {
			if(edit.id.equals(idnovo)) {
				idnovo += 1;
				continue;
			}
		}
		
		Cliente cliente = new Cliente(nome, email, idnovo, num, data, cpf, genero, carrinho);
		Dados.getClientes().add(cliente);
		return cliente;
	}
	
	public static void excluirCliente(){
		
	}
	
	
	public void visualizarCliente(Cliente cliente) {
		System.out.println("cliente: " + cliente.nome + "\n" + "data :" + cliente.dataNascimento );
	}
	
	public void adicionarCarrinho(Ebook ebook, Carrinho carrinho) {
		carrinho.setPreco(ebook.getPreco()+carrinho.getPreco());
		carrinho.adicionarEbook(ebook);
		carrinho.setQuantidadeEbooks(carrinho.getQuantidadeEbooks()+1);
	}

}
