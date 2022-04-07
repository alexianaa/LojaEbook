package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.ControleCliente;
import controller.ControleDados;

public class ViewPessoalInfos implements ActionListener {

	private JFrame janela = new JFrame("Loja de Ebook");
	private JLabel titulo = new JLabel("Informacoes pessoais");
	private JButton excluir = new JButton("Excluir");
	private JButton voltar = new JButton("Voltar");
	public ControleDados dados;
	private static String cliente;
	JTextField nomeField;
	JTextField emailField;
	JTextField cpfField;
	JTextField numeroField;
	JTextField txtDateField;

	/**
	 * Mostra as informacaos do usuario
	 * 
	 * @param d - dados armazenados
	 * @param c - nome do cliente
	 */
	public ViewPessoalInfos(ControleDados d, String c) {
		dados = d;
		cliente = c;

		janela.setLayout(null);
		janela.setSize(550, 550);

		titulo.setBounds(150, 20, 220, 30);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));

		JLabel nomeText = new JLabel("Nome: ");
		JLabel emailText = new JLabel("E-mail: ");
		JLabel numeroText = new JLabel("Numero: ");
		JLabel cpfText = new JLabel("CPF: ");
		JLabel txtDateText = new JLabel("Data de nascimento: ");

		nomeText.setBounds(100, 100, 80, 30);
		emailText.setBounds(100, 160, 80, 30);
		numeroText.setBounds(100, 220, 80, 30);
		cpfText.setBounds(100, 280, 80, 30);
		txtDateText.setBounds(100, 340, 120, 30);

		// adicionar informacoes do cliente nesses espacos
		String[] infos = ControleCliente.returnCliente(cliente);
		nomeField = new JTextField(infos[0], 200);
		emailField = new JTextField(infos[1], 200);
		numeroField = new JTextField(infos[2], 200);
		txtDateField = new JTextField(infos[3], 200);
		cpfField = new JTextField(infos[4], 200);

		nomeField.setBounds(260, 100, 160, 30);
		emailField.setBounds(260, 160, 160, 30);
		numeroField.setBounds(260, 220, 160, 30);
		cpfField.setBounds(260, 280, 160, 30);
		txtDateField.setBounds(260, 340, 160, 30);
		excluir.setBounds(100, 420, 150, 30);
		voltar.setBounds(270, 420, 150, 30);

		janela.add(excluir);
		janela.add(voltar);
		janela.add(nomeText);
		janela.add(emailText);
		janela.add(numeroText);
		janela.add(cpfText);
		janela.add(txtDateText);
		janela.add(nomeField);
		janela.add(emailField);
		janela.add(numeroField);
		janela.add(cpfField);
		janela.add(txtDateField);
		janela.add(titulo);
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janela.setVisible(true);

		excluir.addActionListener(this);
		voltar.addActionListener(this);
	}

	@Override
	/**
	 * Recebe os eventos dos botoes
	 * 
	 * @param e - acao realizada/botao selecionado
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == excluir) {
			if (ControleCliente.excluirCliente(cliente)) {
				JOptionPane.showMessageDialog(null, "Perfil excluido\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				janela.dispose();
				new TelaLogin();
			} else {
				JOptionPane.showMessageDialog(null, "Nao foi possivel excluir o perfil\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
				janela.dispose();
			}
		} else if (src == voltar) {
			janela.dispose();
			new ViewInfos(dados, cliente);
		}

	}

}
