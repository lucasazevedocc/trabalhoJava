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
public class Aluno implements PadraoDAO{
    private String matricula;
    private String nome;
    private String endereco;
    private HashMap<String,Curso> cursando;
    
    public Aluno(){
        
    }
    
    public Aluno(String matricula, String nome, String endereco, HashMap<String,Curso> cursando){
        this.matricula = matricula; 
        this.nome = nome; 
        this.endereco = endereco; 
        this.cursando = cursando; 
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
        Aluno aluno = new Aluno();
        return aluno;
    }

    @Override
    public List<Object> buscarTodos() {
        List<Object> list = new ArrayList<Object>();
        return list;
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
