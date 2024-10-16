/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Agnar
 */
public class ChangeController {
    
    public static void Reset(String ID, String pass1, String pass2){
        if(pass1.equals(pass2)){
            String pass = pass2;
            
            new Model.ChangeRecord().Resetpass(ID, pass);
            JOptionPane.showMessageDialog(null, "Password has been reset", "Succesfull",JOptionPane.INFORMATION_MESSAGE);
        }
        else {        
            JOptionPane.showMessageDialog(null, "Reenter Password", "Error",JOptionPane.ERROR_MESSAGE);      
        }
        
    }
}
