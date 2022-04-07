package view;

/**
 * @author Alexia
 * @version 1.8
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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

public class ListView implements ActionListener, ListSelectionListener {

	private JList<String> listaNomesCadastrados;
	private ControleCliente cliente = new ControleCliente();
	private ControleEditora editora = new ControleEditora();
	private ControleEbook ebook = new ControleEbook();
	public ControleDados dados;
	private String[] listaNomes = new String[50];
	private static JFrame list;
	private JButton refreshCliente;
	private JButton refreshEditora;
	private JButton refreshEbook;
	private JScrollPane scrollPane;

	/**
	 * Cria as telas de listagem
	 * 
	 * @param dados controller de dados e a opcao selecionada: editora, ebook ou
	 *              cliente
	 * @return vazio
	 */
	public ListView(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1: // listar clientes
			list = new JFrame("Listagem de clientes");
			list.setLayout(null);
			list.setSize(500, 500);

			refreshCliente = new JButton("Refresh");
			refreshCliente.setBounds(130, 160, 100, 30);
			list.add(refreshCliente);

			listaNomes = cliente.showNames();
			listaNomesCadastrados = new JList<String>(listaNomes);
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(listaNomesCadastrados);
			scrollPane.setBounds(60, 30, 250, 120);
			list.add(scrollPane);
			listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaNomesCadastrados.setVisibleRowCount(5);
			listaNomesCadastrados.addListSelectionListener(this);

			refreshCliente.addActionListener(this);
			list.setSize(400, 250);
			list.setVisible(true);
			break;
		case 2: // listar editoras
			list = new JFrame("Listagem de editoras");
			list.setLayout(null);
			list.setSize(500, 500);

			refreshEditora = new JButton("Refresh");
			refreshEditora.setBounds(130, 160, 100, 30);
			list.add(refreshEditora);

			listaNomes = editora.showNames();
			listaNomesCadastrados = new JList<String>(listaNomes);
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(listaNomesCadastrados);
			scrollPane.setBounds(60, 30, 250, 120);
			list.add(scrollPane);
			listaNomesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaNomesCadastrados.setVisibleRowCount(5);
			listaNomesCadastrados.addListSelectionListener(this);

			refreshEditora.addActionListener(this);
			list.setSize(400, 250);
			list.setVisible(true);
			break;
		case 3: // listar ebooks
			list = new JFrame("Listagem de ebooks");
			list.setLayout(null);
			list.setSize(500, 500);

			refreshEbook = new JButton("Refresh");
			refreshEbook.setBounds(130, 160, 100, 30);
			list.add(refreshEbook);

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

			refreshEbook.addActionListener(this);
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

	@Override
	/**
	 * Funcao para ler os eventos dos botoes
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// atualiza lista de nomes dos clientes
		if (src == refreshCliente) {
			listaNomesCadastrados.setListData(new ControleCliente().showNames());
			listaNomesCadastrados.updateUI();
		} // atualiza lista de nomes das editoras
		else if (src == refreshEditora) {
			listaNomesCadastrados.setListData(new ControleEditora().showNames());
			listaNomesCadastrados.updateUI();
		} // atualiza lista de titulos dos ebook
		else if (src == refreshEbook) {
			listaNomesCadastrados.setListData(new ControleEbook().showTitulos());
			listaNomesCadastrados.updateUI();
		}

	}

}
