package trabalhojavanp1.telas;

import interfaces.PadraoFrame;
import trabalhojavanp1.objetos.Curso;

//TODO verificar se ja existe professores adicionados antes de liberar a adicao dos cursos
public class FrameAdicionarCurso implements PadraoFrame{
    private Curso curso;
    
    public FrameAdicionarCurso(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
    }

    @Override
    public void initObjects() {
        this.curso = new Curso();
    }
    
    private boolean cursoIsValid(){
        if(false){
            return false;
        }else{
            this.curso = new Curso();
            //MONTAR CURSO
            return true;
        }
    }
    
    //GETTERS SETTERS
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
