package test;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.AlunoCursoDao;
import dao.AlunoDao;
import trabalhojavanp1.objetos.Aluno;
import trabalhojavanp1.objetos.Curso;

public class teste {

	
	public static void main(String[] args) throws SQLException {
		Aluno aluno = new Aluno("leo", "tantofaz", null);
		Curso curso = new Curso("aa", null);
		AlunoCursoDao dao = new AlunoCursoDao();
		aluno.setMatricula(30);
		curso.setCodCurso(30);

		ArrayList<Aluno> a = dao.mostraAlunos(curso)	;
		
		System.out.println(a.get(0).getNome());
		
	}
}
