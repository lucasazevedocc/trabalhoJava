package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import trabalhojavanp1.objetos.Curso;
import trabalhojavanp1.objetos.Professor;

public class ProfessorDao {

	
	private Connection connection;

	public ProfessorDao() {

		this.connection = (Connection) new ConnectionFactory();
	}

	public void inserirProfessor(Professor prof) throws SQLException {

		PreparedStatement query = this.connection.prepareStatement("INSERT INTO professores(id, nome, formacao) VALUES(?, ?, ?)");

		query.setString(1, prof.getRegistro());
		query.setString(2, prof.getNome());
		query.setString(3, prof.getFormacao());

		query.execute();
		query.close();
		this.connection.close();
	}

	public void deletarProfessor(Professor prof) throws SQLException {

		PreparedStatement query = this.connection.prepareStatement("DELETE FROM professores WHERE id = ?");

		query.setString(1, prof.getRegistro());

		query.execute();
		query.close();
		this.connection.close();
	}
	
	public void alteraNomeCurso(Professor prof) throws SQLException {
		
		PreparedStatement query = this.connection.prepareStatement("UPDATE professores SET nome = ?, formacao = ? WHERE id = ?");

		query.setString(1, prof.getNome());
		query.setString(2, prof.getFormacao());
		query.setString(2, prof.getRegistro());

		query.execute();
		query.close();
		this.connection.close();
	}
}
