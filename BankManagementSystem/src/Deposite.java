import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {
    String pinnumber;
    JTextField amount;
    JButton deposit, exit;

    public Deposite(String pinnumber) {
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        JLabel text = new JLabel("Please enter the Amount want to Deposit");
        text.setBounds(160, 320,400, 20);
        text.setForeground(Color.white);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(text);
        amount = new JTextField();
        amount.setBounds(170, 355,300, 25);
        amount.setForeground(Color.red);
        amount.setFont(new Font("Arial", Font.BOLD, 12));
        image.add(amount);
        // Button
        deposit = new JButton("Deposit");
        deposit.setBounds(415,535,100, 25);
        deposit.addActionListener(this);
        // deposit.setForeground(Color.red);
        deposit.setFont(new Font("Arial", Font.BOLD, 16));
        image.add(deposit);
        // Exit
        exit = new JButton("Exit");
        exit.setBounds(415,565,100, 25);
        // deposit.setForeground(Color.red);
        exit.setFont(new Font("Arial", Font.BOLD, 16));
        exit.addActionListener(this);
        image.add(exit);
        // Default
        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==deposit){
            String value=amount.getText();

            if(value.equals("")){
                JOptionPane.showMessageDialog(rootPane, "First enter the Amount you want to Deposit");
            }
            else{
                try{
                    BankDataBase conn=new BankDataBase();
                    Date date=new Date();
                    String query="insert into bankDepo values('"+pinnumber+"','"+date+"','Deposit','"+value+"')";
                    conn.statem.executeUpdate(query);
                    JOptionPane.showMessageDialog(rootPane, "Amount Deposit Successfully");
                    setVisible(false);
                    new Transicition(pinnumber).setVisible(true);
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
        else if(ae.getSource()==exit){
            setVisible(false);
            new Transicition(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Deposite("");
    }
}
