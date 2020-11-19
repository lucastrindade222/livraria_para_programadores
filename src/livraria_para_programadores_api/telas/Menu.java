package livraria_para_programadores_api.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import livraria_para_programadores_api.controle.Controle_livro;

public class Menu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton btCadastraLivro = new JButton("Cria Livro");
	private JButton btCadastraEscritor = new JButton("Criar Escritor");
	private JButton btAtualizaLivro = new JButton("Atualizar Livro");
	private JButton btAtualizaEscritor = new JButton("Atualizar Escritor");
	private JButton btDeletarLivro = new JButton("Delete Livro");
	private JButton btDeletarEscritor = new JButton("Delete Escritor");

	public Menu() {
		setTitle("novo teste");
		setVisible(true);
		setResizable(true);
		setSize(400, 250);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btCadastraLivro.setBounds(15, 50, 160, 23);
		add(btCadastraLivro);

		btCadastraEscritor.setBounds(220, 50, 160, 23);
		add(btCadastraEscritor);

		btAtualizaLivro.setBounds(15, 80, 160, 23);
		add(btAtualizaLivro);

		btAtualizaEscritor.setBounds(220, 80, 160, 23);
		add(btAtualizaEscritor);

		btDeletarLivro.setBounds(15, 110, 160, 23);
		add(btDeletarLivro);

		btDeletarEscritor.setBounds(220, 110, 160, 23);
		add(btDeletarEscritor);

		btCadastraLivro.addActionListener(this);
		btCadastraEscritor.addActionListener(this);
		btAtualizaLivro.addActionListener(this);
		btAtualizaEscritor.addActionListener(this);
		btDeletarLivro.addActionListener(this);
		btDeletarEscritor.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btCadastraLivro) {
			CadastrarLivro l = new CadastrarLivro();
			new Controle_livro(l);
			l.setVisible(true);

			this.dispose();
		}
		if (e.getSource() == btCadastraEscritor) {
			CadastrarAutor c = new CadastrarAutor();
			c.setVisible(true);

			this.dispose();
		}
		if (e.getSource() == btAtualizaLivro) {
			AtualizarLivro a = new AtualizarLivro();
			a.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btAtualizaEscritor) {
			AtualizarAutor a = new AtualizarAutor();
			a.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btDeletarLivro) {
			DeletarLivro d = new DeletarLivro();
			d.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btDeletarEscritor) {
			DeletarAutor d = new DeletarAutor();
			d.setVisible(true);
			this.dispose();
		}

	}

}
