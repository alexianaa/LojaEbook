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
public class ViewEditora extends JFrame implements ActionListener {
	JButton botaoBusca;
	JButton botaoAdicionaEditora;
	JButton botaoVoltar;
	JButton botaoExcluir;
	JLabel nomeEditora1;
	JTextField campoNomeEditora;
	public ControleDados dados;
	public String cliente;

	/**
	 * Cria a tela de busca de informacoes de editora
	 * 
	 * @param vazio
	 * @return vazio
	 */
	public ViewEditora() {

		campoNomeEditora = new JTextField();
		campoNomeEditora.setBounds(440, 100, 400, 50);
		campoNomeEditora.setFont(new Font("Comic Sans", Font.BOLD, 40));
		campoNomeEditora.setForeground(new Color(0x74FF68));
		campoNomeEditora.setBackground(Color.darkGray);
		campoNomeEditora.setCaretColor(Color.white);
		campoNomeEditora.setText("Nome Editora");
		campoNomeEditora.setHorizontalAlignment(JTextField.CENTER);

		nomeEditora1 = new JLabel();
		nomeEditora1.setText("Buscar Editora");
		nomeEditora1.setBounds(440, 20, 400, 50);
		nomeEditora1.setForeground(Color.cyan);
		nomeEditora1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		nomeEditora1.setHorizontalAlignment(JLabel.CENTER);

		botaoBusca = new JButton();
		botaoAdicionaEditora = new JButton();
		botaoVoltar = new JButton();

		botaoBusca.setBounds(490, 155, 300, 40);
		botaoAdicionaEditora.setBounds(100, 580, 200, 40);
		botaoVoltar.setBounds(540, 580, 200, 40);

		botaoBusca.setText("Buscar");
		botaoAdicionaEditora.setText("Adicionar Editora");
		botaoVoltar.setText("Voltar");

		botaoBusca.setFocusable(false);
		botaoAdicionaEditora.setFocusable(false);
		botaoVoltar.setFocusable(false);

		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoAdicionaEditora.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoBusca.setForeground(Color.cyan);
		botaoAdicionaEditora.setForeground(Color.cyan);
		botaoVoltar.setForeground(Color.cyan);

		botaoBusca.setBackground(Color.darkGray);
		botaoAdicionaEditora.setBackground(Color.darkGray);
		botaoVoltar.setBackground(Color.darkGray);

		botaoBusca.addActionListener(this);
		botaoAdicionaEditora.addActionListener(this);
		botaoVoltar.addActionListener(this);
		// Jframe
		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Buscar Editoras");
		this.getContentPane().setBackground(Color.gray);
		this.add(nomeEditora1);
		this.add(campoNomeEditora);
		this.add(botaoBusca);
		this.add(botaoAdicionaEditora);
		this.add(botaoVoltar);
		this.setVisible(true);
	}

	/**
	 * Cria a tela de exibicao de informacoes de editora
	 * 
	 * @param nomeEditora - nome da editora buscada
	 * @return vazio
	 */
	ViewEditora(String nomeEditora) {

		nomeEditora1 = new JLabel();
		nomeEditora1.setText("Editora" + " " + nomeEditora);
		nomeEditora1.setBounds(0, 20, 1280, 50);
		nomeEditora1.setForeground(Color.cyan);
		nomeEditora1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		nomeEditora1.setHorizontalAlignment(JLabel.CENTER);

		botaoVoltar = new JButton();
		botaoExcluir = new JButton();

		botaoVoltar.setBounds(540, 580, 200, 40);
		botaoExcluir.setBounds(440, 450, 400, 40);
		botaoVoltar.setText("Voltar");
		botaoExcluir.setText("Excluir Editora do sistema");
		botaoVoltar.setFocusable(false);
		botaoExcluir.setFocusable(false);
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar.setForeground(Color.cyan);
		botaoExcluir.setForeground(Color.cyan);
		botaoVoltar.setBackground(Color.darkGray);
		botaoExcluir.setBackground(Color.darkGray);
		botaoVoltar.addActionListener(this);
		botaoExcluir.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Editora" + " " + nomeEditora);
		this.getContentPane().setBackground(Color.gray);
		this.add(nomeEditora1);
		this.add(botaoVoltar);
		this.add(botaoExcluir);
		this.setVisible(true);
	}

	@Override
	/**
	 * Recebe os eventos do botao
	 * 
	 * @param evento
	 * @return vazio
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoBusca) {
			this.dispose();
			new ViewEditora(campoNomeEditora.getText());
		} else if (src == botaoAdicionaEditora) {

		} else if (src == botaoVoltar) {
			this.dispose();
			new ViewMenuPrincipal(dados, cliente);
		} else if (src == botaoVoltar) {
			this.dispose();
			new ViewEditora();
		} else if (src == botaoExcluir) {

		}
	}
}
