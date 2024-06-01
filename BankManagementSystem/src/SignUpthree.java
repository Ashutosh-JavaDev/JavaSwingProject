import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
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
        JLabel account = new JLabel("Page 3: Account Details");
        account.setBounds(280, 25, 400, 30);
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        add(account);
        // Account
        JLabel type = new JLabel("Account Type");
        type.setBounds(100, 80, 150, 20);
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        add(type);
        // Saving Button
        saving = new JRadioButton("Saving Account");
        saving.setBackground(Color.WHITE);
        saving.setBounds(100, 120, 150, 20);
        saving.setFont(new Font("Raleway", Font.BOLD, 15));
        add(saving);
        // Fixed Button
        fixed = new JRadioButton("Fixed Account");
        fixed.setBounds(350, 120, 150, 20);
        fixed.setBackground(Color.WHITE);
        fixed.setFont(new Font("Raleway", Font.BOLD, 15));
        add(fixed);
        // Current Button
        current = new JRadioButton("Current Account");
        current.setBounds(100, 150, 150, 20);
        current.setBackground(Color.WHITE);
        current.setFont(new Font("Raleway", Font.BOLD, 15));
        add(current);
        // Deposite Button
        Recurring = new JRadioButton("Reccuring Deposite Account");
        Recurring.setBounds(350, 150, 300, 20);
        Recurring.setBackground(Color.WHITE);
        Recurring.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Recurring);
        // Default Information
        setLayout(null);
        setLocation(450, 100);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 850);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new SignUpthree("");
    }
}
