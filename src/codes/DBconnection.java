
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnection {
    
    public static Connection connect(){
        Connection conn = null ;
        try {
            
            Class.forName("java.sql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/help","root","");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
        
        
    }
    
}
