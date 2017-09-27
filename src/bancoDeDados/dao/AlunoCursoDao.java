package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import trabalhojavanp1.objetos.Aluno;
import trabalhojavanp1.objetos.Curso;

public class AlunoCursoDao {

	public void inserirAlunoCurso(Aluno aluno, Curso curso) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("INSERT INTO aluno_curso(id_aluno, id_curso) VALUES(?, ?)");
		query.setInt(1, aluno.getMatricula());
		query.setInt(2, curso.getCodCurso());

		if (query.execute()) {
			System.out.println("erro ao alterar");
		} else {
			System.out.println("usuario " + aluno.getMatricula() + " alterado com sucesso");
		}
		query.close();
	}

	public void deletaCurso(Curso curso) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("DELETE FROM aluno_curso WHERE id_curso = ?");
		query.setInt(1, curso.getCodCurso());

		query.execute();
		query.close();
	}

	public void deletaAluno(Aluno aluno) throws SQLException {

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("DELETE FROM aluno_curso WHERE id_aluno = ?");
		query.setInt(1, aluno.getMatricula());

		query.execute();
		query.close();
	}

	public ArrayList<Aluno> mostraAlunos(Curso curso) throws SQLException {

		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

		PreparedStatement query = new ConnectionFactory().getConnection()
				.prepareStatement("SELECT id, nome, endereco FROM alunos JOIN aluno_curso ON alunos.id = aluno_curso.id_aluno WHERE id_curso = ?");
		
		query.setInt(1, curso.getCodCurso());

		ResultSet resposta = query.executeQuery();

		while (resposta.next()) {
			Aluno a = new Aluno();
			a.setMatricula(resposta.getInt(1));
			a.setNome(resposta.getString(2));
			a.setEndereco(resposta.getString(3));
			listaAlunos.add(a);
		}

		query.close();

		return listaAlunos;
	}

}
