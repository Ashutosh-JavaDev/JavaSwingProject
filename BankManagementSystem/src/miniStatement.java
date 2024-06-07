import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class miniStatement extends JFrame implements ActionListener{
    String pinnumber;
    JButton back;
    public miniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
        JLabel heading=new JLabel("Bank of Baroda");
        heading.setBounds(50,15,400,20);
        heading.setFont(new Font("Raleway",Font.BOLD,20));
        add(heading);
        JLabel card=new JLabel();
        card.setBounds(15,150,500,25);
        add(card);
        JLabel mini=new JLabel();
        mini.setBounds(20,400,500,25);
        add(mini);
        try{
            BankDataBase conn=new BankDataBase();
            ResultSet re=conn.statem.executeQuery("select *from login where PinNumber = '"+2002+"'");
            while(re.next()){
                card.setText("Card Number: "+re.getString("CardNumber").substring(0,4)+"XXXXXXXX"+re.getString("CardNumber").substring(12));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        try{
            BankDataBase conn=new BankDataBase();
            ResultSet res=conn.statem.executeQuery("select*from bankDepo where Pin='"+pinnumber+"'");
            while(res.next()){

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        back=new JButton("Back");
        back.setBounds(350, 700, 100, 20);
        add(back);
        back.addActionListener(this);
        setLayout(null);
        setSize(400, 800);
        setLocation(20, 20);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini Statement");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transicition(pinnumber).setVisible(true);
    }
    public static  void main(String[]args){
        new miniStatement("");
    }

}
