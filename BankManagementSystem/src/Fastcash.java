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
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Fastcash("");
    }
}
