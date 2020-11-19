package livraria_para_programadores_api.model;

public class Autor {
	private Integer ID;
	private String nome;
	private String nacimento;
	private String descricao;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacimento() {
		return nacimento;
	}

	public void setNacimento(String nacimento) {
		this.nacimento = nacimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
