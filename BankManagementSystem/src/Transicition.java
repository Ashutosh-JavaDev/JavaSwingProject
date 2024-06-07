import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transicition extends JFrame implements ActionListener {
    JButton fast, deposite, withdraw, balance, exit, changepin,ministatement;
    String pinnumber;
    public Transicition(String pinnumber) {
        this.pinnumber=pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 900, 900);
        add(label);
        // Select Option
        JLabel text = new JLabel("Please Select the Option");
        text.setBounds(230, 320, 200, 30);
        label.add(text);
        text.setFont(new Font("Roboto", Font.BOLD, 15));
        text.setForeground(Color.WHITE);
        // Button
        fast = new JButton("Fast Cash");
        fast.setBackground(Color.black);
        fast.setBounds(155, 450, 150, 30);
        fast.setFont(new Font("Roboto", Font.BOLD, 15));
        fast.setForeground(Color.WHITE);
        label.add(fast);
        fast.addActionListener(this);
        deposite = new JButton("Deposite Cash");
        deposite.setBackground(Color.black);
        deposite.setBounds(365, 450, 150, 30);
        deposite.setFont(new Font("Roboto", Font.BOLD, 15));
        deposite.setForeground(Color.WHITE);
        label.add(deposite);
        deposite.addActionListener(this);
        withdraw = new JButton("Withdraw Cash");
        withdraw.setBackground(Color.black);
        withdraw.setBounds(155, 490, 150, 30);
        withdraw.setFont(new Font("Roboto", Font.BOLD, 15));
        withdraw.setForeground(Color.WHITE);
        label.add(withdraw);
        withdraw.addActionListener(this);
        balance = new JButton("Chack Balance");
        balance.setBackground(Color.black);
        balance.setBounds(365, 490, 150, 30);
        balance.setFont(new Font("Roboto", Font.BOLD, 15));
        balance.setForeground(Color.WHITE);
        label.add(balance);
        balance.addActionListener(this);
        changepin = new JButton("Change PIN");
        changepin.setBackground(Color.black);
        changepin.setBounds(155, 530, 150, 30);
        changepin.setFont(new Font("Roboto", Font.BOLD, 15));
        changepin.setForeground(Color.WHITE);
        label.add(changepin);
        ministatement = new JButton("M-Statement");
        ministatement.setBackground(Color.black);
        ministatement.setBounds(365, 530, 150, 30);
        ministatement.setFont(new Font("Roboto", Font.BOLD, 15));
        ministatement.setForeground(Color.WHITE);
        label.add(ministatement);
        ministatement.addActionListener(this);
        exit = new JButton("EXIT");
        exit.setBackground(Color.black);
        exit.setBounds(155, 565, 150, 30);
        exit.setFont(new Font("Roboto", Font.BOLD, 15));
        exit.setForeground(Color.WHITE);
        label.add(exit);
        exit.addActionListener(this);
        // Default
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
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposite) {
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }
        else if (ae.getSource() == withdraw) {
            setVisible(false);
            new withdraw(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fast){
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==changepin){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==ministatement){
            setVisible(false);
            new miniStatement(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transicition("");
    }
}
