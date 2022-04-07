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
public class ViewCarrinho extends JFrame implements ActionListener {
	JButton botaoExcluir;
	JButton botaoVoltar;
	JButton botaoConcluir;
	JLabel texto1;
	public ControleDados dados;
	public String nomeCliente;

	/**
	 * Cria a view do carrinho do cliente
	 */
	public ViewCarrinho() {

		texto1 = new JLabel();
		texto1.setText("Carrinho");
		texto1.setBounds(440, 20, 400, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		botaoExcluir = new JButton("Excluir da lista");
		botaoVoltar = new JButton("Voltar");
		botaoConcluir = new JButton("Concluir");

		botaoExcluir.setBounds(100, 580, 200, 40);
		botaoVoltar.setBounds(540, 580, 200, 40);
		botaoConcluir.setBounds(980, 580, 200, 40);

		botaoExcluir.setFocusable(false);
		botaoVoltar.setFocusable(false);
		botaoConcluir.setFocusable(false);

		botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoConcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoExcluir.setForeground(Color.cyan);
		botaoVoltar.setForeground(Color.cyan);
		botaoConcluir.setForeground(Color.cyan);

		botaoExcluir.setBackground(Color.darkGray);
		botaoVoltar.setBackground(Color.darkGray);
		botaoConcluir.setBackground(Color.darkGray);

		botaoVoltar.addActionListener(this);
		botaoConcluir.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Carrinho");
		this.getContentPane().setBackground(Color.gray);
		this.add(texto1);
		this.add(botaoExcluir);
		this.add(botaoVoltar);
		this.add(botaoConcluir);
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

		if (src == botaoConcluir) {
			this.dispose();
			new ViewVenda("preco total");
		} else if (src == botaoExcluir) {

		} else if (src == botaoVoltar) {
			this.dispose();
			new ViewMenuPrincipal(dados, nomeCliente);
		}
	}
}