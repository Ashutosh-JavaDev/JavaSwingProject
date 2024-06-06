import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JButton Change,Back;
    JPasswordField pin,repin;

    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        // Text
        JLabel pin=new JLabel("Please Enter the Pin Number");
        pin.setBounds(160,230,200,25);
        pin.setFont(new Font("system",Font.BOLD,20));
        pin.setForeground(Color.white);
        image.add(pin);
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
    }
    public static void main(String[]args){
        new PinChange("");
    }
}
