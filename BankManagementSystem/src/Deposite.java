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
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        JLabel text = new JLabel("Please enter the Amount want to Deposit");
        text.setBounds(160, 320,400, 20);
        text.setForeground(Color.white);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(text);
        amount = new JTextField("Amount");
        amount.setBounds(160, 355,300, 25);
        amount.setForeground(Color.red);
        amount.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(amount);
        // Button
        deposit = new JButton("Deposit");
        deposit.setBounds(370,620,100, 25);
        // deposit.setForeground(Color.red);
        deposit.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(deposit);
        // Exit
        exit = new JButton("Exit");
        exit.setBounds(370,655,100, 25);
        // deposit.setForeground(Color.red);
        exit.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(exit);
        // Default
        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);
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
