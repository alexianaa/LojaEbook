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

public class ViewEditora extends JFrame implements ActionListener {
	JButton botaoBusca;
	JButton botaoAdicionaEditora;
	JButton botaoVoltar;
	JButton botaoExcluir;
	JLabel texto1;
	JTextField campoTexto;
	public ControleDados dados;
	public String cliente;

	ViewEditora() {

		campoTexto = new JTextField();
		campoTexto.setBounds(440, 100, 400, 50);
		campoTexto.setFont(new Font("Comic Sans", Font.BOLD, 40));
		campoTexto.setForeground(new Color(0x74FF68));
		campoTexto.setBackground(Color.darkGray);
		campoTexto.setCaretColor(Color.white);
		campoTexto.setText("Nome Editora");
		campoTexto.setHorizontalAlignment(JTextField.CENTER);

		texto1 = new JLabel();
		texto1.setText("Buscar Editora");
		texto1.setBounds(440, 20, 400, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

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
		this.add(texto1);
		this.add(campoTexto);
		this.add(botaoBusca);
		this.add(botaoAdicionaEditora);
		this.add(botaoVoltar);
		this.setVisible(true);
	}

	ViewEditora(String texto) {
		// texto
		texto1 = new JLabel();
		texto1.setText("Editora" + " " + texto);
		texto1.setBounds(0, 20, 1280, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);
		// botoes

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
		this.setTitle("Editora" + " " + texto);
		this.getContentPane().setBackground(Color.gray);
		this.add(texto1);
		this.add(botaoVoltar);
		this.add(botaoExcluir);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoBusca) {
			this.dispose();
			new ViewEditora(campoTexto.getText());
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
