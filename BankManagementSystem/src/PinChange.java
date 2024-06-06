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
    JPasswordField pinfield,repin;

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
        pin.setBounds(170,330,300,20);
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setForeground(Color.white);
        image.add(pin);
        // label
        JLabel npin=new JLabel("Enter New PIN: ");
        npin.setBounds(160,360,150,20);
        npin.setFont(new Font("Raleway",Font.BOLD,16));
        npin.setForeground(Color.white);
        image.add(npin);
        JLabel rpin=new JLabel("Re-Enter PIN: ");
        rpin.setBounds(160,400,300,20);
        rpin.setFont(new Font("Raleway",Font.BOLD,20));
        rpin.setForeground(Color.white);
        image.add(rpin);
        // Password
        pinfield=new JPasswordField(); 
        pinfield.setBounds(330,360,100,20);
        pinfield.setFont(new Font("Raleway",Font.BOLD,16));
        pinfield.setForeground(Color.white);
        image.add(pinfield);
        // 
        repin=new JPasswordField(); 
        repin.setBounds(330,400,100,20);
        repin.setFont(new Font("Raleway",Font.BOLD,16));
        repin.setForeground(Color.white);
        image.add(repin);
        // 
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
