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
import controller.ControleEbook;
import controller.ControleEditora;
import model.Editora;

public class ListView implements ActionListener, ListSelectionListener {

	private JList<String> listaNomesCadastrados;
	private ControleCliente cliente = new ControleCliente();
	private ControleEditora editora = new ControleEditora();
	private ControleEbook ebook = new ControleEbook();
	public ControleDados dados;
	private String[] listaNomes = new String[50];
	private static JFrame list;
	private JButton refresh;
	private JButton refresh2;
	private JButton refresh3;

	public ListView(ControleDados d, int op) {
		dados = d;

		switch (op) {
			case 1: // listar clientes
				list = new JFrame("Listagem");
				list.setLayout(null);
				list.setSize(500, 500);
				JLabel nome = new JLabel("Clientes cadastrados");
				nome.setBounds(120, 10, 250, 30);
				list.add(nome);

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
				break;
			case 2: // listar editoras
				list = new JFrame("Listagem Editoras");
				list.setLayout(null);
				list.setSize(500, 500);
				JLabel nome1 = new JLabel("Editoras cadastrados");
				nome1.setBounds(120, 10, 250, 30);
				list.add(nome1);

				refresh2 = new JButton("Refresh");
				refresh2.setBounds(130, 180, 100, 30);
				list.add(refresh2);

				listaNomes = editora.showEditoraNames();
				listaNomesCadastrados = new JList<String>(listaNomes);
				listaNomesCadastrados.setBounds(60, 50, 250, 120);
				listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaNomesCadastrados.setVisibleRowCount(5);
				list.add(listaNomesCadastrados);

				listaNomesCadastrados.addListSelectionListener(this);
				refresh2.addActionListener(this);
				list.setSize(400, 250);
				list.setVisible(true);
				break;
			case 3: // listar ebooks
				list = new JFrame("Listagem Ebooks");
				list.setLayout(null);
				list.setSize(500, 500);
				JLabel titulo = new JLabel("Ebooks cadastrados");
				titulo.setBounds(120, 10, 250, 30);
				list.add(titulo);

				refresh3 = new JButton("Refresh");
				refresh3.setBounds(130, 180, 100, 30);
				list.add(refresh3);

				listaNomes = ebook.showEbookTitulos();
				listaNomesCadastrados = new JList<String>(listaNomes);
				listaNomesCadastrados.setBounds(60, 50, 250, 120);
				listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaNomesCadastrados.setVisibleRowCount(1);
				list.add(listaNomesCadastrados);

				listaNomesCadastrados.addListSelectionListener(this);
				refresh3.addActionListener(this);
				list.setSize(400, 250);
				list.setVisible(true);
				break;
		}

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
		} else if (src == refresh2) {
			listaNomesCadastrados.setListData(new ControleEditora().showEditoraNames());
			listaNomesCadastrados.updateUI();
		} else if (src == refresh3) {
			listaNomesCadastrados.setListData(new ControleEbook().showEbookTitulos());
			listaNomesCadastrados.updateUI();
		}

	}

}
