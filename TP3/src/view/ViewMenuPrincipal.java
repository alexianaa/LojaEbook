package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ViewMenuPrincipal extends JFrame implements ActionListener {

	JButton botaoBuscaLivro;// define como um botao
	JButton botaoBuscaEditora;// =
	JButton botaoGerenciaInformacoes;// =
	JButton botaoSair;// =
	JButton botaoCarrinho;// define como um botao

	ViewMenuPrincipal() {
		// texto
		JLabel texto1 = new JLabel();// cria texto
		texto1.setText("Menu");// define o texto
		texto1.setBounds(440, 20, 400, 50);// posicao do texto e tamanho da sua "caixa"
		texto1.setForeground(Color.cyan);// cor do texto
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
		texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
		// botoes
		botaoBuscaLivro = new JButton(); // cria botao
		botaoBuscaEditora = new JButton(); // =
		botaoGerenciaInformacoes = new JButton(); // =
		botaoSair = new JButton(); // =
		botaoCarrinho = new JButton(); // cria botao
		botaoBuscaLivro.setBounds(440, 100, 400, 40); // coloca o botao em certa posicao no frame e define suas medidas
		botaoBuscaEditora.setBounds(440, 185, 400, 40); // =
		botaoGerenciaInformacoes.setBounds(440, 270, 400, 40); // =
		botaoSair.setBounds(540, 580, 200, 40); // =
		botaoCarrinho.setBounds(980, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
		botaoBuscaLivro.setText("Buscar Livros"); // define o texto do botao
		botaoBuscaEditora.setText("Buscar Editoras"); // =
		botaoGerenciaInformacoes.setText("Gerenciar informacoes"); // =
		botaoSair.setText("Sair"); // =
		botaoCarrinho.setText("Carrinho"); // define o texto do botao
		botaoBuscaLivro.setFocusable(false); // tira a caixa de foco do botao
		botaoBuscaEditora.setFocusable(false); // =
		botaoGerenciaInformacoes.setFocusable(false); // =
		botaoSair.setFocusable(false); // =
		botaoCarrinho.setFocusable(false); // tira a caixa de foco do botao
		botaoBuscaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
		botaoBuscaEditora.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoGerenciaInformacoes.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoSair.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
		botaoBuscaLivro.setForeground(Color.cyan); // define cor do texto
		botaoBuscaEditora.setForeground(Color.cyan); // =
		botaoGerenciaInformacoes.setForeground(Color.cyan); // =
		botaoSair.setForeground(Color.cyan); // =
		botaoCarrinho.setForeground(Color.cyan); // define cor do texto
		botaoBuscaLivro.setBackground(Color.darkGray); // define cor do botao
		botaoBuscaEditora.setBackground(Color.darkGray); // =
		botaoGerenciaInformacoes.setBackground(Color.darkGray); // =
		botaoSair.setBackground(Color.darkGray); // =
		botaoCarrinho.setBackground(Color.darkGray); // define cor do botao
		botaoBuscaLivro.addActionListener(this);// adiciona um leitor de ação para o botão
		botaoBuscaEditora.addActionListener(this);// =
		botaoGerenciaInformacoes.addActionListener(this);// =
		botaoSair.addActionListener(this);// =
		botaoCarrinho.addActionListener(this);// adiciona um leitor de ação para o botão
		// Jframe
		this.setLayout(null); // define o tipo de layout pra nenhum
		this.setSize(1280, 720); // define o tamanho do JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
		this.setResizable(false); // não deixa o tamanho ser moficavel
		this.setTitle("Menu principal"); // da um titulo ao JFrame
		this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
		this.add(texto1);// adiciona texto
		this.add(botaoBuscaLivro); // adiciona botoes
		this.add(botaoBuscaEditora); // =
		this.add(botaoGerenciaInformacoes); // =
		this.add(botaoSair); // =
		this.add(botaoCarrinho); // adiciona botoes

		this.setVisible(true); // deixa o JFrame visivel
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoBuscaLivro) {
			this.dispose();
			new ViewMenuLivro();
		} else if (src == botaoBuscaEditora) {
			this.dispose();
			new ViewEditora();
		} else if (src == botaoGerenciaInformacoes) {
			this.dispose();

		} else if (src == botaoSair) {
			this.dispose();
		} else if (src == botaoCarrinho) {
			this.dispose();
			new ViewCarrinho();
		}

	}
}
