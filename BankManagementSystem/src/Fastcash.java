import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.util.Date;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fastcash extends JFrame implements ActionListener {
    String pinnumber;
    JButton hundred, twohundred, fivehundred, thousand, twothoudsand, fivethousand, tenthousand, back;

    public Fastcash(String pinnumber) {
        this.pinnumber = pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
        // Button
        hundred=new JButton("Rs 100");
        hundred.setBounds(160,455,100,25);
        hundred.setFont(new Font("Raleway",Font.BOLD,16));
        hundred.setBackground(Color.black);
        hundred.setForeground(Color.white);
        label.add(hundred);
        // Default
        setSize(900,900);
        setLocation(300,0);
        setLayout(null);
        setUndecorated(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Fastcash("");
    }
}
