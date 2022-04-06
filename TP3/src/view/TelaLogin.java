package view;

/**
 @author Alexia
*/

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

public class TelaLogin implements ActionListener {

	/**
	 * criacao de telas, botoes e titulos
	 */
	private JFrame login = new JFrame("Tela de login");
	private JLabel text = new JLabel("LOGIN");
	private JLabel directionText = new JLabel("Digite o seu nome: ");
	private JTextField directionValue = new JTextField(200);
	private static JButton concluir = new JButton("Concluir");
	private static JButton cadastro = new JButton("Cadastre-se");
	private static JButton usuarios = new JButton("Listar usuarios");
	private static ControleDados dados = new ControleDados();
	private String nome;

	public TelaLogin() {
		login.setLayout(null);
		login.setSize(400, 250);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		text.setFont(new Font("Arial", Font.BOLD, 20));
		directionText.setFont(new Font("Arial", Font.PLAIN, 14));

		text.setBounds(150, 10, 150, 30);
		directionText.setBounds(120, 30, 150, 40);
		directionValue.setBounds(96, 60, 180, 30);
		concluir.setBounds(130, 100, 110, 30);
		cadastro.setBounds(40, 160, 120, 30);
		usuarios.setBounds(220, 160, 120, 30);

		login.add(concluir);
		login.add(text);
		login.add(directionText);
		login.add(directionValue);
		login.add(cadastro);
		login.add(usuarios);
		login.setVisible(true);
	}

	public static void main(String[] args) {
		TelaLogin loginView = new TelaLogin();

		concluir.addActionListener(loginView);
		cadastro.addActionListener(loginView);
		usuarios.addActionListener(loginView);
	}

	@Override
	/**
	 * metodo para receber a acao do usuario
	 * 
	 * @param vazio
	 * @return vazio
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == concluir) {
			/**
			 * se o nome estiver registrado no banco de dados o menu e aberto se nao, ele
			 * exibe uma mensagem de erro
			 */
			nome = directionValue.getText();
			if (ControleCliente.existeUsuario(nome)) {
<<<<<<< HEAD
				login.dispose();
=======
>>>>>>> ce988a06f5f3afb4c3337fa3756098ddb278cc64
				new ViewMenuPrincipal();
			} else {
				JOptionPane.showMessageDialog(null, "Este usuario nao existe\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (src == cadastro) {
			new ViewCadastro(dados, 2);
		}
		if (src == usuarios) {
			new ListView(1);
		}

	}

}
