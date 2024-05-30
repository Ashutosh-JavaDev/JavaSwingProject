import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class SignUPone extends JFrame implements ActionListener {
    JButton next;
    public SignUPone(){
        next=new JButton("NEXT");
        next.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
    }
}
