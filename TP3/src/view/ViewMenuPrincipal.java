package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControleDados;

@SuppressWarnings("serial")
public class ViewMenuPrincipal extends JFrame implements ActionListener {

	JButton botaoBuscaLivro;
	JButton botaoBuscaEditora;
	JButton botaoVisualizaInformacoes;
	JButton botaoSair;
	JButton botaoCarrinho;
	public ControleDados dados;
	public String cliente;

	/**
	 * Cria janela do menu principal
	 * 
	 * @param dados - dados armazenados
	 * @param c     - nomde do cliente
	 */
	public ViewMenuPrincipal(ControleDados dados, String c) {
		cliente = c;

		JLabel texto1 = new JLabel();
		texto1.setText("Menu");
		texto1.setBounds(440, 20, 400, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		botaoBuscaLivro = new JButton("Buscar Livros");
		botaoBuscaEditora = new JButton("Buscar Editoras");
		botaoVisualizaInformacoes = new JButton("Gerenciar informacoes");
		botaoSair = new JButton("Sair");
		botaoCarrinho = new JButton("Carrinho");

		botaoBuscaLivro.setBounds(440, 100, 400, 40);
		botaoBuscaEditora.setBounds(440, 185, 400, 40);
		botaoVisualizaInformacoes.setBounds(440, 270, 400, 40);
		botaoSair.setBounds(540, 580, 200, 40);
		botaoCarrinho.setBounds(980, 580, 200, 40);

		botaoBuscaLivro.setFocusable(false);
		botaoBuscaEditora.setFocusable(false);
		botaoVisualizaInformacoes.setFocusable(false);
		botaoSair.setFocusable(false);
		botaoCarrinho.setFocusable(false);

		botaoBuscaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoBuscaEditora.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVisualizaInformacoes.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoSair.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoBuscaLivro.setForeground(Color.cyan);
		botaoBuscaEditora.setForeground(Color.cyan);
		botaoVisualizaInformacoes.setForeground(Color.cyan);
		botaoSair.setForeground(Color.cyan);
		botaoCarrinho.setForeground(Color.cyan);

		botaoBuscaLivro.setBackground(Color.darkGray);
		botaoBuscaEditora.setBackground(Color.darkGray);
		botaoVisualizaInformacoes.setBackground(Color.darkGray);
		botaoSair.setBackground(Color.darkGray);
		botaoCarrinho.setBackground(Color.darkGray);

		botaoBuscaLivro.addActionListener(this);
		botaoBuscaEditora.addActionListener(this);
		botaoVisualizaInformacoes.addActionListener(this);
		botaoSair.addActionListener(this);
		botaoCarrinho.addActionListener(this);

		// Jframe
		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Menu principal");
		this.getContentPane().setBackground(Color.gray);
		this.add(texto1);
		this.add(botaoBuscaLivro);
		this.add(botaoBuscaEditora);
		this.add(botaoVisualizaInformacoes);
		this.add(botaoSair);
		this.add(botaoCarrinho);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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

		if (src == botaoBuscaLivro) {
			new ViewMenuLivro();
		} else if (src == botaoBuscaEditora) {
			new ViewEditora();
		} else if (src == botaoVisualizaInformacoes) {
			this.dispose();
			new ViewInfos(dados, cliente);
		} else if (src == botaoSair) {
			this.dispose();
			new TelaLogin();
		} else if (src == botaoCarrinho) {
			this.dispose();
			new ViewCarrinho(cliente, dados);
		}

	}
}
