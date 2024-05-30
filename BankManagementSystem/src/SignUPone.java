import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Random;
import java.util.random.*;

public class SignUPone extends JFrame implements ActionListener {
    JLabel FirstName, LastName, FatherName, DOB, Gender, Email, Maratial, Address, City, State, Pin;
    JTextField FirstTextField, LastTextField, DOBTextField, GenderTextField, EmailTextField, MaratialTextField,
            AddressTextField, CityTextField, StateTextField, PinTextField;
    JButton next;
    Random random = new Random();

    public SignUPone() {
        long ran = Math.abs(random.nextLong() % 9000L + 1000);
        JLabel form=new JLabel("Application No.: "+ran);
        form.setBounds(250,100,200,20);
        add(form);
        // FirstName Label
        FirstName = new JLabel("First Name");
        // FirstName.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
        next = new JButton("NEXT");
        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.addActionListener(this);
        setLayout(null);
        setSize(800, 850);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

    }
}
