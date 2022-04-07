package view;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleEditora;

public class ViewEditora extends JFrame implements ActionListener {
    JButton botaoBusca; 
    JButton botaoAdicionaEditora; 
    JButton botaoVoltar;
    JButton botaoVoltar2; 
    JButton botaoExcluir;
    JLabel texto1;
    JTextField campoTexto;
    private ControleDados dados = new ControleDados();
    private ControleCliente cliente = new ControleCliente();

    ViewEditora() {
        // Campo de texto
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
        
        botaoBusca = new JButton("Buscar");
        botaoAdicionaEditora = new JButton("Adicionar Editora"); 
        botaoVoltar = new JButton("Voltar"); 
      
        botaoBusca.setBounds(490, 155, 300, 40);
        botaoAdicionaEditora.setBounds(100, 580, 200, 40);
        botaoVoltar.setBounds(540, 580, 200, 40); 
      
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

    ViewEditora(String texto, String[] s) {
        JLabel item0 = new JLabel("categoria: " + s[0]);
        JLabel item1 = new JLabel("Autor: " + s[1]);
        JLabel item2 = new JLabel("Idioma disponivel: " + s[2]);
        JLabel item3 = new JLabel("numero de paginas: " + s[3]);
        JLabel item4 = new JLabel("Preco: " + "R$" + s[4]);
        item0.setFont(new Font("Comic Sans", Font.BOLD, 40));
        item1.setFont(new Font("Comic Sans", Font.BOLD, 40));
        item2.setFont(new Font("Comic Sans", Font.BOLD, 40));
        item3.setFont(new Font("Comic Sans", Font.BOLD, 40));
        item4.setFont(new Font("Comic Sans", Font.BOLD, 40));
        
        JPanel itens = new JPanel();
        itens.setLayout(new GridLayout(10, 1));
        itens.setBackground(Color.gray);
        itens.setBounds(150, 73, 980, 350);
        itens.add(item0);
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
   
        texto1 = new JLabel();
        texto1.setText("Editora" + " " + texto);
        texto1.setBounds(0, 20, 1280, 50);
        texto1.setForeground(Color.cyan);
        texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
        texto1.setHorizontalAlignment(JLabel.CENTER);

        botaoVoltar2 = new JButton("Voltar"); 
        botaoExcluir = new JButton("Excluir Editora do sistema");
      
        botaoVoltar2.setBounds(540, 580, 200, 40); 
        botaoExcluir.setBounds(440, 450, 400, 40); 
      
        botaoVoltar2.setFocusable(false);
        botaoExcluir.setFocusable(false);
      
        botaoVoltar2.setFont(new Font("Comic Sans", Font.BOLD, 20));
        botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));
      
        botaoVoltar2.setForeground(Color.cyan); 
        botaoExcluir.setForeground(Color.cyan); 
      
        botaoVoltar2.setBackground(Color.darkGray);
        botaoExcluir.setBackground(Color.darkGray);
      
        botaoVoltar2.addActionListener(this);
        botaoExcluir.addActionListener(this);
        
        this.setLayout(null); 
        this.setSize(1280, 720); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false); 
        this.setTitle("Editora" + " " + texto);
        this.add(itens);
        this.getContentPane().setBackground(Color.gray);
        this.add(texto1);
        this.add(botaoVoltar2);
        this.add(botaoExcluir); 
        this.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == botaoBusca) {
            if (ControleEditora.existeEditora(campoTexto.getText())) {
                this.dispose();
                String[] s = ControleEditora.infoEditora(campoTexto.getText());
                new ViewEditora(campoTexto.getText(), s);
            } else {
                JOptionPane.showMessageDialog(null, "Esta editora nao existe\n", "Erro",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (src == botaoAdicionaEditora)

        {

        } else if (src == botaoVoltar) {
            this.dispose();
            new ViewMenuPrincipal(cliente, dados);
        } else if (src == botaoVoltar2) {
            this.dispose();
            new ViewEditora();
        } else if (src == botaoExcluir) {

        }
    }
}
