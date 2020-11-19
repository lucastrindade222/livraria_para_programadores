package livraria_para_programadores_api.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import livraria_para_programadores_api.model.Autor;
import livraria_para_programadores_api.model.Livros;

public class livrosDAO {

	private Connection connection;
	private static livrosDAO dao;

	public livrosDAO() throws Exception {
	}

	public void openConnectio() throws Exception {

		try {

			connection = Bancodedados.getConnection();

		} catch (Exception e) {
			System.out.println("erro" + e);
			throw e;
		}

	}

	public static livrosDAO getInstance() throws Exception {
		if (dao == null) {
			dao = new livrosDAO();
		}
		dao.openConnectio();
		return dao;
	}

	public void salvar(Livros l) throws Exception {

		try {
			String sql = "INSERT INTO livros (nome, autor,descricao,Valor) values (?, ?, ?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, l.getNome());
			stmt.setString(2, l.getAutor());
			stmt.setString(3, l.getDescricao());
			stmt.setString(4, l.getValor());

			System.out.println("Livro Salvo com sucesso!!!");

			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao salvar um Livro");
		}

	}

	public List<Livros> buscarContatos() throws Exception {
		try {
			List<Livros> Li = new ArrayList<>();
			String sql = "SELECT * FROM livros ORDER BY ID ASC";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Livros livro = new Livros();
				livro.setID(rs.getInt("ID"));
				livro.setNome(rs.getString("nome"));
				livro.setAutor(rs.getString("autor"));
				livro.setDescricao(rs.getString("descricao"));
				livro.setValor(rs.getString("Valor"));
				Li.add(livro);
			}

			rs.close();
			return Li;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao buscar os Livro.");
		}
	}

	public void atualizar(Livros livros) {

		try {
			String sql = "UPDATE livros SET  nome=?,autor=?,descricao=?,Valor=? WHERE ID=?;";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, livros.getNome());
			stmt.setString(2, livros.getAutor());
			stmt.setString(3, livros.getDescricao());
			stmt.setString(4, livros.getValor());
			stmt.setInt(5, livros.getID());
			System.out.println("O livro foi atualzado.");
			stmt.execute();

		} catch (SQLException e) {
			System.out.println("ERRO a atualizar:" + e);
			e.printStackTrace();

		}

	}

	public void deletar(Integer ID) {

		try {
			String sql = "DELETE FROM  livros WHERE  ID=" + ID + "";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.execute();

			System.out.println("Livor com o ID:" + ID + ",foi deletado.");

		} catch (SQLException e) {
			System.out.println("ERRO a deletar:" + e);
			e.printStackTrace();
		}

	}

	// autor

	public List<Autor> buscarAutor() throws Exception {
		try {
			List<Autor> Au = new ArrayList<>();
			String sql = "SELECT * FROM autor ORDER BY ID ASC";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Autor autor = new Autor();
				autor.setID(rs.getInt("ID"));
				autor.setNome(rs.getString("nome"));
				autor.setNacimento(rs.getString("nacimento"));
				autor.setDescricao(rs.getNString("descricao"));

				Au.add(autor);
			}

			rs.close();
			return Au;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao buscar os Livro.");
		}
	}

	
	public void salvarAutor(Autor a) throws Exception {

		try {
			String sql = "INSERT INTO autor(nome,nacimento,descricao) values (?, ?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getNacimento());
			stmt.setString(3, a.getDescricao());
	 

			System.out.println("Autor Salvo com sucesso!!!");

			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao salvar um Livro");
		}

	}
	
	
	
	
	public void deletarAutor(Integer ID) {

		try {
			String sql = "DELETE FROM  autor WHERE  ID=" + ID + "";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.execute();

			System.out.println("Autor com o ID:" + ID + ",foi deletado.");

		} catch (SQLException e) {
			System.out.println("ERRO a deletar:" + e);
			e.printStackTrace();
		}

	}
	
	
	public void atualizarAutor(Autor autor) {

		try {
			String sql = "UPDATE autor SET nome=?,nacimento=?,descricao=? WHERE ID=?;";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, autor.getNome());
			stmt.setString(2, autor.getNacimento());
			stmt.setString(3, autor.getDescricao());
			stmt.setInt(3, autor.getID());
			System.out.println("O autor foi atualzado.");
			stmt.execute();

		} catch (SQLException e) {
			System.out.println("ERRO a atualizar:" + e);
			e.printStackTrace();

		}

	}
	
	
}
