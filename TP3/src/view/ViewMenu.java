package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ControleCliente;
import controller.ControleDados;

public class ViewMenu implements ActionListener {

	private static JFrame janela;
	private static JLabel titulo;
	private static ControleDados dados;
	private static ControleCliente cliente;
	private static JButton botaoBuscaLivro = new JButton();
	private static JButton botaoBuscaEditora = new JButton();
	private static JButton botaoGerenciaInformacoes = new JButton();
	private static JButton botaoSair = new JButton();
	private static JButton botaoCarrinho = new JButton();
	private static JButton concluir = new JButton("Concluir");

	public ViewMenu(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1: // menu principal
			janela = new JFrame("Loja de Ebook");
			titulo = new JLabel("MENU");
			titulo.setFont(new Font("Arial", Font.BOLD, 32));
			// definindo o tamanho dos componentes
			titulo.setBounds(350, 10, 150, 30);
			botaoBuscaLivro.setBounds(200, 100, 380, 40);
			botaoBuscaEditora.setBounds(200, 180, 380, 40);
			botaoGerenciaInformacoes.setBounds(200, 260, 380, 40);
			botaoSair.setBounds(310, 400, 160, 40);
			botaoCarrinho.setBounds(310, 450, 160, 40);
			// definir textos dos botoes
			botaoBuscaLivro.setText("Buscar Livros");
			botaoBuscaEditora.setText("Buscar Editoras");
			botaoGerenciaInformacoes.setText("Gerenciar informacoes");
			botaoSair.setText("Sair");
			botaoCarrinho.setText("Carrinho");
			// ao posicionar o mouse o botao ganha foco
			botaoBuscaLivro.setFocusable(false);
			botaoBuscaEditora.setFocusable(false);
			botaoGerenciaInformacoes.setFocusable(false);
			botaoSair.setFocusable(false);
			botaoCarrinho.setFocusable(false);
			// modifica a fonte e tamanho dos textos
			botaoBuscaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20));
			botaoBuscaEditora.setFont(new Font("Comic Sans", Font.BOLD, 20));
			botaoGerenciaInformacoes.setFont(new Font("Comic Sans", Font.BOLD, 20));
			botaoSair.setFont(new Font("Comic Sans", Font.BOLD, 20));
			botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20));
			// define a cor de background
			botaoBuscaLivro.setForeground(Color.cyan);
			botaoBuscaEditora.setForeground(Color.cyan);
			botaoGerenciaInformacoes.setForeground(Color.cyan);
			botaoSair.setForeground(Color.cyan);
			botaoCarrinho.setForeground(Color.cyan);
			botaoBuscaLivro.setBackground(Color.darkGray);
			botaoBuscaEditora.setBackground(Color.darkGray);
			botaoGerenciaInformacoes.setBackground(Color.darkGray);
			botaoSair.setBackground(Color.darkGray);
			botaoCarrinho.setBackground(Color.darkGray);
			// define as configuracoes da tela
			janela.setLayout(null);
			janela.setSize(800, 600);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setResizable(false);
			janela.getContentPane().setBackground(Color.gray);
			janela.add(botaoBuscaLivro);
			janela.add(botaoBuscaEditora);
			janela.add(botaoGerenciaInformacoes);
			janela.add(botaoSair);
			janela.add(botaoCarrinho);
			janela.add(titulo);
			janela.setVisible(true);
			break;

		case 2: // cadastro
			janela = new JFrame("Loja de Ebook");
			titulo = new JLabel("Cadastro");
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(240, 10, 150, 30);
			// cria os titulos de cada espaco
			JLabel nomeText = new JLabel("Nome: ");
			JLabel emailText = new JLabel("E-mail: ");
			JLabel numeroText = new JLabel("Numero: ");
			JLabel cpfText = new JLabel("CPF: ");
			JLabel txtDateText = new JLabel("Data de nascimento: ");
			// cria o campo que vai receber as informacoes
			JTextField nome = new JTextField(200);
			JTextField email = new JTextField(200);
			JTextField ddd = new JTextField(2);
			JTextField numero = new JTextField(5);
			JTextField cpf = new JTextField(11);
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			JFormattedTextField txtDate = new JFormattedTextField(df);
			// define os tamanhos de cada textfield e label
			nomeText.setBounds(100, 100, 80, 30);
			emailText.setBounds(100, 160, 80, 30);
			numeroText.setBounds(100, 220, 80, 30);
			cpfText.setBounds(100, 280, 80, 30);
			txtDateText.setBounds(100, 340, 120, 30);
			nome.setBounds(260, 100, 240, 30);
			email.setBounds(260, 160, 240, 30);
			ddd.setBounds(260, 220, 60, 30);
			numero.setBounds(340, 220, 160, 30);
			cpf.setBounds(260, 280, 240, 30);
			txtDate.setBounds(260, 340, 240, 30);
			concluir.setBounds(190, 420, 200, 30);
			// adiciona os componentes a janela
			janela.add(concluir);
			janela.add(nomeText);
			janela.add(emailText);
			janela.add(numeroText);
			janela.add(cpfText);
			janela.add(txtDateText);
			janela.add(nome);
			janela.add(email);
			janela.add(ddd);
			janela.add(numero);
			janela.add(cpf);
			janela.add(txtDate);
			janela.add(titulo);
			janela.setLayout(null);
			janela.setSize(600, 600);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setVisible(true);
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoBuscaLivro) {

		}
		if (src == botaoBuscaEditora) {

		}
		if (src == botaoGerenciaInformacoes) {

		}
		if (src == botaoSair) {

		}
		if (src == botaoCarrinho) {

		}
		if (src == concluir) {
			// cria strings que vao receber os valores
			/*
			 * String nm, em, num, c, dd, txt; nm = nome.getText(); em = email.getText(); dd
			 * = ddd.getText(); num = numero.getText(); c = cpf.getText(); txt =
			 * txtDate.getText(); cliente.cadastrarCliente(nm, em, dd, 0, num, c, txt);
			 */
		}
	}
}
