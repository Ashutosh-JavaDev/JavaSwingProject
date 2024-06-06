import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
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
        // Heading
        JLabel text=new JLabel("Please Select the Amount to WithDraw");
        text.setBounds(180,410,400,20);
        text.setForeground(Color.white);
        text.setFont(new Font("Arial",Font.BOLD,18));
        label.add(text);
        // Button
        hundred=new JButton("Rs 100");
        hundred.setBounds(160,455,100,25);
        hundred.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(hundred);
        hundred.addActionListener(this);
        // 
        twohundred=new JButton("Rs 200");
        twohundred.setBounds(400,455,100,25);
        twohundred.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(twohundred);
        twohundred.addActionListener(this);
        // 
        fivehundred=new JButton("Rs 500");
        fivehundred.setBounds(160,490,100,25);
        fivehundred.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(fivehundred);
        fivehundred.addActionListener(this);
        // 
        thousand=new JButton("Rs 1000");
        thousand.setBounds(400,490,100,25);
        thousand.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(thousand);
        thousand.addActionListener(this);
        // 
        twothoudsand=new JButton("Rs 2000");
        twothoudsand.setBounds(160,525,100,25);
        twothoudsand.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(twothoudsand);
        twothoudsand.addActionListener(this);
        // 
        fivethousand=new JButton("Rs 5000");
        fivethousand.setBounds(400,525,100,25);
        fivethousand.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(fivethousand);
        fivethousand.addActionListener(this);
        // 
        tenthousand=new JButton("Rs 10000");
        tenthousand.setBounds(160,560,120,25);
        tenthousand.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(tenthousand);
        tenthousand.addActionListener(this);
        // 
        back=new JButton("Rs Back");
        back.setBounds(400,560,100,25);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        label.add(back);
        back.addActionListener(this);
        // Default
        setSize(900,900);
        setLocation(300,0);
        setLayout(null);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            setVisible(false);
            new Transicition(pinnumber).setVisible(true);
        }
        else{
            String amount=((JButton)ae.getSource()).getText().substring(3);
        }
    }

    public static void main(String[] args) {
        new Fastcash("");
    }
}
