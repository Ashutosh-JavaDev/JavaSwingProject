import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class withdraw extends JFrame implements ActionListener{
    JTextField withdrawan;
    JButton drawButton, exit;
    String pinnumber;

    public withdraw(String pinnumber) {
        this.pinnumber = pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/image.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
    }
    public void actionPerformed(ActionEvent ae){

    }
}
