package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class ViewVenda extends JFrame implements ActionListener {

	JButton botaoVoltar;
	JButton botaoConcluir;
	JLabel texto1;
	JRadioButton credito;
	JRadioButton debito;
	JRadioButton vezes1;
	JRadioButton vezes2;
	JRadioButton vezes3;
	JPanel itens;

	/**
	 * Cria janela de confirmacao de venda
	 * 
	 * @param precoTotal - valor conjunto do preco dos ebooks
	 */
	ViewVenda(String precoTotal) {

		texto1 = new JLabel();
		texto1.setText("Carrinho");
		texto1.setBounds(440, 20, 400, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		JLabel item0 = new JLabel("i");
		JLabel item1 = new JLabel("oi");
		JLabel item2 = new JLabel("2");
		JLabel item3 = new JLabel("hehe");
		JLabel item4 = new JLabel("uau");
		JLabel item5 = new JLabel("1010");
		JLabel item6 = new JLabel("weeee");
		JLabel item7 = new JLabel("dqw");
		JLabel item8 = new JLabel("wqfewef");
		JLabel item9 = new JLabel("wqefqqf");

		botaoVoltar = new JButton("Cancelar");
		botaoConcluir = new JButton("Concluir compra");

		ButtonGroup opcao = new ButtonGroup();
		ButtonGroup vezes = new ButtonGroup();

		credito = new JRadioButton("credito");
		debito = new JRadioButton("debito");
		vezes1 = new JRadioButton("1x");
		vezes2 = new JRadioButton("2x");
		vezes3 = new JRadioButton("3x");

		botaoVoltar.addActionListener(this);
		botaoConcluir.addActionListener(this);

		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoConcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));
		credito.setFont(new Font("Comic Sans", Font.BOLD, 15));
		debito.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vezes1.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vezes2.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vezes3.setFont(new Font("Comic Sans", Font.BOLD, 15));

		botaoVoltar.setForeground(Color.cyan);
		botaoConcluir.setForeground(Color.black);
		credito.setForeground(Color.cyan);
		debito.setForeground(Color.cyan);
		vezes1.setForeground(Color.cyan);
		vezes2.setForeground(Color.cyan);
		vezes3.setForeground(Color.cyan);

		botaoVoltar.setBackground(Color.darkGray);
		botaoConcluir.setBackground(Color.GREEN);
		credito.setBackground(Color.gray);
		debito.setBackground(Color.gray);
		vezes1.setBackground(Color.gray);
		vezes2.setBackground(Color.gray);
		vezes3.setBackground(Color.gray);

		opcao.add(credito);
		opcao.add(debito);
		vezes.add(vezes1);
		vezes.add(vezes2);
		vezes.add(vezes3);

		botaoVoltar.setBounds(540, 580, 200, 40);
		botaoConcluir.setBounds(980, 580, 200, 40);
		credito.setBounds(880, 480, 100, 40);
		debito.setBounds(980, 480, 100, 40);
		vezes1.setBounds(780, 440, 100, 40);
		vezes2.setBounds(880, 440, 100, 40);
		vezes3.setBounds(980, 440, 100, 40);

		botaoVoltar.setFocusable(false);
		botaoConcluir.setFocusable(false);
		credito.setFocusable(false);
		debito.setFocusable(false);
		vezes1.setFocusable(false);
		vezes2.setFocusable(false);
		vezes3.setFocusable(false);

		itens = new JPanel();
		itens.setSize(300, 500);
		itens.setLayout(new GridLayout(10, 1));
		itens.setBackground(Color.red);
		itens.setBounds(150, 73, 300, 500);
		itens.add(item0);
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		itens.add(item5);
		itens.add(item6);
		itens.add(item7);
		itens.add(item8);
		itens.add(item9);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Carrinho");
		this.getContentPane().setBackground(Color.gray);
		this.add(texto1);
		this.add(botaoVoltar);
		this.add(botaoConcluir);
		this.add(vezes1);
		this.add(vezes2);
		this.add(vezes3);
		this.add(credito);
		this.add(debito);
		this.add(itens);
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
			JOptionPane.showMessageDialog(null, "Obrigado pela compra!\n", "Compra finalizada",
					JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		} else if (src == botaoVoltar) {
			this.dispose();
			new ViewCarrinho();
		}
	}
}
