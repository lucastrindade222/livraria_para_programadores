package livraria_para_programadores_api.controle;

import livraria_para_programadores_api.banco.livrosDAO;

public class ControleDeletar {
	
	
	public void Deletar(Integer id) {
		try {
			
			
			livrosDAO doa= livrosDAO.getInstance();
			doa.deletar(id);
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	public void DeletarAutor(Integer id) {
		try {
			
			
			livrosDAO doa= livrosDAO.getInstance();
			doa.deletarAutor(id);
			
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	
	
	

}
