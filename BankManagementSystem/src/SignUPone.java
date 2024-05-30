import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Random;
import java.util.random.*;

public class SignUPone extends JFrame implements ActionListener {
    JLabel FirstName, LastName, FatherName, DOB, Gender, Email, Maratial, Address, City, State, Pin;
    JTextField FirstTextField, LastTextField,FatherTextField, DOBTextField, GenderTextField, EmailTextField, MaratialTextField,
            AddressTextField, CityTextField, StateTextField, PinTextField;
    JButton next;
    Random random = new Random();

    public SignUPone() {
        // Random Number
        long ran = Math.abs(random.nextLong() % 9000L + 1000);
        JLabel form=new JLabel("Application No.: "+ran);
        form.setBounds(250,10,400,35);
        form.setFont(new Font("Rubik",Font.BOLD,30));
        add(form);
        // FirstName Label
        FirstName = new JLabel("First Name: ");
        FirstName.setBounds(100,70,130,30);
        FirstName.setFont(new Font("Josefin sans",Font.BOLD,20));
        add(FirstName);
        // TextField
        FirstTextField=new JTextField();
        FirstTextField.setBounds(370,70,300,20);
        FirstTextField.setFont(new Font("Outfit",Font.BOLD,20));
        add(FirstTextField);
        // LastName Label
        LastName = new JLabel("Last Name: ");
        LastName.setBounds(100,130,120,30);
        LastName.setFont(new Font("Josefin sans",Font.BOLD,20));
        add(LastName);
        // TextField
        LastTextField=new JTextField();
        LastTextField.setBounds(370,130,300,20);
        LastTextField.setFont(new Font("Outfit",Font.BOLD,20));
        add(LastTextField);
        // FatherName
        FatherName = new JLabel("Last Name: ");
        FatherName.setBounds(100,130,120,30);
        FatherName.setFont(new Font("Josefin sans",Font.BOLD,20));
        add(LastName);
        // TextField
        FatherTextField=new JTextField();
        FatherTextField.setBounds(370,130,300,20);
        FatherTextField.setFont(new Font("Outfit",Font.BOLD,20));
        add(LastTextField);
        // 
        next = new JButton("NEXT");
        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.addActionListener(this);
        setLocation(450,100);
        setTitle("REGISTRATION FORM");
        setLayout(null);
        setSize(800, 850);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

    }
    public static void main(String[]args){
        SignUPone ob=new SignUPone();
    }
}
