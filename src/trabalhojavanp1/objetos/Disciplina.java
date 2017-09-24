/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.objetos;

import interfaces.PadraoDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author Alessandra
 */
public class Disciplina implements PadraoDAO{
    private String codDisciplina;
    private String nomeDisciplina;
    
    
    public Disciplina(){
        
    }
    
    public Disciplina(String codDisciplina, String nomeDisciplina){
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
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
        Disciplina disciplina = new Disciplina();
        return disciplina;
    }

    @Override
    public List<Object> buscarTodos() {
        List<Object> list = new ArrayList<Object>();
        return list;    
    }
    
    //GETTERS SETTERS
    private String getCodDisciplina(){
        return this.codDisciplina;
    } 
    private void setCodDisciplina(String codDisciplina){
        this.codDisciplina = codDisciplina;
    }
    
    private String getNomeDisciplina(){
        return this.nomeDisciplina;
    } 
    private void setNome(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
}
