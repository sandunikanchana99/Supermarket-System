/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Agnar
 */
public class DBSearch {
 
    Statement stmt;
    ResultSet rs;

public ResultSet searchUsers() {
    try {
 
        stmt = DBConnection.getStatementConnection();
        
//Execute the Query
        rs = stmt.executeQuery("SELECT * FROM login");
 }   catch (SQLException e) {
 }
    return rs;
 }


    public ResultSet searchLogin(String usName) {
      try{
          stmt=DBConnection.getStatementConnection();
          String Username = usName ;
          rs=stmt.executeQuery("SELECT*FROM login where Username='"+Username+"'");
      }
      catch(SQLException e){
      }
                  return rs;
      }
    
    public ResultSet searchProduct(){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM product");
        }
        catch(SQLException e){
            
        }
    
    return rs;
    }
    
    
    public ResultSet searchBill(String pcode){
        try{
            stmt=DBConnection.getStatementConnection();
            String code = pcode;
            rs=stmt.executeQuery("SELECT * FROM product WHERE ProductCode = '"+code+"' ");
        }
        catch(SQLException e){
            
        }
    
    return rs;
    
    }
      
}    


      
    





