package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ControleDados;

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
	private ControleDados dados;
	private String cliente;

	ViewVenda(ControleDados d, double precoTotal) {
		dados = d;

		String valor = String.valueOf(precoTotal);
		JLabel valorTotal = new JLabel("R$ " + valor);
		JLabel valorTotalTxt = new JLabel("Valor total:");

		// titulo da janela
		texto1 = new JLabel();
		texto1.setText("Carrinho");
		texto1.setBounds(140, 20, 100, 30);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 22));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		botaoVoltar = new JButton("Cancelar");
		botaoConcluir = new JButton("Concluir compra");

		botaoConcluir.setBounds(120, 160, 150, 30);
		botaoVoltar.setBounds(120, 200, 150, 30);

		botaoVoltar.setFocusable(false);
		botaoConcluir.setFocusable(false);

		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 14));
		botaoConcluir.setFont(new Font("Comic Sans", Font.BOLD, 14));

		botaoVoltar.setForeground(Color.black);
		botaoConcluir.setForeground(Color.cyan);
		botaoVoltar.setBackground(Color.darkGray);
		botaoConcluir.setBackground(Color.darkGray);

		botaoVoltar.addActionListener(this);
		botaoConcluir.addActionListener(this);

		// cria opcoes de pagamento e parcelamento
		credito = new JRadioButton("credito");
		debito = new JRadioButton("debito");
		vezes1 = new JRadioButton("1x");
		vezes2 = new JRadioButton("2x");
		vezes3 = new JRadioButton("3x");

		valorTotalTxt.setFont(new Font("Comic Sans", Font.BOLD, 22));
		valorTotal.setFont(new Font("Comic Sans", Font.BOLD, 22));
		credito.setFont(new Font("Comic Sans", Font.BOLD, 15));
		debito.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vezes1.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vezes2.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vezes3.setFont(new Font("Comic Sans", Font.BOLD, 15));

		credito.setForeground(Color.cyan);
		debito.setForeground(Color.cyan);
		vezes1.setForeground(Color.cyan);
		vezes2.setForeground(Color.cyan);
		vezes3.setForeground(Color.cyan);
		credito.setBackground(Color.gray);
		debito.setBackground(Color.gray);
		vezes1.setBackground(Color.gray);
		vezes2.setBackground(Color.gray);
		vezes3.setBackground(Color.gray);

		ButtonGroup opcao = new ButtonGroup();
		ButtonGroup vezes = new ButtonGroup();

		opcao.add(credito);
		opcao.add(debito);
		vezes.add(vezes1);
		vezes.add(vezes2);
		vezes.add(vezes3);

		valorTotalTxt.setBounds(40, 70, 150, 30);
		valorTotal.setBounds(50, 100, 190, 30);
		credito.setBounds(160, 60, 90, 40);
		debito.setBounds(260, 60, 100, 40);
		vezes1.setBounds(160, 100, 50, 40);
		vezes2.setBounds(210, 100, 50, 40);
		vezes3.setBounds(260, 100, 50, 40);

		credito.setFocusable(false);
		debito.setFocusable(false);
		vezes1.setFocusable(false);
		vezes2.setFocusable(false);
		vezes3.setFocusable(false);
		// botaoConcluir.setEnabled(false);

		this.setLayout(null);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.gray);
		this.setResizable(false);
		this.setTitle("Carrinho");
		this.add(valorTotal);
		this.add(valorTotalTxt);
		this.add(texto1);
		this.add(botaoVoltar);
		this.add(botaoConcluir);
		this.add(vezes1);
		this.add(vezes2);
		this.add(vezes3);
		this.add(credito);
		this.add(debito);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoConcluir) {
			this.dispose();
			JOptionPane.showMessageDialog(null, "Venda finalizada\n", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		} else if (src == botaoVoltar) {
			this.dispose();
			new ViewCarrinho(cliente, dados);
		}
	}

}
