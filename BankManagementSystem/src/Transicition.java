import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transicition extends JFrame implements ActionListener {
    JButton fast, deposite, withdraw, balance, exit, changepin;

    public Transicition() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        // Select Option
        JLabel text = new JLabel("Please Select the Option");
        text.setBounds(230, 320, 200, 30);
        label.add(text);
        text.setFont(new Font("Roboto", Font.BOLD, 15));
        text.setForeground(Color.WHITE);
        // Button
        fast = new JButton("Fast Cash");
        fast.setBackground(Color.black);
        fast.setBounds(160, 450, 100, 30);
        fast.setFont(new Font("Roboto", Font.BOLD, 15));
        fast.setForeground(Color.WHITE);
        add(fast);
        deposite = new JButton("Deposite Cash");
        deposite.setBackground(Color.black);
        deposite.setBounds(230, 450, 100, 30);
        deposite.setFont(new Font("Roboto", Font.BOLD, 15));
        deposite.setForeground(Color.WHITE);
        add(deposite);
        // Default
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(900, 900);
        setLocation(400, 0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Transicition();
    }
}
