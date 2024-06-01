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
        account.setBounds(280,25,400,20);
        account.setFont(new Font("Raleway",Font.BOLD,20));
        add(account);
        setLayout(null);
        setSize(850,820);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
       
    }
    public static void main(String[]args){
        new SignUpthree("");
    }
}
