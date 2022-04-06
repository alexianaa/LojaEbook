package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.ControleDados;

public class ListView implements ListSelectionListener {

	private JList<String> listaNomesCadastrados;
	private String[] listaNomes = new String[50];
	private static JFrame list = new JFrame("Listagem");

	public ListView(int op) {
		list.setLayout(null);
		list.setSize(400, 250);
		JLabel titulo = new JLabel("Clientes cadastrados");
		titulo.setBounds(120, 10, 250, 30);
		list.add(titulo);

		listaNomes = new ControleDados().showNames();
		listaNomesCadastrados = new JList<String>(listaNomes);
		listaNomesCadastrados.setBounds(20, 50, 350, 120);
		listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaNomesCadastrados.setVisibleRowCount(5);
		list.add(listaNomesCadastrados);
		listaNomesCadastrados.addListSelectionListener(this);

		list.setSize(400, 250);
		list.setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

}
