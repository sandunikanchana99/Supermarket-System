/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.AddAdmin;
import javax.swing.JOptionPane;

public class InsertController {
    
    public static void InsertA(String Name, String NIC, String Tele, String ID, String pass1 , String pass2 ){
        
        if(pass1.equals(pass2)){
            String pass = pass2; 
            new Model.AddRecord().AddAdmin(Name, NIC,Tele, ID, pass);
            
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
 
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, " Invalid Password ","Error", JOptionPane.ERROR_MESSAGE); 
        }
             
    }

    public static void InsertC(String Name, String NIC, String Tele, String ID, String pass1 , String pass2 ){
        if (pass1.equals(pass2)){
            String pass= pass2;
        new Model.AddRecord().AddCashier(Name,NIC,Tele,ID,pass);
        
        JOptionPane.showMessageDialog(null,"New Record has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Invalid Password","Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    
    }
    
    public static void InsertP(String pname, String pcode, String category, String wsprice, String retailprice){
        double wsp = Double.parseDouble(wsprice);
        double rp = Double.parseDouble(retailprice);
        new Model.AddRecord().AddProduct(pname ,pcode ,category ,wsp ,rp);
        
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
 
    
    }
    public static void InsertS(String Sname,String SID,String category,String Contact){
    
        //int con = Integer.parseInt(Contact);
        new Model.AddRecord().AddSupplier(Sname,SID,category,Contact);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    
}
