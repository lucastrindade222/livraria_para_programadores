package livraria_para_programadores_api.controle; 

import java.util.ArrayList;
import java.util.List;

import livraria_para_programadores_api.banco.livrosDAO;
import livraria_para_programadores_api.model.Autor;
import livraria_para_programadores_api.model.Livros;
import livraria_para_programadores_api.telas.CadastrarAutor;
import livraria_para_programadores_api.telas.CadastrarLivro;
import livraria_para_programadores_api.telas.Home;

 

public class Controle_livro {

	private Home home;
	
	private CadastrarLivro livro;

	private CadastrarAutor ca;

	public Controle_livro(Home home) {
		this.home = home;
		System.out.println("testt");

		carregarLivros();
		home.ref(home);
	}

	
	public Controle_livro(CadastrarLivro obj) {
		this.livro = obj;
		System.out.println("testt");

		carregarAutor();
		livro.ref(livro);
	}
 


	public Livros getContatoTela() {
		Livros livro = new Livros();
		livro.setNome(ca.getName().toString());
		livro.setAutor(ca.getAltor().toString());
//		livro.setDescricao(ca.getDis().toString());
		return livro;
	}
	
 

	public void carregarLivros() {

		System.out.println("testt");
		try {
			List<Livros> livros = new ArrayList<>();
			livrosDAO doa = livrosDAO.getInstance();
			livros = doa.buscarContatos();

			for (Livros li : livros) {
				home.adicionarContatoTabela(li);
			}

		} catch (Exception e) {
			e.printStackTrace();
			home.exibirAlerta("ERRO:" + e.getMessage());
		}

	}
	

	public void carregarAutor() {

		System.out.println("testt");
		try {
			List<Autor> autors = new ArrayList<>();
			livrosDAO doa = livrosDAO.getInstance();
			autors = doa.buscarAutor();

			for (Autor Au : autors) {
				livro.adicionarContatoTabela(Au);
			}

		} catch (Exception e) {
			e.printStackTrace();
			livro.exibirAlerta("ERRO:" + e.getMessage());
		}

	}
	

}
