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
