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
public class Disciplina {
    private String codDisciplina;
    private String nomeDisciplina;
    
    public Disciplina(){
        
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
