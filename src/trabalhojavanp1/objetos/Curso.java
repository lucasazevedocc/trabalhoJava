/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.objetos;

import java.util.HashMap;

/**
 *
 * @author Alessandra
 */
public class Curso {
    private String codCurso;
    private String nomeDoCurso;
    private HashMap<String,Materia> materias;
    
    public Curso(){
        
    }
    
    //GETTERS SETTERS
    private String getCodCurso(){
        return this.codCurso;
    } 
    private void setCodCurso(String codCurso){
        this.codCurso = codCurso;
    }
    
    private String getNomeDoCurso(){
        return this.nomeDoCurso;
    } 
    private void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
    
    private HashMap<String,Materia> getMaterias(){
        return this.materias;
    } 
    private void setMaterias(HashMap<String,Materia> materias){
        this.materias = materias;
    }
}
