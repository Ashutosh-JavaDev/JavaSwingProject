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
        JLabel text=new JLabel("Plese enter the Amount want to Deposit");
        setBounds(155,300,400,25);
        setFont(new Font("System",Font.BOLD,16));
        
        // Default
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
