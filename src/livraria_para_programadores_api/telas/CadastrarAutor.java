package livraria_para_programadores_api.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import livraria_para_programadores_api.controle.ControleCadastrar;
import livraria_para_programadores_api.model.Autor;
import livraria_para_programadores_api.model.Livros;

public class CadastrarAutor extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton salvar = new JButton("Salvar");
	private JTextField name;
	private JTextField dis;
	private JTextField nascimento;

	private JLabel jnome;
	private JLabel jdis;
	private JLabel jnascimento;

	public CadastrarAutor() {
		setTitle("Cadastra autor");
		setVisible(true);
		setResizable(true);
		setSize(400, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jnome = new JLabel("Nome");
		jnome.setBounds(50, 20, 155, 30);
		add(jnome);

		name = new JTextField();
		name.setBounds(50, 50, 300, 20);
		add(name);

		jdis = new JLabel("Discrição");
		jdis.setBounds(50, 80, 155, 30);
		add(jdis);

		dis = new JTextField();
		dis.setBounds(50, 110, 300, 20);
		add(dis);

		jnascimento = new JLabel("Data de nascimento");
		jnascimento.setBounds(50, 140, 155, 30);
		add(jnascimento);

		nascimento = new JTextField();
		nascimento.setBounds(50, 165, 300, 20);
		add(nascimento);

		salvar.setBounds(130, 200, 160, 23);
		add(salvar);

		salvar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ControleCadastrar obj = new ControleCadastrar();

		Autor a = new Autor();

		a.setNome(name.getText());
		a.setNacimento(nascimento.getText());
		a.setDescricao(dis.getText());
		 

		obj.salvarAutor(a);
		JOptionPane.showMessageDialog(null, "Livro Salvo ");
		this.dispose();

	}

	public void setName(JTextField Name) {
		name = Name;
	}

	public JTextField getAltor() {
		return dis;
	}

	public void setAltor(JTextField altor) {
		dis = altor;
	}

}
