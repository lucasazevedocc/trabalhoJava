/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.telas;

import interfaces.PadraoFrame;
import javax.swing.JFrame;
import trabalhojavanp1.objetos.Aluno;

/**
 *
 * @author Alessandra
 */
public class FrameModificarAluno extends JFrame implements PadraoFrame{
    private Aluno aluno;

    public FrameModificarAluno(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
    }

    @Override
    public void initObjects() {
        this.aluno = new Aluno();
    }
    
    private boolean alunoIsValid(){
        if(false){
            return false;
        }else{
            this.aluno = new Aluno();
            //MONTAR ALUNO
            return true;
        }
    }
    
    //GETTERS SETTERS
    public Aluno getAluno() {
        return this.aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
