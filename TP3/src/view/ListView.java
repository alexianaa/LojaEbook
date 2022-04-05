package view;

import javax.swing.*;
import javax.swing.event.*;

import controller.*;

public class ListView implements ListSelectionListener {

    private JList<String> listaNomesCadastrados;
    private String[] listaNomes = new String[50];
    private static JFrame list = new JFrame("Listagem");

    public ListView() {
        list.setLayout(null);
		list.setSize(400, 250);
        JLabel titulo = new JLabel("Clientes cadastrados");
		titulo.setBounds(120, 10, 250, 30);
        list.add(titulo);

        listaNomes = new ControleDados().showNames();
        listaNomesCadastrados = new JList<String>(listaNomes);
        listaNomesCadastrados.setBounds(20, 50, 350, 120);
        listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaNomesCadastrados.setVisibleRowCount(10);
        list.add(listaNomesCadastrados);
        listaNomesCadastrados.addListSelectionListener(this);

        list.setSize(400, 250);
        list.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
		

	}

}
