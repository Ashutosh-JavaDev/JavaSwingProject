import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.random.RandomGenerator;

public class SignUpthree extends JFrame implements ActionListener {
    JRadioButton saving, current, fixed, Recurring;
    JCheckBox ATM, internet, mobile, email, cheque, statement;
    JButton submit, cancel;
    String formNo;

    public SignUpthree(String formNo) {
        this.formNo = formNo;
        JLabel account=new JLabel("Page 3: Account Details");
        account.setBounds(280,25,400,30);
        account.setFont(new Font("Raleway",Font.BOLD,20));
        add(account);
        // Account
        JLabel type=new JLabel("Account Type");
        type.setBounds(100,80,100,20);
        type.setFont(new Font("Raleway",Font.BOLD,20));
        add(type);
        // Saving Button
        saving=new JRadioButton("Saving Account");
        saving.setBounds(100,90,100,20);
        saving.setFont(new Font("Raleway",Font.BOLD,15));
        add(saving);
         // Fixed Button
         fixed=new JRadioButton("Fixed Account");
         fixed.setBounds(150,90,100,20);
         fixed.setFont(new Font("Raleway",Font.BOLD,15));
         add(fixed); 
         // Current Button
         current=new JRadioButton("Current Account");
         current.setBounds(100,130,100,20);
         current.setFont(new Font("Raleway",Font.BOLD,15));
         add(current); 
         // Deposite Button
         Recurring=new JRadioButton("Reccuring Deposite Account");
         Recurring.setBounds(150,130,200,20);
         Recurring.setFont(new Font("Raleway",Font.BOLD,15));
         add(Recurring);
        //Default Information
        setLayout(null);
        setLocation(450, 100);
        setSize(800,850);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
       
    }
    public static void main(String[]args){
        new SignUpthree("");
    }
}
