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
        JLabel card = new JLabel("Card No.");
        card.setBounds(50, 120, 70, 30);
        JLabel Pin = new JLabel("Pin No.");
        Pin.setBounds(50, 200, 70, 30);
        JTextField cardField = new JTextField();
        cardField.setBounds(120, 120, 150, 30);
        JTextField pinField = new JTextField();
        pinField.setBounds(120, 200, 150, 30);
        JButton sign = new JButton("Sign IN");
        sign.setBounds(120, 250, 70, 30);
        sign.setBackground(Color.black);
        sign.setForeground(Color.white);
        add(sign);
        JButton login = new JButton("Log IN");
        login.setBounds(180, 250, 70, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);
        add(card);
        add(pinField);
        add(cardField);
        add(Pin);
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
