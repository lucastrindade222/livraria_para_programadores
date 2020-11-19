package livraria_para_programadores_api.controle;

import livraria_para_programadores_api.banco.livrosDAO;
import livraria_para_programadores_api.model.Autor;
import livraria_para_programadores_api.model.Livros;

public class ControleAtualizar {

	public void atualizar(Livros livros) {
		try {
			
			
			livrosDAO doa= livrosDAO.getInstance();
			doa.atualizar(livros); 
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	public void atualizarAutor(Autor autor) {
		try {
			
			
			livrosDAO doa= livrosDAO.getInstance();
			doa.atualizarAutor(autor); 
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
