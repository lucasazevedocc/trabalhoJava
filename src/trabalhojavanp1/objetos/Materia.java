/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.objetos;

/**
 *
 * @author Alessandra
 */
public class Materia {
    private Disciplina disciplina;
    private Professor professor;
    private Curso curso;
    
    public Materia(){
        
    }
    
    //GETTERS SETTERS
    private Disciplina getDisciplina(){
        return this.disciplina;
    } 
    private void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    
    private Professor getProfessor(){
        return this.professor;
    } 
    private void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    private Curso getCurso(){
        return this.curso;
    } 
    private void setCurso(Curso curso){
        this.curso = curso;
    }
}
