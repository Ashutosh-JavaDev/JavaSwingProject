import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transicition extends JFrame implements ActionListener {
    public Transicition() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        // Select Option
        JLabel text=new JLabel("Please Select the Option");
        text.setBounds(450,150,100,30);
        add(text);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(900, 900);
        setLocation(400, 0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Transicition();
    }
}
