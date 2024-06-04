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
        image.setBounds(0,0,900,900);
        add(image);
        JLabel text = new JLabel("Please enter the Amount want to Deposit");
        text.setBounds(155,300, 400, 25);
        text.setForeground(Color.white);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(text);
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
