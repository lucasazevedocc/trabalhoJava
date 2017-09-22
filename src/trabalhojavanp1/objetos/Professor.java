/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.objetos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alessandra
 */
public class Professor {
    private String registro;
    private String nome;
    private String formacao;
    private HashMap<String,Materia> lecionando;

    public Professor(){
        
    }
    
    //GETTERS SETTERS
    private String getRegistro(){
        return this.registro;
    } 
    private void setRegistro(String registro){
        this.registro = registro;
    }
    
    private String getNome(){
        return this.nome;
    } 
    private void setNome(String nome){
        this.nome = nome;
    }
    
    private String getFormacao(){
        return this.formacao;
    } 
    private void setFormacao(String formacao){
        this.formacao = formacao;
    }
    
    private HashMap<String,Materia> getLecionando(){
        return this.lecionando;
    } 
    private void setLecionando(HashMap<String,Materia> lecionando){
        this.lecionando = lecionando;
    }
}
