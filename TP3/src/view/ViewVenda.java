package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;

import controller.ControleDados;
import controller.ControleVenda;

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
	private static ControleDados dados = new ControleDados();
	private String cliente;

	ViewVenda(String precoTotal) {
		// cria lista com as informacoes do carrinho
		String[] listaNomes = ControleVenda.infoCarrinho(cliente);
		JList<String> listaCarrinho = new JList<String>(listaNomes);
		listaCarrinho.setBounds(150, 73, 980, 350);
		listaCarrinho.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrinho.setVisibleRowCount(5);
		listaCarrinho.setForeground(Color.white);
		listaCarrinho.setBackground(Color.gray);
		this.add(listaCarrinho);

		// titulo da janela
		texto1 = new JLabel();
		texto1.setText("Carrinho");
		texto1.setBounds(440, 20, 400, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		botaoVoltar = new JButton("Cancelar");
		botaoConcluir = new JButton("Concluir compra");

		botaoVoltar.setBounds(540, 580, 200, 40);
		botaoConcluir.setBounds(980, 580, 200, 40);

		botaoVoltar.setFocusable(false);
		botaoConcluir.setFocusable(false);

		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoConcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoVoltar.setForeground(Color.cyan);
		botaoConcluir.setForeground(Color.black);
		botaoVoltar.setBackground(Color.darkGray);
		botaoConcluir.setBackground(Color.GREEN);

		botaoVoltar.addActionListener(this);
		botaoConcluir.addActionListener(this);

		// cria opcoes de pagamento e parcelamento
		credito = new JRadioButton("credito");
		debito = new JRadioButton("debito");
		vezes1 = new JRadioButton("1x");
		vezes2 = new JRadioButton("2x");
		vezes3 = new JRadioButton("3x");

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

		credito.setBounds(880, 480, 100, 40);
		debito.setBounds(980, 480, 100, 40);
		vezes1.setBounds(780, 440, 100, 40);
		vezes2.setBounds(880, 440, 100, 40);
		vezes3.setBounds(980, 440, 100, 40);

		credito.setFocusable(false);
		debito.setFocusable(false);
		vezes1.setFocusable(false);
		vezes2.setFocusable(false);
		vezes3.setFocusable(false);

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
