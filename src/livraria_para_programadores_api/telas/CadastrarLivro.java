package livraria_para_programadores_api.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import livraria_para_programadores_api.controle.ControleCadastrar;
import livraria_para_programadores_api.model.Autor;
import livraria_para_programadores_api.model.Livros;

public class CadastrarLivro extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton salvar = new JButton("Salvar");
	private JTextField name;
	private JTextField Autor;
	private JTextField Descricao;
	private JTextField Valor;
	private JLabel jtitulo = new JLabel("Autores ");;
	private JLabel jnome;
	private JLabel jAutor;
	private JLabel jDescricao;
	private JLabel jValor;

	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();

	private CadastrarLivro obj;

	public CadastrarLivro() {
		setTitle("Cadastra Livro");
		setVisible(true);
		setResizable(true);
		setSize(1100, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		;
		jtitulo.setBounds(700, 5, 155, 30);
		add(jtitulo);

		jnome = new JLabel("Nome");
		jnome.setBounds(50, 20, 155, 30);
		add(jnome);

		name = new JTextField();
		name.setBounds(50, 50, 300, 20);
		add(name);

		jDescricao = new JLabel("Discrição");
		jDescricao.setBounds(50, 80, 155, 30);
		add(jDescricao);

		Descricao = new JTextField();
		Descricao.setBounds(50, 110, 300, 20);
		add(Descricao);

		jValor = new JLabel("Valor");
		jValor.setBounds(50, 140, 155, 30);
		add(jValor);

		Valor = new JTextField();
		Valor.setBounds(50, 170, 300, 20);
		add(Valor);

		salvar.setBounds(130, 210, 160, 23);
		add(salvar);

		salvar.addActionListener(this);

		criarTabela();
		barraRolagem = new JScrollPane(tabela);

		getContentPane().add(barraRolagem);
		barraRolagem.setBounds(400, 30, 580, 420);

	}

	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ControleCadastrar obj = new ControleCadastrar();

		Integer inx = tabela.getSelectedRow();
		Integer c = 1;

		if (tabela.getSelectedRow() != -1) {
			String autor = tabela.getValueAt(inx, c).toString();

			Livros li = new Livros();

			li.setNome(name.getText());
			li.setDescricao(Descricao.getText());
			li.setAutor(autor);
			li.setValor("R$:" + Valor.getText());

			obj.salvarLivro(li);
			JOptionPane.showMessageDialog(null, "Livro Salvo ");
			this.dispose();
		} else {
			exibirAlerta("Não foi celecionado o autor.");
			exibirAlerta("Celecione um autor para salvar o livro");
		}

	}

	private void criarTabela() {

		tabela = new JTable(modelo);
		modelo.addColumn("id");
		modelo.addColumn("Nome");
		modelo.addColumn("Nacimento");
		modelo.addColumn("descricao");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
	}

	public void adicionarContatoTabela(Autor obj) {
		System.out.println("nome" + obj.getNome());
		modelo.addRow(new Object[] { obj.getID(), obj.getNome(), obj.getNacimento(), obj.getDescricao() });
	}

	public void ref(CadastrarLivro l) {
		this.obj = l;
	}

	public void limparTabela() {
		modelo.setRowCount(0);

	}

	public void setName(JTextField Name) {
		name = Name;
	}

}
