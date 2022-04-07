package view;

/**
 * @version 1.8
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.ControleCliente;
import controller.ControleDados;

public class ViewCadastro implements ActionListener {

	private JFrame janela;
	private JLabel titulo;
	@SuppressWarnings("unused")
	private static ControleDados dados;
	private static ControleCliente cliente = new ControleCliente();
	private JButton concluir = new JButton("Concluir");
	JTextField nomeField;
	JTextField emailField;
	JFormattedTextField cpfField;
	JFormattedTextField dddField;
	JFormattedTextField numeroField;
	JFormattedTextField txtDateField;
	String nomeValue;
	String emailValue;
	String dataValue;
	String dddValue;
	String cpfValue;
	String numeroValue;

	/**
	 * Criacao da tela de cadastro de editora, cliente e ebook
	 * 
	 * @param d  - dados armazenados
	 * @param op - qual cadastro vai ser selecionado
	 */
	public ViewCadastro(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1: // cadastro de editora

		case 2: // cadastro de cliente
			janela = new JFrame("Loja de Ebook");
			titulo = new JLabel("Cadastro");
			titulo.setFont(new Font("Arial", Font.BOLD, 30));
			titulo.setBounds(200, 30, 150, 30);
			// cria os titulos de cada espaco
			JLabel nomeText = new JLabel("Nome: ");
			JLabel emailText = new JLabel("E-mail: ");
			JLabel numeroText = new JLabel("Numero: ");
			JLabel cpfText = new JLabel("CPF: ");
			JLabel txtDateText = new JLabel("Data de nascimento: ");
			// cria o campo que vai receber as informacoes
			nomeField = new JTextField(200);
			emailField = new JTextField(200);
			MaskFormatter mascaraCPF = null;
			MaskFormatter mascaraNumero = null;
			MaskFormatter mascaraDDD = null;
			MaskFormatter mascaraDate = null;
			try {
				mascaraCPF = new MaskFormatter("#########-##");
				mascaraDDD = new MaskFormatter("##");
				mascaraNumero = new MaskFormatter("#####-####");
				mascaraDate = new MaskFormatter("##/##/####");
				mascaraCPF.setPlaceholderCharacter('_');
				mascaraDDD.setPlaceholderCharacter('_');
				mascaraNumero.setPlaceholderCharacter('_');
				mascaraDate.setPlaceholderCharacter('_');
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cpfField = new JFormattedTextField(mascaraCPF);
			dddField = new JFormattedTextField(mascaraDDD);
			numeroField = new JFormattedTextField(mascaraNumero);
			txtDateField = new JFormattedTextField(mascaraDate);
			// define os tamanhos de cada label
			nomeText.setBounds(100, 100, 80, 30);
			emailText.setBounds(100, 160, 80, 30);
			numeroText.setBounds(100, 220, 80, 30);
			cpfText.setBounds(100, 280, 80, 30);
			txtDateText.setBounds(100, 340, 120, 30);
			// define os tamanhos de cada field
			nomeField.setBounds(260, 100, 160, 30);
			emailField.setBounds(260, 160, 160, 30);
			dddField.setBounds(260, 220, 40, 30);
			numeroField.setBounds(320, 220, 100, 30);
			cpfField.setBounds(260, 280, 160, 30);
			txtDateField.setBounds(260, 340, 160, 30);
			concluir.setBounds(190, 420, 200, 30);
			// adiciona os componentes a janela
			janela.add(concluir);
			janela.add(nomeText);
			janela.add(emailText);
			janela.add(numeroText);
			janela.add(cpfText);
			janela.add(txtDateText);
			janela.add(nomeField);
			janela.add(emailField);
			janela.add(dddField);
			janela.add(numeroField);
			janela.add(cpfField);
			janela.add(txtDateField);
			janela.add(titulo);
			janela.setLayout(null);
			janela.setSize(560, 510);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setVisible(true);
			concluir.addActionListener(this);
			break;
		case 3: // cadastrar ebook

			break;
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

		if (src == concluir) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso\n", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
			// voltar para o login
			janela.dispose();
			// criar variaveis que peguem os valores
			nomeValue = nomeField.getText();
			emailValue = emailField.getText();
			dataValue = txtDateField.getText();
			cpfValue = cpfField.getText();
			dddValue = dddField.getText();
			numeroValue = numeroField.getText();
			// enviar para o metodo em controlecliente
			cliente.cadastrarCliente(nomeValue, emailValue, dataValue, dddValue, numeroValue, cpfValue);
		}
	}
}
