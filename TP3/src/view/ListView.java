package view;

/**
 * @author Alexia
 * @version 1.8
*/

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleEbook;
import controller.ControleEditora;

public class ListView implements ListSelectionListener {

	private JList<String> listaNomesCadastrados;
	private ControleCliente cliente = new ControleCliente();
	private ControleEditora editora = new ControleEditora();
	private ControleEbook ebook = new ControleEbook();
	public ControleDados dados;
	private String[] listaNomes = new String[50];
	private static JFrame list;

	private JScrollPane scrollPane;

	/**
	 * Cria as telas de listagem
	 * 
	 * @param d  - dados armazenados
	 * @param op - numero da opcao selecionada: listar cliente, editora ou ebook
	 */
	public ListView(ControleDados d, int op) {
		dados = d;

		switch (op) {

		case 1: // listar clientes
			list = new JFrame("Listagem de clientes");
			list.setLayout(null);
			list.setSize(500, 500);

			listaNomes = cliente.showNames();
			listaNomesCadastrados = new JList<String>(listaNomes);
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(listaNomesCadastrados);
			scrollPane.setBounds(60, 30, 250, 120);
			list.add(scrollPane);
			listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaNomesCadastrados.setVisibleRowCount(5);
			listaNomesCadastrados.addListSelectionListener(this);

			list.setSize(400, 250);
			list.setVisible(true);
			break;
		case 2: // listar editoras
			list = new JFrame("Listagem de editoras");
			list.setLayout(null);
			list.setSize(500, 500);

			listaNomes = editora.showNames();
			listaNomesCadastrados = new JList<String>(listaNomes);
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(listaNomesCadastrados);
			scrollPane.setBounds(60, 30, 250, 120);
			list.add(scrollPane);
			listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaNomesCadastrados.setVisibleRowCount(5);
			listaNomesCadastrados.addListSelectionListener(this);
			list.setSize(400, 250);
			list.setVisible(true);
			break;
		case 3: // listar ebooks
			list = new JFrame("Listagem de ebooks");
			list.setLayout(null);
			list.setSize(500, 500);

			scrollPane = new JScrollPane();
			listaNomes = ebook.showTitulos();
			listaNomesCadastrados = new JList<String>(listaNomes);
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(listaNomesCadastrados);
			scrollPane.setBounds(60, 30, 250, 120);
			list.add(scrollPane);
			listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaNomesCadastrados.setVisibleRowCount(5);
			listaNomesCadastrados.addListSelectionListener(this);

			list.setSize(400, 250);
			list.setVisible(true);
			break;
		}

	}

	@Override
	/**
	 * Funcao para ler os eventos da lista
	 */
	public void valueChanged(ListSelectionEvent e) {

	}

}
