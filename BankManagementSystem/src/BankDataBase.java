import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverAction;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.MissingFormatArgumentException;
import javax.swing.JOptionPane;

public class BankDataBase {
    Connection conn;
    Statement statem;

    public BankDataBase() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///BankManagementSystem", "root", "@Radhakrishna297");
            statem = conn.createStatement();
        }

        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Class Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }
}
