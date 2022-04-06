package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ViewCarrinho extends JFrame implements ActionListener {
    JButton botaoExcluir; // define como botao
    JButton botaoVoltar; // =
    JButton botaoConcluir;// define como botao
    JLabel texto1;// define como texto

    ViewCarrinho() {
        // texto
        texto1 = new JLabel();// cria texto
        texto1.setText("Carrinho");// define o texto
        texto1.setBounds(440, 20, 400, 50);// posicao do texto e tamanho da sua "caixa"
        texto1.setForeground(Color.cyan);// cor do texto
        texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
        texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
        // botoes
        botaoExcluir = new JButton(); // cria botao
        botaoVoltar = new JButton(); // =
        botaoConcluir = new JButton(); // cria botao
        botaoExcluir.setBounds(100, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoVoltar.setBounds(540, 580, 200, 40); // =
        botaoConcluir.setBounds(980, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoExcluir.setText("Excluir da lista"); // define o texto do botao
        botaoVoltar.setText("Voltar"); // =
        botaoConcluir.setText("Concluir"); // define o texto do botao
        botaoExcluir.setFocusable(false); // tira a caixa de foco do botao
        botaoVoltar.setFocusable(false); // =
        botaoConcluir.setFocusable(false); // tira a caixa de foco do botao
        botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20)); // =
        botaoConcluir.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoExcluir.setForeground(Color.cyan); // define cor do texto
        botaoVoltar.setForeground(Color.cyan); // =
        botaoConcluir.setForeground(Color.cyan); // define cor do texto
        botaoExcluir.setBackground(Color.darkGray); // define cor do botao
        botaoVoltar.setBackground(Color.darkGray); // =
        botaoConcluir.setBackground(Color.darkGray); // define cor do botao
        botaoVoltar.addActionListener(this);// adiciona um leitor de ação para o botão
        botaoConcluir.addActionListener(this);// adiciona um leitor de ação para o botão
        // Jframe
        this.setLayout(null); // define o tipo de layout pra nenhum
        this.setSize(1280, 720); // define o tamanho do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
        this.setResizable(false); // não deixa o tamanho ser moficavel
        this.setTitle("Carrinho"); // da um titulo ao JFrame
        this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
        this.add(texto1);// adiciona texto
        this.add(botaoExcluir); // adiciona botoes
        this.add(botaoVoltar); // =
        this.add(botaoConcluir); // adiciona botoes
        this.setVisible(true); // deixa o JFrame visivel
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == botaoConcluir) {
            this.dispose();
            new ViewVenda("preco total");
        } else if (src == botaoExcluir) {

        } else if (src == botaoVoltar) {
            this.dispose();
            new ViewMenuPrincipal();
        }
    }
}