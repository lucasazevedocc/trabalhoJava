package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import trabalhojavanp1.objetos.Curso;
import trabalhojavanp1.objetos.Disciplina;

public class DisciplinaDao {

	private Connection connection;

	public DisciplinaDao() {
		this.connection = (Connection) new ConnectionFactory();
	}
	
	public void inserirDisciplina(Disciplina disc) throws SQLException {

		PreparedStatement query = this.connection.prepareStatement("INSERT INTO disciplinas(id, nome) VALUES(?, ?)");

		query.setString(1, disc.getCodDisciplina());
		query.setString(2, disc.getNomeDisciplina());

		query.execute();
		query.close();
		this.connection.close();
	}

	public void deletarDisciplina(Disciplina disc) throws SQLException {

		PreparedStatement query = this.connection.prepareStatement("DELETE FROM disciplinas WHERE id = ?");

		query.setString(1, disc.getCodDisciplina());

		query.execute();
		query.close();
		this.connection.close();
	}
	
	public void alteraNomeDisciplina(Disciplina disc) throws SQLException {
		
		PreparedStatement query = this.connection.prepareStatement("UPDATE disciplinas SET nome = ? WHERE id = ?");

		query.setString(1, disc.getNomeDisciplina());
		query.setString(2, disc.getCodDisciplina());

		query.execute();
		query.close();
		this.connection.close();
	}

}
