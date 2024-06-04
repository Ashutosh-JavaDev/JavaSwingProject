import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposite extends JFrame implements ActionListener {
    String pinnumber;
    JTextField amount;
    JButton deposit,exit;
    public Deposite(String pinnumber) {
        this.pinnumber = pinnumber;
    }
    public void actionPerformed(ActionEvent ae){
        
    }

    public static void main(String[] args) {
        new Deposite("");
    }
}
