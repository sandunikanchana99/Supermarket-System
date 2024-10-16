/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.Login;
import View.Menu;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Agnar
 */
public class SearchController {
    
    
    public static void searchP(String pcode){
        try {
 
            String pname = null; // initial value of the username
            String price = null; // initial value of the password
 
            ResultSet rs = new DBSearch().searchBill(pcode);
//Process the Query
        //while (rs.next()) {
        pname = rs.getString("ProductName"); //assign database login name to the variable
        price = rs.getString("RetailPrice"); //assign database password to the variable
        //}
 
        //Login.getFrames()[0].dispose();
        //new Menu().setVisible(true);
        
    
        DBConnection.closeCon();
           } catch (SQLException ex) 
 { 
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
        
    
    }
}
