
package roommanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author m.ixax khan
 */
public class DBConnection {
    
    
   public Connection getConnection() throws ClassNotFoundException, SQLException{
   
    Connection conn=null; 
   
   
   
    try{
           
               Class.forName("com.mysql.jdbc.Driver");
           
          
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/room","root","");
                
          
            }
         catch (SQLException e) {
            e.fillInStackTrace();
        }
    return conn;
}
    
   }
    