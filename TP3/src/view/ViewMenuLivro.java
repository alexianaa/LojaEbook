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

import controller.ControleCarrinho;
import controller.ControleDados;
import controller.ControleEbook;

@SuppressWarnings("serial")
public class ViewMenuLivro extends JFrame implements ActionListener {

	JButton botaoBusca;
	JButton botaoExcluir;
	JButton botaoAdicionaLivro;
	JButton cadastraLivro;
	JButton botaoVoltar;
	JButton botaoVoltar2;
	JLabel tituloEbook1;
	JTextField campoTitulo;
	String termo;
	public ControleDados dados;
	public String nomeCliente;

	/**
	 * Cria janela de busca por ebook
	 */
	ViewMenuLivro(String nome) {
		nomeCliente = nome;

		campoTitulo = new JTextField();
		campoTitulo.setBounds(440, 100, 400, 50);
		campoTitulo.setFont(new Font("Comic Sans", Font.BOLD, 40));
		campoTitulo.setForeground(new Color(0x74FF68));
		campoTitulo.setBackground(Color.darkGray);
		campoTitulo.setCaretColor(Color.white);
		campoTitulo.setText("titulo");
		campoTitulo.setHorizontalAlignment(JTextField.CENTER);

		tituloEbook1 = new JLabel();
		tituloEbook1.setText("Buscar Livro");
		tituloEbook1.setBounds(440, 20, 400, 50);
		tituloEbook1.setForeground(Color.cyan);
		tituloEbook1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		tituloEbook1.setHorizontalAlignment(JLabel.CENTER);

		botaoBusca = new JButton("Buscar");
		cadastraLivro = new JButton("Cadastrar livro");
		botaoVoltar = new JButton("Voltar");

		botaoBusca.setBounds(490, 155, 300, 40);
		cadastraLivro.setBounds(540, 500, 200, 40);
		botaoVoltar.setBounds(540, 580, 200, 40);

		botaoBusca.setFocusable(false);
		cadastraLivro.setFocusable(false);
		botaoVoltar.setFocusable(false);

		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20));
		cadastraLivro.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoBusca.setForeground(Color.cyan);
		cadastraLivro.setForeground(Color.cyan);
		botaoVoltar.setForeground(Color.cyan);

		botaoBusca.setBackground(Color.darkGray);
		cadastraLivro.setBackground(Color.darkGray);
		botaoVoltar.setBackground(Color.darkGray);

		botaoBusca.addActionListener(this);
		cadastraLivro.addActionListener(this);
		botaoVoltar.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Buscar livros");
		this.getContentPane().setBackground(Color.gray);
		this.add(tituloEbook1);
		this.add(campoTitulo);
		this.add(botaoBusca);
		this.add(cadastraLivro);
		this.add(botaoVoltar);
		this.setVisible(true);
	}

	/**
	 * Cria janela com informacoes da busca por ebook
	 * 
	 * @param t  titulo do livro ou nome da editora
	 * @param op opcao da busca(ebook ou editora)
	 */
	ViewMenuLivro(String t, int op, String nome) {
		termo = t;
		nomeCliente = nome;

		switch (op) {
		case 1: // busca Ebook
			String[] s = ControleEbook.infoEbook(termo);
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

			JFrame itens = new JFrame("Busca ebook");
			this.add(item0);
			this.add(item1);
			this.add(item2);
			this.add(item3);
			this.add(item4);
			this.add(item5);
			this.add(item6);

			tituloEbook1 = new JLabel();
			tituloEbook1.setText("Ebook: " + termo);
			tituloEbook1.setBounds(290, 20, 320, 30);
			tituloEbook1.setForeground(Color.cyan);
			tituloEbook1.setFont(new Font("Comic Sans", Font.BOLD, 38));
			tituloEbook1.setHorizontalAlignment(JLabel.CENTER);

			botaoExcluir = new JButton("Excluir livro do sistema");
			botaoAdicionaLivro = new JButton("Adicionar livro ao carrinho");
			botaoVoltar2 = new JButton("Voltar");

			botaoExcluir.setBounds(120, 500, 400, 40);
			botaoAdicionaLivro.setBounds(120, 560, 400, 40);
			botaoVoltar2.setBounds(550, 500, 200, 40);

			botaoExcluir.setFocusable(false);
			botaoAdicionaLivro.setFocusable(false);
			botaoVoltar2.setFocusable(false);

			botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));
			botaoAdicionaLivro.setFont(new Font("Comic Sans", Font.BOLD, 20));
			botaoVoltar2.setFont(new Font("Comic Sans", Font.BOLD, 20));

			botaoExcluir.setForeground(Color.cyan);
			botaoAdicionaLivro.setForeground(Color.cyan);
			botaoVoltar2.setForeground(Color.cyan);

			botaoExcluir.setBackground(Color.darkGray);
			botaoAdicionaLivro.setBackground(Color.darkGray);
			botaoVoltar2.setBackground(Color.darkGray);

			botaoExcluir.addActionListener(this);
			botaoAdicionaLivro.addActionListener(this);
			botaoVoltar2.addActionListener(this);

			this.setLayout(null);
			this.setSize(900, 700);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.getContentPane().setBackground(Color.gray);
			this.add(tituloEbook1);
			this.add(botaoExcluir);
			this.add(botaoAdicionaLivro);
			this.add(botaoVoltar2);
			this.setVisible(true);
			break;
		case 2: // busca Editora

		}

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
			// se o ebook existir as informacoes serao buscadas e mostradas em outra tela
			if (ControleEbook.existeEbook(campoTitulo.getText())) {
				this.dispose();
				new ViewMenuLivro(campoTitulo.getText(), 1, nomeCliente);
			} else {
				JOptionPane.showMessageDialog(null, "Este ebook nao existe\n", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}

		} else if (src == botaoAdicionaLivro) {
			// adicionar livro ao carrinho
			if (ControleCarrinho.adicionarEbook(termo, nomeCliente)) {
				JOptionPane.showMessageDialog(null, "Ebook cadastrado com sucesso\n", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Nao foi possivel cadastrar o ebook\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}

		} else if (src == botaoVoltar) {
			this.dispose();

		} else if (src == botaoVoltar2) {
			this.dispose();
			new ViewMenuLivro(nomeCliente);

		} else if (src == botaoExcluir) {
			if (ControleEbook.excluirEbook(termo)) {
				JOptionPane.showMessageDialog(null, "Ebook deletado\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nao foi possivel excluir o ebook\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
			this.dispose();

		}
	}
}
