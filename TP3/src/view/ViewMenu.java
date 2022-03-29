package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class ViewMenu implements ActionListener {

	private static JFrame janela = new JFrame("Loja de Ebook");
	
	public ViewMenu() {
		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	
	public static void main(String[] args) {
		ViewMenu menu = new ViewMenu();
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
