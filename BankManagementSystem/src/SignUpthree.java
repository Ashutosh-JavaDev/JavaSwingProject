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
        current.setBounds(100, 150, 180, 20);
        current.setBackground(Color.WHITE);
        current.setFont(new Font("Raleway", Font.BOLD, 15));
        add(current);
        // Deposite Button
        Recurring = new JRadioButton("Reccuring Deposite Account");
        Recurring.setBounds(350, 150, 300, 20);
        Recurring.setBackground(Color.WHITE);
        Recurring.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Recurring);
        // ButtonGroup
        ButtonGroup group = new ButtonGroup();
        group.add(saving);
        group.add(fixed);
        group.add(current);
        group.add(Recurring);
        // Card Number
        JLabel card = new JLabel("Card Number:");
        card.setBounds(100,220, 150, 20);
        card.setBackground(Color.WHITE);
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        add(card);
        // 16 digit
        JLabel digit = new JLabel("Your 16 Digit Card Number");
        digit.setBounds(100,250, 150, 10);
        digit.setBackground(Color.WHITE);
        digit.setFont(new Font("Raleway", Font.BOLD, 10));
        add(digit);
        // Card Number
        JLabel number = new JLabel("XXXX-XXXX-XXXX-2345");
        number.setBounds(350, 220, 550, 20);
        number.setBackground(Color.WHITE);
        number.setFont(new Font("Raleway", Font.BOLD, 20));
        add(number);
        // PIN Number
        JLabel pin = new JLabel("PIN:");
        pin.setBounds(100, 280, 90, 20);
        pin.setBackground(Color.WHITE);
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pin);
        // 4 digit pin
        JLabel pinDigit = new JLabel("Your 4 Digit PIN Number");
        pinDigit.setBounds(100,300, 150, 10);
        pinDigit.setBackground(Color.WHITE);
        pinDigit.setFont(new Font("Raleway", Font.BOLD, 10));
        add(pinDigit);
        // Pin Number
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setBounds(350, 280, 120, 20);
        pnumber.setBackground(Color.WHITE);
        pnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pnumber);
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
