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
public class Aluno {
    private String matricula;
    private String nome;
    private String endereco;
    private HashMap<String,Curso> cursando;
    
    public Aluno(){
        
    }
    
    //GETTERS SETTERS
    private String getMatricula(){
        return this.matricula;
    } 
    private void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    private String getNome(){
        return this.nome;
    } 
    private void setNome(String nome){
        this.nome = nome;
    }
    
    private String getEndereco(){
        return this.endereco;
    } 
    private void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    private HashMap<String,Curso> getCursando(){
        return this.cursando;
    } 
    private void setMatricula(HashMap<String,Curso> cursando){
        this.cursando = cursando;
    }
}
