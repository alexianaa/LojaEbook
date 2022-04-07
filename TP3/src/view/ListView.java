package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.ControleCliente;
import controller.ControleDados;

public class ListView implements ActionListener, ListSelectionListener {

	private JList<String> listaNomesCadastrados;
	private ControleCliente cliente = new ControleCliente();
	private String[] listaNomes = new String[50];
	private static JFrame list = new JFrame("Listagem");
	private JButton refresh;

	public ListView(ControleDados dados, int op) {

		list.setLayout(null);
		list.setSize(500, 500);
		JLabel titulo = new JLabel("Clientes cadastrados");
		titulo.setBounds(120, 10, 250, 30);
		list.add(titulo);

		refresh = new JButton("Refresh");
		refresh.setBounds(130, 180, 100, 30);
		list.add(refresh);

		listaNomes = cliente.showNames();
		listaNomesCadastrados = new JList<String>(listaNomes);
		listaNomesCadastrados.setBounds(60, 50, 250, 120);
		listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaNomesCadastrados.setVisibleRowCount(5);
		list.add(listaNomesCadastrados);

		listaNomesCadastrados.addListSelectionListener(this);
		refresh.addActionListener(this);

		list.setSize(400, 250);
		list.setVisible(true);

		listaNomesCadastrados.updateUI();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// atualiza lista de nomes dos clientes
		if (src == refresh) {
			listaNomesCadastrados.setListData(new ControleCliente().showNames());
			listaNomesCadastrados.updateUI();
		}

	}

}
