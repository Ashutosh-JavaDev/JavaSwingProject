import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Random;
import java.util.random.*;

public class SignUPone extends JFrame implements ActionListener {
    JLabel FirstName, LastName, FatherName, DOB, Email, Gender, Address, Maratial, City, State, Pin;
    JRadioButton Married, UnMarried, Male, Female;
    JTextField FirstTextField, LastTextField, FatherTextField, DOBTextField, EmailTextField,

            AddressTextField, CityTextField, StateTextField, PinTextField;
    JButton next;
    Random random = new Random();

    public SignUPone() {
        // Random Number
        long ran = Math.abs(random.nextLong() % 9000L + 1000);
        JLabel form = new JLabel("Application No.: " + ran);
        form.setBounds(250, 10, 400, 35);
        form.setFont(new Font("Rubik", Font.BOLD, 30));
        add(form);
        // FirstName Label
        FirstName = new JLabel("First Name: ");
        FirstName.setBounds(100, 70, 130, 30);
        FirstName.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(FirstName);
        // TextField
        FirstTextField = new JTextField();
        FirstTextField.setBounds(370, 70, 300, 20);
        FirstTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(FirstTextField);
        // LastName Label
        LastName = new JLabel("Last Name: ");
        LastName.setBounds(100, 130, 120, 30);
        LastName.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(LastName);
        // TextField
        LastTextField = new JTextField();
        LastTextField.setBounds(370, 130, 300, 20);
        LastTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(LastTextField);
        // FatherName
        FatherName = new JLabel("Father's Name: ");
        FatherName.setBounds(100, 190, 180, 30);
        FatherName.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(FatherName);
        // TextField
        FatherTextField = new JTextField();
        FatherTextField.setBounds(370, 190, 300, 20);
        FatherTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(FatherTextField);
        // Email
        Email = new JLabel("Eamil ID: ");
        Email.setBounds(100, 230, 120, 30);
        Email.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Email);
        // TextField
        EmailTextField = new JTextField();
        EmailTextField.setBounds(370, 230, 300, 20);
        EmailTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(EmailTextField);
        // Address
        Address = new JLabel("Address: ");
        Address.setBounds(100, 290, 120, 30);
        Address.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Address);
        // TextField
        AddressTextField = new JTextField();
        AddressTextField.setBounds(370, 290, 300, 20);
        AddressTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(AddressTextField);
        // City
        City = new JLabel("City: ");
        City.setBounds(100, 350, 120, 30);
        City.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(City);
        // TextField
        CityTextField = new JTextField();
        CityTextField.setBounds(370, 350, 300, 20);
        CityTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(CityTextField);
        // State
        State = new JLabel("State: ");
        State.setBounds(100, 410, 120, 30);
        State.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(State);
        // TextField
        StateTextField = new JTextField();
        StateTextField.setBounds(370, 410, 300, 20);
        StateTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(StateTextField);
        // Gender
        Gender = new JLabel("Gender: ");
        Gender.setBounds(100, 470, 120, 30);
        Gender.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Gender);
        // Button
        Male = new JRadioButton("Male");
        Male.setBounds(370, 470, 100, 20);
        Male.setFont(new Font("Outfit", Font.BOLD, 20));
        Male.setBackground(Color.white);
        add(Male);
        // Female
        Female = new JRadioButton("Female");
        Female.setBounds(520, 470, 100, 20);
        Female.setFont(new Font("Outfit", Font.BOLD, 20));
        Female.setBackground(Color.white);

        add(Female);
        // Maratial Status
        Maratial = new JLabel("Maratial Status: ");
        Maratial.setBounds(100, 520, 180, 30);
        Maratial.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Maratial);
        // Button
        Married = new JRadioButton("Married");
        Married.setBounds(370, 520, 150, 20);
        Married.setFont(new Font("Outfit", Font.BOLD, 20));
        Married.setBackground(Color.white);

        add(Married);
        // Female
        UnMarried = new JRadioButton("UnMarried");
        UnMarried.setBounds(520, 520, 180, 20);
        UnMarried.setFont(new Font("Outfit", Font.BOLD, 20));
        UnMarried.setBackground(Color.white);
        add(UnMarried);
        // Button Group
        ButtonGroup group = new ButtonGroup();
        group.add(Female);
        group.add(Male);
        ButtonGroup GroupTwo = new ButtonGroup();
        GroupTwo.add(Married);
        GroupTwo.add(UnMarried);
        // Next
        next = new JButton("NEXT");
        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.setForeground(Color.white);
        next.setBounds(600, 650, 100, 30);
        next.setBackground(Color.black);
        add(next);
        next.addActionListener(this);
        setLocation(450, 100);
        setTitle("REGISTRATION FORM");
        setLayout(null);
        setSize(800, 850);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        SignUPone ob = new SignUPone();
    }
}
