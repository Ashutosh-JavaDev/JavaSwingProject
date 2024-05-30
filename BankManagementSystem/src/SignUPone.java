import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class SignUPone extends JFrame implements ActionListener {
    JLabel FirstName, LastName, FatherName, DOB, Gender, Email, Maratial, Address, City, State, Pin;
    JTextField FirstTextField, LastTextField, DOBTextField, GenderTextField, EmailTextField, MaratialTextField,
            AddressTextField, CityTextField, StateTextField, PinTextField;
    JButton next;

    public SignUPone() {

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
