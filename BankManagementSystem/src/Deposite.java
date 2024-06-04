import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposite extends JFrame implements ActionListener {
    String pinnumber;
    JTextField amount;
    JButton deposit, exit;

    public Deposite(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Deposite("");
    }
}
