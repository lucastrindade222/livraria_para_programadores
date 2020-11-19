package livraria_para_programadores_api.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import livraria_para_programadores_api.controle.ControleAtualizar;
import livraria_para_programadores_api.controle.ControleCadastrar;
import livraria_para_programadores_api.model.Autor;



public class AtualizarAutor  extends javax.swing.JFrame implements ActionListener {

 
 

	private static final long serialVersionUID = 1L;
	private JButton salvar = new JButton("Salvar");
	private JTextField id;
	private JTextField name;
	private JTextField dis;
	private JTextField nascimento;
	private JLabel jid;
	private JLabel jnome;
	private JLabel jdis;
	private JLabel jnascimento;

	public AtualizarAutor() {
		setTitle("Atualizar autor");
		setVisible(true);
		setResizable(true);
		setSize(400, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jid = new JLabel("ID");
		jid.setBounds(50, 20, 155, 30);
		add(jid);

		id = new JTextField();
		id.setBounds(50, 50, 300, 20);
		add(id);
		
		jnome = new JLabel("Nome");
		jnome.setBounds(50, 80, 155, 30);
		add(jnome);

		name = new JTextField();
		name.setBounds(50, 110, 300, 20);
		add(name);

		jdis = new JLabel("Discrição");
		jdis.setBounds(50, 140, 155, 30);
		add(jdis);

		dis = new JTextField();
		dis.setBounds(50, 165, 300, 20);
		add(dis);

		jnascimento = new JLabel("Data de nascimento");
		jnascimento.setBounds(50, 200, 155, 30);
		add(jnascimento);

		nascimento = new JTextField();
		nascimento.setBounds(50, 230, 300, 20);
		add(nascimento);

		salvar.setBounds(130, 260, 160, 23);
		add(salvar);

		salvar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ControleAtualizar obj = new ControleAtualizar();

		Autor a = new Autor();
     	Integer ids = Integer.parseInt(id.getText());
        a.setID(ids);
		a.setNome(name.getText());
		a.setNacimento(nascimento.getText());
		a.setDescricao(dis.getText());

		obj.atualizarAutor(a);
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