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
    }
    public void actionPerformed(ActionEvent ae){
        
    }
    public static void main(String[]args){
        new PinChange("");
    }
}
