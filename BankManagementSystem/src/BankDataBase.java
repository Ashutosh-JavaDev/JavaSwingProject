import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverAction;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.MissingFormatArgumentException;
import javax.swing.JOptionPane;

public class BankDataBase {
    Connection conn=null;
    Statement statem=null;

    public BankDataBase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String database = "Management";
            String username = "root";
            String password = "@Radhakrishna297";
            conn = DriverManager.getConnection(url, username, password);
            statem = conn.createStatement();
        }

        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Class Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }
}
