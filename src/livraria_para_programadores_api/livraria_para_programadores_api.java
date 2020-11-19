package livraria_para_programadores_api;

import livraria_para_programadores_api.controle.Controle_livro;
import livraria_para_programadores_api.telas.Home;

public class livraria_para_programadores_api {

	public static void main(String[] args) {

		try {

			Home h = new Home();
			h.setVisible(true);
			 
			new Controle_livro(h);

 

		} catch (Exception e) {
			System.out.println("ERRO menu:" + e);
			e.printStackTrace();
		}

	}

}
