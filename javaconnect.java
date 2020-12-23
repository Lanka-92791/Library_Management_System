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
 * @author TW PC
 */
class javaconnect {
    
    private static Connection connection;

    static Connection ConnecrDb() {
        if (connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "1234");
            } catch (SQLException ex) {
                Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
        
    }
    
    
}
