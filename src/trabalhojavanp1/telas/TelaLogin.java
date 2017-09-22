/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojavanp1.telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Alessandra
 */
public class TelaLogin extends JFrame  implements ActionListener{
    JTextField usuario;
    JLabel L1, L2, L3;
    JPasswordField senha;
    
    public TelaLogin(){
      setTitle("Login");
      setExtendedState(JFrame.MAXIMIZED_BOTH);  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
      L1 = new JLabel("Exemplo Utilizando SENHA");
      L1.setLocation(450,20);	
      L1.setSize(600,60);
      L1.setFont(new Font("Serif", Font.BOLD, 36));

      L2 = new JLabel("Nome: ");
      L2.setLocation(480,300);
      L2.setSize(100,30);
      L2.setFont(new Font("Serif", Font.BOLD, 24));

      usuario = new JTextField("");
      usuario.setSize(280,30);
      usuario.setLocation(580,300);
      usuario.setFont(new Font("Serif", Font.BOLD, 24));

      L3 = new JLabel("Senha: ");
      L3.setLocation(480,380);
      L3.setSize(150,30);
      L3.setFont(new Font("Serif", Font.BOLD, 24));
		
      senha = new JPasswordField();
      senha.setEchoChar('*');
      senha.setSize(150,30);
      senha.setLocation(580,380);
      senha.addActionListener(this);
      senha.setFont(new Font("Serif", Font.BOLD, 24));
      
      //Im1 = new ImageIcon(" ");
      //La = new JLabel(Im1);
      //La.setLocation(10,10);
      //La.setVisible(true);

      getContentPane().setLayout(null);
      getContentPane().add(L1);
      getContentPane().add(L2);
      getContentPane().add(L3);
      getContentPane().add(usuario);
      getContentPane().add(senha);

    }
    
    public void Main() {
              this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
