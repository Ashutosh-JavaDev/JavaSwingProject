import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.Color;

public class miniStatement extends JFrame {
    String pinnumber;

    public miniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
        JLabel heading=new JLabel("Bank of Baroda");
        heading.setBounds(25,100,400,20);
        heading.setFont(new Font("Raleway",Font.BOLD,20));
        add(heading);
        try{
            BankDataBase conn=new BankDataBase();
            ResultSet res=conn.statem.executeQuery("select*from bankDepo where Pin='"+pinnumber+"'");
        }catch(SQLException e){
            e.printStackTrace();
        }
        setLayout(null);
        setSize(50, 200);
        setLocation(20, 20);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini Statement");
        setVisible(true);
    }

}
