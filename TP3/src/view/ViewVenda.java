package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ViewVenda extends JFrame implements ActionListener {

    JButton botaoVoltar; // define como botao
    JButton botaoConcluir;// define como botao
    JLabel texto1;// define como texto
    JRadioButton credito;// define como botao de selecao
    JRadioButton debito;// =
    JRadioButton vezes1;// =
    JRadioButton vezes2;// =
    JRadioButton vezes3;// define como botao de selecao
    JPanel itens; // define como um painel

    ViewVenda(String precoTotal) {/* String[] ebooks */
        // texto
        texto1 = new JLabel();// cria texto
        texto1.setText("Carrinho");// define o texto
        texto1.setBounds(440, 20, 400, 50);// posicao do texto e tamanho da sua "caixa"
        texto1.setForeground(Color.cyan);// cor do texto
        texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
        texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
        JLabel item0 = new JLabel("i");// cria e define o texto
        JLabel item1 = new JLabel("oi");// =
        JLabel item2 = new JLabel("2");// =
        JLabel item3 = new JLabel("hehe");// =
        JLabel item4 = new JLabel("uau");// =
        JLabel item5 = new JLabel("1010");// =
        JLabel item6 = new JLabel("weeee");// =
        JLabel item7 = new JLabel("dqw");// =
        JLabel item8 = new JLabel("wqfewef");// =
        JLabel item9 = new JLabel("wqefqqf");// cria e define o texto

        // botoes
        botaoVoltar = new JButton(); // cria botao
        botaoConcluir = new JButton(); // cria botao
        botaoVoltar.setBounds(540, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoConcluir.setBounds(980, 580, 200, 40); // coloca o botao em certa posicao no frame e define suas medidas
        botaoVoltar.setText("Cancelar"); // define o texto do botao
        botaoConcluir.setText("Concluir compra"); // define o texto do botao
        botaoVoltar.setFocusable(false); // tira a caixa de foco do botao
        botaoConcluir.setFocusable(false); // tira a caixa de foco do botao
        botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoConcluir.setFont(new Font("Comic Sans", Font.BOLD, 20)); // define a fonte do texto no botao
        botaoVoltar.setForeground(Color.cyan); // define cor do texto
        botaoConcluir.setForeground(Color.black); // define cor do texto
        botaoVoltar.setBackground(Color.darkGray); // define cor do botao
        botaoConcluir.setBackground(Color.GREEN); // define cor do botao
        // Botoes de selecao
        credito = new JRadioButton("credito");// cria um grupo de botoes
        debito = new JRadioButton("debito");// =
        vezes1 = new JRadioButton("1x");// =
        vezes2 = new JRadioButton("2x");// =
        vezes3 = new JRadioButton("3x");// cria um grupo de botoes
        credito.setFont(new Font("Comic Sans", Font.BOLD, 15)); // define a fonte do texto no botao
        debito.setFont(new Font("Comic Sans", Font.BOLD, 15)); // =
        vezes1.setFont(new Font("Comic Sans", Font.BOLD, 15)); // =
        vezes2.setFont(new Font("Comic Sans", Font.BOLD, 15)); // =
        vezes3.setFont(new Font("Comic Sans", Font.BOLD, 15)); // define a fonte do texto no botao
        credito.setForeground(Color.cyan); // define cor do texto
        debito.setForeground(Color.cyan); // =
        vezes1.setForeground(Color.cyan); // =
        vezes2.setForeground(Color.cyan); // =
        vezes3.setForeground(Color.cyan); // define cor do texto
        credito.setBackground(Color.gray); // define cor de fundo do botao
        debito.setBackground(Color.gray); // =
        vezes1.setBackground(Color.gray); // =
        vezes2.setBackground(Color.gray); // =
        vezes3.setBackground(Color.gray); // define cor de fundo do botao
        ButtonGroup opcao = new ButtonGroup();// cria um grupo de botoes de selecao
        ButtonGroup vezes = new ButtonGroup();// cria um grupo de botoes de selecao
        opcao.add(credito);// adiciona credito ao grupo
        opcao.add(debito);// adiciona debito ao grupo
        vezes.add(vezes1);// adiciona 1x ao grupo
        vezes.add(vezes2);// adiciona 2x ao grupo
        vezes.add(vezes3);// adiciona 3x ao grupo
        credito.setBounds(880, 480, 100, 40); // define onde vai ficar no frame e o tamanho de sua "caixa"
        debito.setBounds(980, 480, 100, 40);// =
        vezes1.setBounds(780, 440, 100, 40);// =
        vezes2.setBounds(880, 440, 100, 40);// =
        vezes3.setBounds(980, 440, 100, 40);// define onde vai ficar no frame e o tamanho de sua "caixa"
        credito.setFocusable(false); // tira a caixa de foco do botao
        debito.setFocusable(false); // =
        vezes1.setFocusable(false); // =
        vezes2.setFocusable(false); // =
        vezes3.setFocusable(false); // tira a caixa de foco do botao
        // JPanels
        itens = new JPanel();// cria um JPanel
        itens.setSize(300, 500);// define o tamanho
        itens.setLayout(new GridLayout(10, 1));// define o tipo de layout pra grid
        itens.setBackground(Color.red);// define a cor de fundo
        itens.setBounds(150, 73, 300, 500);// define a posicao do frame e o tamanho
        itens.add(item0);// adiciona texto ao painel
        itens.add(item1);// =
        itens.add(item2);// =
        itens.add(item3);// =
        itens.add(item4);// =
        itens.add(item5);// =
        itens.add(item6);// =
        itens.add(item7);// =
        itens.add(item8);// =
        itens.add(item9);// adiciona texto ao painel
        // Jframe
        this.setLayout(null); // define o tipo de layout pra nenhum
        this.setSize(1280, 720); // define o tamanho do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
        this.setResizable(false); // não deixa o tamanho ser moficavel
        this.setTitle("Carrinho"); // da um titulo ao JFrame
        this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
        this.add(texto1);// adiciona texto
        this.add(botaoVoltar); // adiciona botoes
        this.add(botaoConcluir); // adiciona botoes
        this.add(vezes1);// adiciona botoes de selecao
        this.add(vezes2);// =
        this.add(vezes3);// =
        this.add(credito);// =
        this.add(debito);// adiciona botoes de selecao
        this.add(itens);// adiciona o painel
        this.setVisible(true); // deixa o JFrame visivel
    }

    ViewVenda() {
        // texto
        texto1 = new JLabel();// cria texto
        texto1.setText("Obrigado pela compra!");// define o texto
        texto1.setBounds(0, 0, 800, 100);// posicao do texto e tamanho da sua "caixa"
        texto1.setForeground(Color.cyan);// cor do texto
        texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));// fonte do texto
        texto1.setHorizontalAlignment(JLabel.CENTER);// deixa o texto no centro da "caixa"
        // Jframe
        this.setLayout(null); // define o tipo de layout pra nenhum
        this.setSize(800, 150); // define o tamanho do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o botão X como fechar
        this.setResizable(false); // não deixa o tamanho ser moficavel
        this.setTitle("Compra Finalizada"); // da um titulo ao JFrame
        this.getContentPane().setBackground(Color.gray); // define a cor de fundo do JFrame
        this.add(texto1);// adiciona texto
        this.setVisible(true); // deixa o JFrame visivel
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }
}
