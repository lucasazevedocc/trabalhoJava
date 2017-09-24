/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.objetos;

import interfaces.PadraoDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Alessandra
 */
public class Curso implements PadraoDAO{
    private String codCurso;
    private String nomeDoCurso;
    private HashMap<String,Materia> materias;
    
    
    public Curso(){
        
    }
    
    public Curso(String codCurso, String nomeDoCurso, HashMap<String,Materia> materias){
        this.codCurso = codCurso;
        this.nomeDoCurso = nomeDoCurso;
        this.materias = materias;
    }
    
    
    
    @Override
    public void salvarAtual() {
    }

    @Override
    public void atualizarAtual() {
    }

    @Override
    public void deletarAtual() {
    }

    @Override
    public void deletarByKey(String key) {
    }

    @Override
    public Object buscarByKey(String key) {
        Curso curso = new Curso();
        return curso;
    }

    @Override
    public List<Object> buscarTodos() {
        List<Object> list = new ArrayList<Object>();
        return list;    
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
