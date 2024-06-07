import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.Color;

public class miniStatement extends JFrame {
    String pinnumber;
    JButton back;

    public miniStatement(String pinnumber) {
        this.pinnumber = pinnumber;
        JLabel heading = new JLabel("Bank of Baroda");
        heading.setBounds(20, 15, 350, 20);
        heading.setFont(new Font("Raleway", Font.BOLD, 15));
        add(heading);
        JLabel card = new JLabel();
        card.setBounds(15, 150, 250, 25);
        add(card);
        JLabel mini = new JLabel();
        mini.setBounds(20, 200, 350, 600);
        add(mini);
        try {
            BankDataBase conn = new BankDataBase();
            ResultSet re = conn.statem.executeQuery("select *from login where PinNumber = '" + 2002 + "'");
            while (re.next()) {
                card.setText("Card Number: " + re.getString("CardNumber").substring(0, 4) + "XXXXXXXX"
                        + re.getString("CardNumber").substring(12));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            BankDataBase conn = new BankDataBase();
            ResultSet res = conn.statem.executeQuery("select*from bankDepo where Pin='" + 2002 + "'");
            while (res.next()) {
                mini.setText(
                        mini.getText() + "<html>" + res.getString("Deposit_Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + res.getString("Type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + res.getString("Amount") + "<br><br>" + "<html>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int balance = 0;
        try {
            BankDataBase conn = new BankDataBase();
            ResultSet result = conn.statem.executeQuery("select*from bankDepo where Pin = '" + pinnumber + "'");
            while (result.next()) {
                if (result.getString("Type").equals("Deposit")) {
                    balance += Integer.parseInt("amount");
                } else {
                    balance -= Integer.parseInt("amount");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JLabel bal=new JLabel("Your Current Balance is Rs "+balance);
        bal.setBounds(15,700,300,25);
        add(bal);
        setLayout(null);
        setSize(400, 600);
        setLocation(20, 20);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mini Statement");
        setVisible(true);
    }

    public static void main(String[] args) {
        new miniStatement("");
    }

}
