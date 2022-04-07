package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControleDados;

public class ViewInfos implements ActionListener {

	private JFrame janela = new JFrame("Loja de Ebook");
	private JLabel titulo = new JLabel("Visualizar informacoes");
	private JButton listarEditora = new JButton("Listar editoras");
	private JButton listarEbook = new JButton("Listar e-books");
	private JButton pessoalInfo = new JButton("Gerenciar informacoes pessoais");
	private JButton voltar = new JButton("Voltar");
	public ControleDados dados;
	String cliente;

	public ViewInfos(ControleDados d, String c) {
		cliente = c;
		dados = d;
		janela.setLayout(null);
		janela.setSize(600, 500);

		titulo.setBounds(180, 20, 220, 30);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));

		listarEditora.setBounds(160, 90, 250, 30);
		listarEbook.setBounds(160, 150, 250, 30);
		pessoalInfo.setBounds(160, 210, 250, 30);
		voltar.setBounds(220, 400, 120, 30);

		listarEditora.addActionListener(this);
		listarEbook.addActionListener(this);
		pessoalInfo.addActionListener(this);
		voltar.addActionListener(this);

		listarEditora.setForeground(Color.cyan);
		listarEbook.setForeground(Color.cyan);
		pessoalInfo.setForeground(Color.cyan);
		voltar.setForeground(Color.cyan);

		listarEditora.setBackground(Color.darkGray);
		listarEbook.setBackground(Color.darkGray);
		pessoalInfo.setBackground(Color.darkGray);
		voltar.setBackground(Color.darkGray);

		janela.add(titulo);
		janela.add(listarEditora);
		janela.add(listarEbook);
		janela.add(pessoalInfo);
		janela.add(voltar);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == listarEditora) {
			new ListView(dados, 2);

		} else if (src == listarEbook) {
			new ListView(dados, 3);

		} else if (src == pessoalInfo) {
			new ViewPessoalInfos(cliente);

		} else if (src == voltar) {
			janela.dispose();
		}

	}

}
