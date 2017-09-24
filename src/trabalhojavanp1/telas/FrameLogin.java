/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.telas;

import interfaces.PadraoFrame;
import javax.swing.JFrame;

/**
 *
 * @author Alessandra
 */
public class FrameLogin extends JFrame  implements PadraoFrame{
    private final String usuarioAdmin = "admin";
    private final String senhaAdmin = "admin";

    public FrameLogin(){
        initViews();
        initObjects();
    }

    @Override
    public void initViews() {
        //COLOCAR A CONSTRUCAO DA TELA AQUI
    }

    @Override
    public void initObjects() {
    }
    
    private boolean verificarLogin(String usuario, String senha){
        return (usuario != null && senha != null && usuario.equals(this.usuarioAdmin) && senha.equals(this.senhaAdmin));
    }
    
    
}
