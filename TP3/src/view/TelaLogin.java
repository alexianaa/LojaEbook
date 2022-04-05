package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller .*;

public class TelaLogin implements ActionListener {

    private static JFrame login = new JFrame("Tela de login");
    private static JLabel text = new JLabel("LOGIN");
    private static JLabel directionText = new JLabel("Digite o seu nome: ");
    private JTextField directionValue = new JTextField(200);
    private static JButton concluir = new JButton("Concluir");
    private static JButton cadastro = new JButton("Cadastre-se");
    private static JButton usuarios = new JButton("Listar usuarios");
    public static ControleDados dados = new ControleDados();
    private String nome;

    public TelaLogin() {
		login.setLayout(null);
		login.setSize(400, 250);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        text.setFont(new Font("Arial", Font.BOLD, 20));
		text.setBounds(150, 10, 150, 30);
        login.add(text);

        directionText.setFont(new Font("Arial", Font.PLAIN, 14));
        directionText.setBounds(120, 30, 150, 40);
        login.add(directionText);
        
        directionValue.setBounds(96, 60, 180, 30);
        login.add(directionValue);
        this.nome = directionValue.getText();

        // esquerda, altura ,direita ,espressura
        concluir.setBounds(130, 100, 110, 30);
        login.add(concluir);

        cadastro.setBounds(40, 160, 120, 30);
        login.add(cadastro);

        usuarios.setBounds(220, 160, 120, 30);
        login.add(usuarios);

        login.setVisible(true);
	}

    public static void main(String[] args) {
		TelaLogin loginView = new TelaLogin();

        concluir.addActionListener(loginView);
        cadastro.addActionListener(loginView);
        usuarios.addActionListener(loginView);
	}

    public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == concluir){
            if( ControleCliente.existeUsuario(nome) ){
                new ViewMenu(dados);
            }else{
                JOptionPane.showMessageDialog(null, "Este usuario nao existe\n" , "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(src == cadastro){

        }
        if(src == usuarios){
            new ListView();
        }
            
	}

}
