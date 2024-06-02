import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Transicition extends JFrame implements ActionListener {
    public Transicition(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel imagelabel=new JLabel(i3);
        imagelabel.setBounds(900,900,0,0);
        add(imagelabel);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[]args){
        new Transicition();
    }
}
