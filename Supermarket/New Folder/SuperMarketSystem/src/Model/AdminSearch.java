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
public class AdminSearch {
 
    Statement stmt;
    ResultSet rs;

public ResultSet AdminL() {
    try {
 
        stmt = DBConnection.getStatementConnection();
        
//Execute the Query
        rs = stmt.executeQuery("SELECT * FROM adminl");
 }   catch (SQLException e) {
 }
    return rs;
 }


    public ResultSet searchLogin(String AName) {
      try{
          stmt=DBConnection.getStatementConnection();
          String AdminName = AName ;
          rs=stmt.executeQuery("SELECT * FROM adminl where adminname='"+AdminName+"'");
      }
      catch(SQLException e){
      }
                  return rs;
      }
}
      
      
    





