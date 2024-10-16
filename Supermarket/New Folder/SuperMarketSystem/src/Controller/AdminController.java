/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AdminSearch;
import Model.DBConnection;
import Model.DBSearch;
import View.ForAdmin;
import View.Login;
import View.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AdminController {
    public static void AdminL(String Aname, String pass) {
        try {
 
            String username = null; // initial value of the username
            String password = null; // initial value of the password
 
            ResultSet rs = new AdminSearch().searchLogin(Aname);
//Process the Query
        while (rs.next()) {
        username = rs.getString("adminname"); //assign database login name to the variable
        password = rs.getString("password"); //assign database password to the variable
        }
 
        if (username != null && password != null) {
            if (password.equals(pass)) {
 
            System.out.println("Login Successfull");
            Login.getFrames()[0].dispose();
            new ForAdmin().setVisible(true);
           } else 
            {
    JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else 
            {
    JOptionPane.showMessageDialog(null, "Invalid Username & Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
        DBConnection.closeCon();
           } catch (SQLException ex) 
 { 
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
 }

}
