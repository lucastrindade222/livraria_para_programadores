package livraria_para_programadores_api.controle;

import livraria_para_programadores_api.banco.livrosDAO;
import livraria_para_programadores_api.model.Autor;
import livraria_para_programadores_api.model.Livros;

;

 

public class ControleCadastrar {

	Controle_livro ca;
    
	public void salvarLivro(Livros livros) {
		 
				try {
					
					livrosDAO doa= livrosDAO.getInstance();
					
					
					
					doa.salvar(livros);
				 
                    
                   					

				} catch (Exception ex) {
					 System.out.println("salvar � salvar"+ ex);
					ex.printStackTrace();

				}
			}
	
	 
	



public void salvarAutor(Autor autor) {
	 
	try {
		
		livrosDAO doa= livrosDAO.getInstance();
		
		
		
		doa.salvarAutor(autor);
	 
        
       					

	} catch (Exception ex) {
		 System.out.println("salvar � salvar"+ ex);
		ex.printStackTrace();

	}
}



}
