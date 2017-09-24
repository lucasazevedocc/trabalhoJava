package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import trabalhojavanp1.objetos.Curso;

public class CursoDao {

	private Connection connection;

	public CursoDao() {

		this.connection = (Connection) new ConnectionFactory();
	}

	public void inserirCurso(Curso curso) throws SQLException {

		PreparedStatement query = this.connection.prepareStatement("INSERT INTO cursos(id, nome) VALUES(?, ?)");

		query.setString(1, curso.getCodCurso());
		query.setString(2, curso.getNomeDoCurso());

		query.execute();
		query.close();
		this.connection.close();
	}

	public void deletarCurso(Curso curso) throws SQLException {

		PreparedStatement query = this.connection.prepareStatement("DELETE FROM cursos WHERE id = ?");

		query.setString(1, curso.getCodCurso());

		query.execute();
		query.close();
		this.connection.close();
	}
	
	public void alteraNomeCurso(Curso curso) throws SQLException {
		
		PreparedStatement query = this.connection.prepareStatement("UPDATE cursos SET nome = ? WHERE id = ?");

		query.setString(1, curso.getNomeDoCurso());
		query.setString(2, curso.getCodCurso());

		query.execute();
		query.close();
		this.connection.close();
	}
}
