import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.Image;
import java.awt.Color;

public class miniStatement extends JFrame {
    String pinnumber;

    public miniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        setSize(50,200);
        setLocation(20,20);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini Statement");
        setVisible(true);
    }

}
