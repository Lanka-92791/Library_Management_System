/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asd
 */
class javaconnect {
static Connection con;
   public static void ConnecrDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem","root","");// "onlineexam" this is database name
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
}
