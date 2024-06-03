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
        withdraw = new JButton("Withdraw Cash");
        withdraw.setBackground(Color.black);
        withdraw.setBounds(160, 500, 100, 30);
        withdraw.setFont(new Font("Roboto", Font.BOLD, 15));
        withdraw.setForeground(Color.WHITE);
        add(withdraw);
        balance = new JButton("Chack Balance");
        balance.setBackground(Color.black);
        balance.setBounds(230, 500, 100, 30);
        balance.setFont(new Font("Roboto", Font.BOLD, 15));
        balance.setForeground(Color.WHITE);
        add(balance);
        changepin = new JButton("Change PIN");
        changepin.setBackground(Color.black);
        changepin.setBounds(160, 550, 100, 30);
        changepin.setFont(new Font("Roboto", Font.BOLD, 15));
        changepin.setForeground(Color.WHITE);
        add(changepin);
        exit = new JButton("Deposite Cash");
        exit.setBackground(Color.black);
        exit.setBounds(230, 550, 100, 30);
        exit.setFont(new Font("Roboto", Font.BOLD, 15));
        exit.setForeground(Color.WHITE);
        add(exit);
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
