package trabalhojavanp1.telas;

import interfaces.PadraoFrame;
import trabalhojavanp1.objetos.Disciplina;


public class FrameAdicionarDisciplina implements PadraoFrame{
    private Disciplina disciplina;
    
    public void FrameAdicionarDisciplina(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
        
    }

    @Override
    public void initObjects() {
        this.disciplina = new Disciplina();
    }
    
    private boolean disciplinaIsValid(){
        if(false){
            return false;
        }else{
            this.disciplina = new Disciplina();
            //MONTAR DIscIPLINA
            return true;
        }
    }

    
    //GETTERS SETTERS
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
