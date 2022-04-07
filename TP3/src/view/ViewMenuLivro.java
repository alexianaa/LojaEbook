package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ControleDados;

@SuppressWarnings("serial")
public class ViewMenuLivro extends JFrame implements ActionListener {

	JButton botaoBusca;
	JButton botaoAdicionaLivro;
	JButton botaoVoltar;
	JButton botaoVoltar2;
	JButton botaoCarrinho;
	JLabel tituloEbook1;
	JTextField campoTituloEbook;
	public ControleDados dados;
	public String nomeCliente;


	/**
	 * Cria janela de busca por ebook
	 */
	ViewMenuLivro() {

		campoTituloEbook = new JTextField();
		campoTituloEbook.setBounds(440, 100, 400, 50);
		campoTituloEbook.setFont(new Font("Comic Sans", Font.BOLD, 40));
		campoTituloEbook.setForeground(new Color(0x74FF68));
		campoTituloEbook.setBackground(Color.darkGray);
		campoTituloEbook.setCaretColor(Color.white);
		campoTituloEbook.setText("titulo");
		campoTituloEbook.setHorizontalAlignment(JTextField.CENTER);

		tituloEbook1 = new JLabel();
		tituloEbook1.setText("Buscar Livro");
		tituloEbook1.setBounds(440, 20, 400, 50);
		tituloEbook1.setForeground(Color.cyan);
		tituloEbook1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		tituloEbook1.setHorizontalAlignment(JLabel.CENTER);

		botaoBusca = new JButton();
		botaoAdicionaLivro = new JButton();
		botaoVoltar = new JButton();
		botaoCarrinho = new JButton();

		botaoBusca.setBounds(490, 155, 300, 40);
		botaoAdicionaLivro.setBounds(100, 580, 200, 40);
		botaoVoltar.setBounds(540, 580, 200, 40);
		botaoCarrinho.setBounds(980, 580, 200, 40);

		botaoBusca.setText("Buscar");
		botaoAdicionaLivro.setText("Adicionar livro");
		botaoVoltar.setText("Voltar");
		botaoCarrinho.setText("Carrinho");

		botaoBusca.setFocusable(false);
		botaoAdicionaLivro.setFocusable(false);
		botaoVoltar.setFocusable(false);
		botaoCarrinho.setFocusable(false);

		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoAdicionaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoBusca.setForeground(Color.cyan);
		botaoAdicionaLivro.setForeground(Color.cyan);
		botaoVoltar.setForeground(Color.cyan);
		botaoCarrinho.setForeground(Color.cyan);

		botaoBusca.setBackground(Color.darkGray);
		botaoAdicionaLivro.setBackground(Color.darkGray);
		botaoVoltar.setBackground(Color.darkGray);
		botaoCarrinho.setBackground(Color.darkGray);

		botaoBusca.addActionListener(this);
		botaoAdicionaLivro.addActionListener(this);
		botaoVoltar.addActionListener(this);
		botaoCarrinho.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Buscar livros");
		this.getContentPane().setBackground(Color.gray);
		this.add(tituloEbook1);
		this.add(campoTituloEbook);
		this.add(botaoBusca);
		this.add(botaoAdicionaLivro);
		this.add(botaoVoltar);
		this.add(botaoCarrinho);
		this.setVisible(true);
	}

	/**
	 * Cria janela com informacoes da busca por ebook
	 * 
	 * @param tituloEbook - nome do ebook
	 */
	ViewMenuLivro(String tituloEbook, String[] s) {
  
    JLabel item0 = new JLabel("categoria: " + s[0]);
		JLabel item1 = new JLabel("Autor: " + s[1]);
		JLabel item2 = new JLabel("Idioma disponivel: " + s[2]);
		JLabel item3 = new JLabel("numero de paginas: " + s[3]);
		JLabel item4 = new JLabel("Preco: " + "R$" + s[4]);
		JLabel item5 = new JLabel("Ano de publicacao: " + s[5]);
		JLabel item6 = new JLabel("tamanho do arquivo: " + s[6]);
  
		item0.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item1.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item2.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item3.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item4.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item5.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item6.setFont(new Font("Comic Sans", Font.BOLD, 25));

		JPanel itens = new JPanel();
		itens.setLayout(new GridLayout(10, 1));
		itens.setBackground(Color.gray);
		itens.setBounds(150, 73, 980, 350);
		itens.add(item0);
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		itens.add(item5);
		itens.add(item6); 
  
		tituloEbook1 = new JLabel();
		tituloEbook1.setText("Ebook" + " " + tituloEbook);
		tituloEbook1.setBounds(0, 20, 1280, 50);
		tituloEbook1.setForeground(Color.cyan);
		tituloEbook1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		tituloEbook1.setHorizontalAlignment(JLabel.CENTER);

		botaoBusca = new JButton();
		botaoAdicionaLivro = new JButton();
		botaoVoltar2 = new JButton();
		botaoCarrinho = new JButton();

		botaoBusca.setBounds(780, 450, 400, 40);
		botaoAdicionaLivro.setBounds(100, 450, 400, 40);
		botaoVoltar2.setBounds(540, 580, 200, 40);
		botaoCarrinho.setBounds(980, 580, 200, 40);

		botaoBusca.setText("excluir livro do sistema");
		botaoAdicionaLivro.setText("Adicionar livro ao carrinho");
		botaoVoltar2.setText("Voltar");
		botaoCarrinho.setText("Carrinho");

		botaoBusca.setFocusable(false);
		botaoAdicionaLivro.setFocusable(false);
		botaoVoltar2.setFocusable(false);
		botaoCarrinho.setFocusable(false);

		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoAdicionaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar2.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoBusca.setForeground(Color.cyan);
		botaoAdicionaLivro.setForeground(Color.cyan);
		botaoVoltar2.setForeground(Color.cyan);
		botaoCarrinho.setForeground(Color.cyan);

		botaoBusca.setBackground(Color.darkGray);
		botaoAdicionaLivro.setBackground(Color.darkGray);
		botaoVoltar2.setBackground(Color.darkGray);
		botaoCarrinho.setBackground(Color.darkGray);

		botaoBusca.addActionListener(this);
		botaoAdicionaLivro.addActionListener(this);
		botaoVoltar2.addActionListener(this);
		botaoCarrinho.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Ebook" + " " + tituloEbook);
		this.getContentPane().setBackground(Color.gray);
		this.add(tituloEbook1);
		this.add(botaoBusca);
		this.add(botaoAdicionaLivro);
		this.add(botaoVoltar2);
		this.add(botaoCarrinho);
		this.setVisible(true);

	}

	@Override
	/**
	 * Recebe os eventos dos botoes
	 * 
	 * @param e - acao realizada/botao selecionado
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoBusca) {

			if (ControleEbook.existeEbook(campoTexto.getText())) {
				this.dispose();
				String[] s = ControleEbook.infoEbook(campoTexto.getText());
				new ViewMenuLivro(campoTexto.getText(), s);
			} else {
				JOptionPane.showMessageDialog(null, "Este ebook nao existe\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (src == botaoAdicionaLivro) {

		} else if (src == botaoVoltar) {
			this.dispose();
			new ViewMenuPrincipal(dados, nomeCliente);
		} else if (src == botaoVoltar2) {
			this.dispose();
			new ViewMenuLivro();
		} else if (src == botaoCarrinho) {
			this.dispose();
			new ViewCarrinho(cliente, dados);
		}
	}
}
