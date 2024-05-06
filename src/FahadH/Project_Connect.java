
package FahadH;
import java.sql.*;
import javax.swing.JOptionPane;

public class Project_Connect {
    
    Connection conn;

    public static Connection connectdb() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/bd_online_bus_ticket";
            String username = "root";
            String Password = null;
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, Password);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
