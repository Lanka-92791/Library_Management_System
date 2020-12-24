
package library_system;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
public class dbConnection 
{
    Connection conn;
public static Connection ConnecrDb(){
try {
Class.forName("org.sqlite.JDBC");
Connection conn=DriverManager.getConnection("jdbc:sqlite:libraryDB.db");
JOptionPane.showMessageDialog(null,"Connection Success");
return conn;


}catch (Exception err){
JOptionPane.showMessageDialog(null,err);
return null;
}
}
public static void main (String[]args){    
ConnecrDb();
}
}
