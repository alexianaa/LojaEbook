package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ViewEditora extends JFrame implements ActionListener {
    JButton botaoBusca; // define como botao
    JButton botaoAdicionaEditora; // =
    JButton botaoVoltar; // =
    JButton botaoVoltar2; // =
    JButton botaoExcluir;// define como botao
    JLabel texto1;// define como texto
    JTextField campoTexto;// define como campo de texto

    ViewEditora() {
        // Campo de texto
        campoTexto = new JTextField();// cria um campo de texto
        campoTexto.setBounds(440, 100, 400, 50);// posicao do campo de texto e sua "caixa"
        campoTexto.setFont(new Font("Comic Sans", Font.BOLD, 40));// fonte do campo de texto
        campoTexto.setForeground(new Color(0x74FF68));// define a cor da letra
        campoTexto.setBackground(Color.darkGray);// define a cor do fundo da "caixa"
        campoTexto.setCaretColor(Color.white);// define a cor do indicador de digitação
        campoTexto.setText("Nome Editora");// define um texto pro campo de texto
        campoTexto.setHorizontalAlignment(JTextField.CENTER);// deixa o texto no centro da "caixa"
        // texto
        texto1 = new JLabel();// cria texto
        texto1.setText("Buscar Editora");// define o texto
        texto1.setBounds(440, 20, 400, 50);// posicao do texto e tamanho da sua "caixa"
        texto1.setForeground(Color.cyan);// cor do texto
        texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
        texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
        // botoes
        botaoBusca = new JButton(); // cria botao
        botaoAdicionaEditora = new JButton(); // =
        botaoVoltar = new JButton(); // cria botao
        botaoBusca.setBounds(490, 155, 300, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoAdicionaEditora.setBounds(100, 580, 200, 40); // =
        botaoVoltar.setBounds(540, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoBusca.setText("Buscar"); // define o texto do botao
        botaoAdicionaEditora.setText("Adicionar Editora"); // =
        botaoVoltar.setText("Voltar"); // define o texto do botao
        botaoBusca.setFocusable(false); // tira a caixa de foco do botao
        botaoAdicionaEditora.setFocusable(false); // =
        botaoVoltar.setFocusable(false);// tira a caixa de foco do botao
        botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoAdicionaEditora.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
        botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoBusca.setForeground(Color.cyan); // define cor do texto
        botaoAdicionaEditora.setForeground(Color.cyan); // =
        botaoVoltar.setForeground(Color.cyan); // define cor do texto
        botaoBusca.setBackground(Color.darkGray); // define cor do botao
        botaoAdicionaEditora.setBackground(Color.darkGray); // =
        botaoVoltar.setBackground(Color.darkGray); // define cor do botao
        botaoBusca.addActionListener(this);// adiciona um leitor de ação para o botão
        botaoAdicionaEditora.addActionListener(this);// =
        botaoVoltar.addActionListener(this);// adiciona um leitor de ação para o botão
        // Jframe
        this.setLayout(null); // define o tipo de layout pra nenhum
        this.setSize(1280, 720); // define o tamanho do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
        this.setResizable(false); // não deixa o tamanho ser moficavel
        this.setTitle("Buscar Editoras"); // da um titulo ao JFrame
        this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
        this.add(texto1);// adiciona texto
        this.add(campoTexto); // adiciona o campo de texto
        this.add(botaoBusca); // adiciona botoes
        this.add(botaoAdicionaEditora); // =
        this.add(botaoVoltar); // adiciona botoes
        this.setVisible(true); // deixa o JFrame visivel
    }

    ViewEditora(String texto) {
        // texto
        texto1 = new JLabel();// cria texto
        texto1.setText("Editora" + " " + texto);// define o texto
        texto1.setBounds(0, 20, 1280, 50);// posicao do texto e tamanho da sua "caixa"
        texto1.setForeground(Color.cyan);// cor do texto
        texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
        texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
        // botoes

        botaoVoltar2 = new JButton(); // cria botao
        botaoExcluir = new JButton(); // cria botao
        botaoVoltar2.setBounds(540, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoExcluir.setBounds(440, 450, 400, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoVoltar2.setText("Voltar"); // define o texto do botao
        botaoExcluir.setText("Excluir Editora do sistema"); // define o texto do botao
        botaoVoltar2.setFocusable(false); // tira a caixa de foco do botao
        botaoExcluir.setFocusable(false); // tira a caixa de foco do botao
        botaoVoltar2.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoVoltar2.setForeground(Color.cyan); // define cor do texto
        botaoExcluir.setForeground(Color.cyan); // define cor do texto
        botaoVoltar2.setBackground(Color.darkGray); // define cor do botao
        botaoExcluir.setBackground(Color.darkGray); // define cor do botao
        botaoVoltar2.addActionListener(this);// adiciona um leitor de ação para o botão
        botaoExcluir.addActionListener(this);// adiciona um leitor de ação para o botão
        // Jframe
        this.setLayout(null); // define o tipo de layout pra nenhum
        this.setSize(1280, 720); // define o tamanho do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
        this.setResizable(false); // não deixa o tamanho ser moficavel
        this.setTitle("Editora" + " " + texto); // da um titulo ao JFrame
        this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
        this.add(texto1);// adiciona texto
        this.add(botaoVoltar2); // adiciona botoes
        this.add(botaoExcluir); // adiciona botoes
        this.setVisible(true); // deixa o JFrame visivel
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == botaoBusca) {
            this.dispose();
            new ViewEditora(campoTexto.getText());
        } else if (src == botaoAdicionaEditora) {

        } else if (src == botaoVoltar) {
            this.dispose();
            new ViewMenuPrincipal();
        } else if (src == botaoVoltar2) {
            this.dispose();
            new ViewEditora();
        } else if (src == botaoExcluir) {

        }
    }
}
