/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.telas;

import interfaces.PadraoFrame;
import javax.swing.JFrame;
import trabalhojavanp1.objetos.Professor;

/**
 *
 * @author Alessandra
 */
public class FrameModifcarProfessor extends JFrame implements PadraoFrame{
    private Professor professor;
    
    public FrameModifcarProfessor(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
    }

    @Override
    public void initObjects() {
        this.professor = new Professor();
    }

   
    private boolean professorIsValid(){
        if(false){
            return false;
        }else{
            this.professor = new Professor();
            //MONTAR PROFESSOR
            return true;
        }
    }
    
    
    //GETTERS SETTERS
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
