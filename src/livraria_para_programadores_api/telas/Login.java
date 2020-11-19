package livraria_para_programadores_api.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JLabel jnome;
	private JLabel jsenha;
	private JTextField fienome;
	private JTextField fiesenha;
	private JButton btLogin = new JButton("Entrea");

	public Login() {

		btLogin.addActionListener(this);

		setTitle("novo teste");
		setVisible(true);
		setResizable(true);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jnome = new JLabel("Nome");
		jnome.setBounds(80, 50, 155, 30);
		add(jnome);
		jsenha = new JLabel("Senha");
		jsenha.setBounds(80, 90, 155, 30);
		add(jsenha);

		fienome = new JTextField();
		fienome.setBounds(130, 50, 155, 30);
		add(fienome);

		fiesenha = new JTextField();
		fiesenha.setBounds(130, 90, 155, 30);
		add(fiesenha);

		btLogin.setBounds(150, 150, 89, 23);
		add(btLogin);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (fienome.getText().equals("DEV") && fiesenha.getText().equals("12345")) {
			JOptionPane.showMessageDialog(null, "entrado");
			Menu m = new Menu();
			m.setVisible(true);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "nome ou senha incoretas");
			JOptionPane.showMessageDialog(null, "senha se encontra em https://github.com/lucastrindade222/livraria_para_programadores/blob/main/README.md");

		}

	}

}