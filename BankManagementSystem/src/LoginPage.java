import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {
    public LoginPage(){
        setTitle("ATM Machine");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/credit-cards-payment.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(50,10,100,100);
        add(label);
        JLabel card=new JLabel("Card No.");
        card.setBounds(50,70,70,100);
        JLabel Pin=new JLabel("Pin No.");
        Pin.setBounds(50,100,70,100);
        JTextField cardField=new JTextField();
        JTextField pinField=new JTextField();
        setLocation(400,200);
        setLayout(null);
        setSize(800,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginPage ob = new LoginPage();
    }
}
