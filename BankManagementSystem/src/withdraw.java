import javax.swing.*;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class withdraw extends JFrame implements ActionListener {
    JTextField amount;
    JButton drawButton, exit;
    String pinnumber;

    public withdraw(String pinnumber) {
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        // Field
        JLabel text = new JLabel("Please enter the Amount want to WithDraw");
        text.setBounds(160, 320,400, 20);
        text.setForeground(Color.white);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(text);
        amount = new JTextField();
        amount.setBounds(170, 355,300, 25);
        amount.setForeground(Color.red);
        amount.setFont(new Font("Arial", Font.BOLD, 12));
        image.add(amount);
        // Button
        drawButton = new JButton("Withdraw");
        drawButton.setBounds(415,535,100, 25);
        drawButton.addActionListener(this);
        // deposit.setForeground(Color.red);
        drawButton.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(drawButton);
        // d
        exit = new JButton("Exit");
        exit.setBounds(415,565,100, 25);
        // deposit.setForeground(Color.red);
        exit.setFont(new Font("Arial", Font.BOLD, 16));
        exit.addActionListener(this);
        image.add(exit);
        // Default
        setSize(900, 900);
        setLocation(300, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }
}
