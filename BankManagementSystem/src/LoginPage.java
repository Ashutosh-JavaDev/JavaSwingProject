import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {
    public LoginPage() {
        setTitle("ATM Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/credit-cards-payment.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(50, 10, 100, 100);
        add(label);
        // ATM
        JLabel atm=new JLabel("AutoMated Teller Machine");
        atm.setBounds(100,10,250,30);
        add(atm);
        // Card
        JLabel card = new JLabel("Card No.");
        card.setBounds(50, 120, 70, 30);
        add(card);
        // pin
        JLabel Pin = new JLabel("Pin No.");
        Pin.setBounds(50, 200, 70, 30);
        add(Pin);
        // CardField
        JTextField cardField = new JTextField();
        cardField.setBounds(120, 120, 200, 30);
        add(cardField);
        // pinField
        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(120, 200, 200, 30);
        add(pinField);
        // SignIn Button
        JButton sign = new JButton("Sign IN");
        sign.setBounds(120, 240, 90, 30);
        sign.setBackground(Color.black);
        sign.setForeground(Color.white);
        add(sign);
        // Login Button
        JButton Clear = new JButton("Clear");
        Clear.setBounds(220, 240, 100, 30);
        Clear.setBackground(Color.black);
        Clear.setForeground(Color.white);
        add(Clear);
        // Sign Up
        JButton signUp = new JButton("Sign UP");
        signUp.setBounds(120, 280, 200, 30);
        signUp.setBackground(Color.black);
        signUp.setForeground(Color.white);
        add(signUp);
        // Important Function
        setLocation(400, 200);
        setLayout(null);
        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginPage ob = new LoginPage();
    }
}
