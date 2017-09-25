/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1;

import trabalhojavanp1.telas.PanelLogin;
import trabalhojavanp1.telas.PanelTeste;
import trabalhojavanp1.telas.TelaPrincipal;

public class TrabalhoJavaNp1 {
    private static TelaPrincipal telaPrincipal;
    private static PanelLogin panelLogin;
    private static PanelTeste panelTeste;


    
    
    public static void main(String[] args) {
        TrabalhoJavaNp1.setTelaPrincipal(new TelaPrincipal());
        TrabalhoJavaNp1.setPanelLogin(new PanelLogin());
        TrabalhoJavaNp1.setPanelTeste(new PanelTeste());
        TrabalhoJavaNp1.getTelaPrincipal().add(TrabalhoJavaNp1.getPanelLogin());
        TrabalhoJavaNp1.getTelaPrincipal().show();
    }
    
    
    //GETTERS SETTERS
    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }
    public static void setTelaPrincipal(TelaPrincipal aTelaPrincipal) {
        telaPrincipal = aTelaPrincipal;
    }

    public static PanelLogin getPanelLogin() {
        return panelLogin;
    }
    public static void setPanelLogin(PanelLogin aPanelLogin) {
        panelLogin = aPanelLogin;
    }

    public static PanelTeste getPanelTeste() {
        return panelTeste;
    }
    public static void setPanelTeste(PanelTeste aPanelTeste) {
        panelTeste = aPanelTeste;
    }
}
