import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame implements ActionListener {
    JButton sign,signUp,Clear;
    public LoginPage() {
        setTitle("ATM Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/credit-cards-payment.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(50, 10, 100, 100);
        add(label);
        // ATM
        JLabel atm = new JLabel("AutoMated Teller Machine");
        atm.setBounds(200, 50, 350, 30);
        Font font = new Font("Arial", Font.BOLD, 20); // You can change "Arial" and 20 to your preference

        // Set the font to the JLabel
        atm.setFont(font);
        add(atm);
        // Card
        JLabel card = new JLabel("Card No.");
        card.setBounds(50, 120, 70, 30);
        Font cardFont = new Font("Arial", Font.BOLD, 15);
        card.setFont(cardFont);
        add(card);
        // pin
        JLabel Pin = new JLabel("Pin No.");
        Font pinfont = new Font("Arial", Font.BOLD, 15);
        Pin.setFont(pinfont);
        Pin.setBounds(50, 200, 70, 30);
        add(Pin);
        // CardField
        JTextField cardField = new JTextField();
        cardField.setBounds(130, 120, 200, 30);
        add(cardField);
        // pinField
        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(130, 200, 200, 30);
        add(pinField);
        // SignIn Button
         sign = new JButton("Sign IN");
        sign.setBounds(130, 240, 90, 30);
        sign.setBackground(Color.black);
        sign.setForeground(Color.white);
        add(sign);
        sign.addActionListener(this);
        // Login Button
         Clear = new JButton("Clear");
        Clear.setBounds(230, 240, 100, 30);
        Clear.setBackground(Color.black);
        Clear.setForeground(Color.white);
        add(Clear);
        Clear.addActionListener(this);

        // Sign Up
         signUp = new JButton("Sign UP");
        signUp.setBounds(130, 280, 200, 30);
        signUp.setBackground(Color.black);
        signUp.setForeground(Color.white);
        add(signUp);
        signUp.addActionListener(this);

        // Important Function
        setLocation(400, 200);
        setLayout(null);
        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(){

        }
    }

    public static void main(String[] args) {
        LoginPage ob = new LoginPage();
    }
}
