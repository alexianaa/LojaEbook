package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleEbook;

public class ViewMenuLivro extends JFrame implements ActionListener {

	JButton botaoBusca; // define como botao
	JButton botaoAdicionaLivro; // =
	JButton botaoVoltar; // =
	JButton botaoVoltar2; // =
	JButton botaoCarrinho;// define como botao
	JLabel texto1;// define como texto
	JTextField campoTexto;// define como campo de texto
	private static ControleDados dados = new ControleDados();
	private static ControleCliente cliente = new ControleCliente();

	ViewMenuLivro() {
		// Campo de texto
		campoTexto = new JTextField();// cria um campo de texto
		campoTexto.setBounds(440, 100, 400, 50);// posicao do campo de texto e sua "caixa"
		campoTexto.setFont(new Font("Comic Sans", Font.BOLD, 40));// fonte do campo de texto
		campoTexto.setForeground(new Color(0x74FF68));// define a cor da letra
		campoTexto.setBackground(Color.darkGray);// define a cor do fundo da "caixa"
		campoTexto.setCaretColor(Color.white);// define a cor do indicador de digitação
		campoTexto.setText("titulo");// define um texto pro campo de texto
		campoTexto.setHorizontalAlignment(JTextField.CENTER);// deixa o texto no centro da "caixa"
		// texto
		texto1 = new JLabel();// cria texto
		texto1.setText("Buscar Livro");// define o texto
		texto1.setBounds(440, 20, 400, 50);// posicao do texto e tamanho da sua "caixa"
		texto1.setForeground(Color.cyan);// cor do texto
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
		texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
		// botoes
		botaoBusca = new JButton(); // cria botao
		botaoAdicionaLivro = new JButton(); // =
		botaoVoltar = new JButton(); // =
		botaoCarrinho = new JButton(); // cria botao
		botaoBusca.setBounds(490, 155, 300, 40); // coloca o botao em certa posicao no frame e define suas medidas
		botaoAdicionaLivro.setBounds(100, 580, 200, 40); // =
		botaoVoltar.setBounds(540, 580, 200, 40); // =
		botaoCarrinho.setBounds(980, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
		botaoBusca.setText("Buscar"); // define o texto do botao
		botaoAdicionaLivro.setText("Adicionar livro"); // =
		botaoVoltar.setText("Voltar"); // =
		botaoCarrinho.setText("Carrinho"); // define o texto do botao
		botaoBusca.setFocusable(false); // tira a caixa de foco do botao
		botaoAdicionaLivro.setFocusable(false); // =
		botaoVoltar.setFocusable(false); // =
		botaoCarrinho.setFocusable(false); // tira a caixa de foco do botao
		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
		botaoAdicionaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
		botaoBusca.setForeground(Color.cyan); // define cor do texto
		botaoAdicionaLivro.setForeground(Color.cyan); // =
		botaoVoltar.setForeground(Color.cyan); // =
		botaoCarrinho.setForeground(Color.cyan); // define cor do texto
		botaoBusca.setBackground(Color.darkGray); // define cor do botao
		botaoAdicionaLivro.setBackground(Color.darkGray); // =
		botaoVoltar.setBackground(Color.darkGray); // =
		botaoCarrinho.setBackground(Color.darkGray); // define cor do botao
		botaoBusca.addActionListener(this);// adiciona um leitor de ação para o botão
		botaoAdicionaLivro.addActionListener(this);// =
		botaoVoltar.addActionListener(this);// =
		botaoCarrinho.addActionListener(this);// adiciona um leitor de ação para o botão
		// Jframe
		this.setLayout(null); // define o tipo de layout pra nenhum
		this.setSize(1280, 720); // define o tamanho do JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
		this.setResizable(false); // não deixa o tamanho ser moficavel
		this.setTitle("Buscar livros"); // da um titulo ao JFrame
		this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
		this.add(texto1);// adiciona texto
		this.add(campoTexto); // adiciona o campo de texto
		this.add(botaoBusca); // adiciona botoes
		this.add(botaoAdicionaLivro); // =
		this.add(botaoVoltar); // =
		this.add(botaoCarrinho); // adiciona botoes
		this.setVisible(true); // deixa o JFrame visivel
	}

	ViewMenuLivro(String texto, String[] s) {
		// JLabel
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
		// JPanel
		JPanel itens = new JPanel();// cria um JPanel
		itens.setLayout(new GridLayout(10, 1));// define o tipo de layout pra grid
		itens.setBackground(Color.gray);// define a cor de fundo
		itens.setBounds(150, 73, 980, 350);// define a posicao do frame e o tamanho
		itens.add(item0);// adiciona texto ao painel
		itens.add(item1);// adiciona texto ao painel
		itens.add(item2);// adiciona texto ao painel
		itens.add(item3);// adiciona texto ao painel
		itens.add(item4);// adiciona texto ao painel
		itens.add(item5);// adiciona texto ao painel
		itens.add(item6);// adiciona texto ao painel
		// texto
		texto1 = new JLabel();// cria texto
		texto1.setText("Ebook" + " " + texto);// define o texto
		texto1.setBounds(0, 20, 1280, 50);// posicao do texto e tamanho da sua "caixa"
		texto1.setForeground(Color.cyan);// cor do texto
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
		texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
		// botoes
		botaoBusca = new JButton(); // cria botao
		botaoAdicionaLivro = new JButton(); // =
		botaoVoltar2 = new JButton(); // =
		botaoCarrinho = new JButton(); // cria botao
		botaoBusca.setBounds(780, 450, 400, 40); // coloca o botao em certa posicao no frame e define suas medidas
		botaoAdicionaLivro.setBounds(100, 450, 400, 40); // =
		botaoVoltar2.setBounds(540, 580, 200, 40); // =
		botaoCarrinho.setBounds(980, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
		botaoBusca.setText("excluir livro do sistema"); // define o texto do botao
		botaoAdicionaLivro.setText("Adicionar livro ao carrinho"); // =
		botaoVoltar2.setText("Voltar"); // =
		botaoCarrinho.setText("Carrinho"); // define o texto do botao
		botaoBusca.setFocusable(false); // tira a caixa de foco do botao
		botaoAdicionaLivro.setFocusable(false); // =
		botaoVoltar2.setFocusable(false); // =
		botaoCarrinho.setFocusable(false); // tira a caixa de foco do botao
		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
		botaoAdicionaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoVoltar2.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
		botaoCarrinho.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
		botaoBusca.setForeground(Color.cyan); // define cor do texto
		botaoAdicionaLivro.setForeground(Color.cyan); // =
		botaoVoltar2.setForeground(Color.cyan); // =
		botaoCarrinho.setForeground(Color.cyan); // define cor do texto
		botaoBusca.setBackground(Color.darkGray); // define cor do botao
		botaoAdicionaLivro.setBackground(Color.darkGray); // =
		botaoVoltar2.setBackground(Color.darkGray); // =
		botaoCarrinho.setBackground(Color.darkGray); // define cor do botao
		botaoBusca.addActionListener(this);// adiciona um leitor de ação para o botão
		botaoAdicionaLivro.addActionListener(this);// =
		botaoVoltar2.addActionListener(this);// =
		botaoCarrinho.addActionListener(this);// adiciona um leitor de ação para o botão
		// Jframe
		this.setLayout(null); // define o tipo de layout pra nenhum
		this.setSize(1280, 720); // define o tamanho do JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
		this.setResizable(false); // não deixa o tamanho ser moficavel
		this.setTitle("Ebook" + " " + texto); // da um titulo ao JFrame
		this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
		this.add(texto1);// adiciona texto
		this.add(itens);
		this.add(botaoBusca); // adiciona botoes
		this.add(botaoAdicionaLivro); // =
		this.add(botaoVoltar2); // =
		this.add(botaoCarrinho); // adiciona botoes
		this.setVisible(true); // deixa o JFrame visivel
	}

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
			new ViewMenuPrincipal(cliente, dados);
		} else if (src == botaoVoltar2) {
			this.dispose();
			new ViewMenuLivro();
		} else if (src == botaoCarrinho) {
			this.dispose();
			new ViewCarrinho(cliente, dados);
		}
	}
}
