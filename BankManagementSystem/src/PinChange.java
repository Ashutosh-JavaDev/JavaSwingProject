import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JButton Change, Back;
    JPasswordField pinfield, repin;

    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        // Text
        JLabel pin = new JLabel("Please Enter the Pin Number");
        pin.setBounds(170, 310, 300, 20);
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setForeground(Color.white);
        image.add(pin);
        // label
        JLabel npin = new JLabel("Enter New PIN: ");
        npin.setBounds(160, 360, 150, 20);
        npin.setFont(new Font("Raleway", Font.BOLD, 16));
        npin.setForeground(Color.white);
        image.add(npin);
        JLabel rpin = new JLabel("Re-Enter PIN: ");
        rpin.setBounds(160, 400, 300, 20);
        rpin.setFont(new Font("Raleway", Font.BOLD, 20));
        rpin.setForeground(Color.white);
        image.add(rpin);
        // Password
        pinfield = new JPasswordField();
        pinfield.setBounds(360, 360, 120, 20);
        pinfield.setFont(new Font("Raleway", Font.BOLD, 16));
        pinfield.setForeground(Color.white);
        image.add(pinfield);
        //
        repin = new JPasswordField();
        repin.setBounds(360, 400, 120, 20);
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        repin.setForeground(Color.white);
        image.add(repin);
        //
        Change = new JButton("Change");
        Change.setBounds(410, 530, 100, 20);
        Change.setFont(new Font("Raleway", Font.BOLD, 16));
        // Change.setForeground(Color.white);
        image.add(Change);
        Change.addActionListener(this);
        //
        Back = new JButton("BACK");
        Back.setBounds(410, 565, 100, 20);
        Back.setFont(new Font("Raleway", Font.BOLD, 16));
        // Back.setForeground(Color.white);
        image.add(Back);
        Back.addActionListener(this);

        //
        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Back) {
            setVisible(false);
            new Transicition(pinnumber).setVisible(true);
        }
        if (ae.getSource() == Change) {
            String pinNumber = pinfield.getText();
            String repinNumber = repin.getText();
            if (pinNumber.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter New PIN First");
                return;
            }
            if (repinNumber.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter the Re-PIN First");
                return;
            }
            if (!pinNumber.equals(repinNumber)) {
                JOptionPane.showMessageDialog(rootPane, "Re-Enter PIN didn't Matched\nEnter Again!");
                return;
            } else {
                try {

                    BankDataBase conn = new BankDataBase();
                    String query1="update login set PinNumber ='"+pinNumber+"'where PinNumber ='"+pinnumber+"'";
                    String query2="update signupthree set PinNumber ='"+pinNumber+"'where PinNumber ='"+pinnumber+"'";
                    String query3="update bankDepo set Pin ='"+pinNumber+"'where Pin ='"+pinnumber+"'";


                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new PinChange("");
    }
}
