import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JButton Change,Back;
    JPasswordField pin,repin;

    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
    }
    public static void main(String[]args){
        new PinChange("");
    }
}
