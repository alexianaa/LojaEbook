package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControleDados;
import controller.ControleEbook;

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
	ViewMenuLivro(String tituloEbook) {

		String[] s = ControleEbook.infoEbook(tituloEbook);
		JLabel item0 = new JLabel("Categoria: " + s[0]);
		JLabel item1 = new JLabel("Autor: " + s[1]);
		JLabel item2 = new JLabel("Idioma disponivel: " + s[2]);
		JLabel item3 = new JLabel("numero de paginas: " + s[3]);
		JLabel item4 = new JLabel("Preco: " + "R$" + s[4]);
		JLabel item5 = new JLabel("Ano de publicacao: " + s[5]);
		JLabel item6 = new JLabel("tamanho do arquivo: " + s[6]);

		item0.setBounds(150, 100, 500, 30);
		item1.setBounds(150, 140, 500, 30);
		item2.setBounds(150, 180, 500, 30);
		item3.setBounds(150, 220, 500, 30);
		item4.setBounds(150, 260, 500, 30);
		item5.setBounds(150, 300, 500, 30);
		item6.setBounds(150, 340, 500, 30);

		item0.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item1.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item2.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item3.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item4.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item5.setFont(new Font("Comic Sans", Font.BOLD, 25));
		item6.setFont(new Font("Comic Sans", Font.BOLD, 25));

		JFrame itens = new JFrame();
		this.add(item0);
		this.add(item1);
		this.add(item2);
		this.add(item3);
		this.add(item4);
		this.add(item5);
		this.add(item6);

		tituloEbook1 = new JLabel();
		tituloEbook1.setText("Ebook: " + tituloEbook);
		tituloEbook1.setBounds(290, 20, 320, 30);
		tituloEbook1.setForeground(Color.cyan);
		tituloEbook1.setFont(new Font("Comic Sans", Font.BOLD, 38));
		tituloEbook1.setHorizontalAlignment(JLabel.CENTER);

		botaoBusca = new JButton("Excluir livro do sistema");
		botaoAdicionaLivro = new JButton("Adicionar livro ao carrinho");
		botaoVoltar2 = new JButton("Voltar");
		botaoCarrinho = new JButton("Carrinho");

		botaoBusca.setBounds(120, 500, 400, 40);
		botaoAdicionaLivro.setBounds(120, 560, 400, 40);
		botaoVoltar2.setBounds(550, 500, 200, 40);
		botaoCarrinho.setBounds(550, 560, 200, 40);

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
		this.setSize(900, 700);
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

			if (ControleEbook.existeEbook(campoTituloEbook.getText())) {
				this.dispose();
				new ViewMenuLivro(campoTituloEbook.getText());
			} else {
				JOptionPane.showMessageDialog(null, "Este ebook nao existe\n", "Erro", JOptionPane.INFORMATION_MESSAGE);
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
			new ViewCarrinho(nomeCliente, dados);
		}
	}
}
