package view;

//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller .*;

public class ViewMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Loja de Ebook");
	public static ControleDados dados = new ControleDados();
	
	public ViewMenu(ControleDados d) {
		dados = d;
		
		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}
