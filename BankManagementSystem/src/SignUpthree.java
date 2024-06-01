import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.random.RandomGenerator;

public class SignUpthree extends JFrame implements ActionListener {
    JRadioButton saving, current, fixed, Recurring;
    JCheckBox ATM, internet, mobile, email, cheque, declare, statement;
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
        card.setBounds(100, 220, 150, 20);
        card.setBackground(Color.WHITE);
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        add(card);
        // 16 digit
        JLabel digit = new JLabel("Your 16 Digit Card Number");
        digit.setBounds(100, 250, 150, 10);
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
        pinDigit.setBounds(100, 300, 150, 10);
        pinDigit.setBackground(Color.WHITE);
        pinDigit.setFont(new Font("Raleway", Font.BOLD, 10));
        add(pinDigit);
        // Pin Number
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setBounds(350, 280, 120, 20);
        pnumber.setBackground(Color.WHITE);
        pnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pnumber);
        // Service Required
        JLabel service = new JLabel("Services Required:");
        service.setBounds(100, 350, 250, 20);
        service.setBackground(Color.WHITE);
        service.setFont(new Font("Raleway", Font.BOLD, 20));
        add(service);
        // Check box
        ATM = new JCheckBox("ATM CARD");
        ATM.setBounds(100, 390, 150, 20);
        ATM.setBackground(Color.WHITE);
        ATM.setFont(new Font("Raleway", Font.BOLD, 15));
        add(ATM);
        internet = new JCheckBox("Internet Banking");
        internet.setBounds(350, 390, 200, 20);
        internet.setBackground(Color.WHITE);
        internet.setFont(new Font("Raleway", Font.BOLD, 15));
        add(internet);
        mobile = new JCheckBox("Mobile Banking");
        mobile.setBounds(100, 430, 150, 20);
        mobile.setBackground(Color.WHITE);
        mobile.setFont(new Font("Raleway", Font.BOLD, 15));
        add(mobile);
        email = new JCheckBox("EMAIL & SMS Alerts");
        email.setBounds(350, 430, 250, 20);
        email.setBackground(Color.WHITE);
        email.setFont(new Font("Raleway", Font.BOLD, 15));
        add(email);
        cheque = new JCheckBox("Cheque Book");
        cheque.setBounds(100, 470, 150, 20);
        cheque.setBackground(Color.WHITE);
        cheque.setFont(new Font("Raleway", Font.BOLD, 15));
        add(cheque);
        statement = new JCheckBox("E-Statement");
        statement.setBounds(350, 470, 150, 20);
        statement.setBackground(Color.WHITE);
        statement.setFont(new Font("Raleway", Font.BOLD, 15));
        add(statement);
        declare = new JCheckBox(
                "I hereby declares that the above entered details are correct to the best of my knowledge");
        declare.setBounds(60, 550, 750, 20);
        declare.setBackground(Color.WHITE);
        declare.setFont(new Font("Raleway", Font.BOLD, 15));
        add(declare);
        // Button
        submit = new JButton("Submit");
        submit.setBounds(100, 600, 150, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 20));
        add(submit);
        submit.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.setBounds(400, 600, 150, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 20));
        add(cancel);
        cancel.addActionListener(this);
        // Default Information
        setLayout(null);
        setLocation(450, 100);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 850);
        setTitle("REGISTRATION FORM");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String currentButton = null;
            if (saving.isSelected()) {
                currentButton = "Saving Acccount";
            } else if (fixed.isSelected()) {
                currentButton = "Fixed Acccount";
            } else if (current.isSelected()) {
                currentButton = "Current Acccount";
            } else if (Recurring.isSelected()) {
                currentButton = "Recurring Deposite Acccount";
            }
            Random random = new Random();
            String CardNumber = "" + Math.abs((random.nextLong() % 900000000L) + 5678984500000000L);
            String PinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            String facality = "";
            if (ATM.isSelected()) {
                facality = facality + " ATM Card";
            } else if (internet.isSelected()) {
                facality = facality + " Internet Banking";
            } else if (mobile.isSelected()) {
                facality = facality + " Mobile  Banking";
            } else if (email.isSelected()) {
                facality = facality + " Email & SMS Alert";
            } else if (cheque.isSelected()) {
                facality = facality + " Cheque Book";
            } else if (statement.isSelected()) {
                facality = facality + "E-Statement";
            }
        } else if (ae.getSource() == cancel) {

        }
    }

    public static void main(String[] args) {
        new SignUpthree("");
    }
}
