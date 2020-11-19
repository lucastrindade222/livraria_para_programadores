package livraria_para_programadores_api.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import livraria_para_programadores_api.controle.Controle_livro;
import livraria_para_programadores_api.model.Livros;

public class Home extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lbNome;

	private JButton btLogin;

	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();

	private Home home;

	public Home() {

		this.setTitle("Livraria");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.lbNome = new JLabel("Livros");

		this.btLogin = new JButton("Login");
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				Login l = new Login();
				l.setVisible(true);

			}
		});

		JButton Refresh = new JButton("Refresh");
		Refresh.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				home.dispose();
				Home h = new Home();
				h.setVisible(true);

				new Controle_livro(h);

			}
		});
		this.btLogin.setBounds(826, 11, 89, 23);
		this.lbNome.setBounds(450, 11, 150, 20);
		Refresh.setBounds(450, 493, 89, 23);

		criarTabela();
		barraRolagem = new JScrollPane(tabela);
		getContentPane().add(lbNome);
		getContentPane().add(btLogin);
		getContentPane().add(barraRolagem);
		getContentPane().add(Refresh);
		barraRolagem.setBounds(200,60, 580, 420);
	}

	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	private void criarTabela() {

		tabela = new JTable(modelo);
		modelo.addColumn("id");
		modelo.addColumn("Nome");
		modelo.addColumn("Autor");
		modelo.addColumn("Descrição");
		modelo.addColumn("Valor");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
		
	}

	public void adicionarContatoTabela(Livros livro) {
		System.out.println("nome" + livro.getNome());
		modelo.addRow(new Object[] { livro.getID(), livro.getNome(), livro.getAutor(), livro.getDescricao(),
				livro.getValor() });
	}

	public void ref(Home h) {
		this.home = h;
	}

	public void limparTabela() {
		modelo.setRowCount(0);

	}

	public JLabel getLbNome() {
		return lbNome;
	}

	public void setLbNome(JLabel lbNome) {
		this.lbNome = lbNome;
	}

	public JScrollPane getBarraRolagem() {
		return barraRolagem;
	}

	public void setBarraRolagem(JScrollPane barraRolagem) {
		this.barraRolagem = barraRolagem;
	}

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getBtCadastrar() {
		return btLogin;
	}

	public void setBtCadastrar(JButton btLogin) {
		this.btLogin = btLogin;
	}

}
