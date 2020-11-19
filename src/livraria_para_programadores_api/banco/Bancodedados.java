package livraria_para_programadores_api.banco; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bancodedados {

	
	
	public static Connection getConnection() throws Exception {
		try {
			 
			Connection connection = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "181095306");
			return connection;
			
		} catch (SQLException e) {
			System.out.println("erri"+e);
			throw new Exception("Erro ao abrir conexao com o banco de dados.configuração do banco em https://github.com/lucastrindade222/livraria_para_programadores/blob/main/README.md");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}
