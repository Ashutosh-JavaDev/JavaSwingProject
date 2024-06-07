import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pinnumber;
    JButton back;

    public BalanceEnquiry(String pinnumber) {
        this.pinnumber=pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/iimage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        try{
            BankDataBase conn=new BankDataBase();
            ResultSet res=conn.statem.executeQuery("select *from login where PinNumber ='"+pinnumber+"'");
            int balance=0;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transicition(pinnumber).setVisible(true);
    }
}
