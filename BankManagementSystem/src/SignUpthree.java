import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.random.RandomGenerator;

public class SignUpthree extends JFrame implements ActionListener {
    JRadioButton saving, current, fixed, Recurring;
    JCheckBox ATM, internet, mobile, email, cheque, statement;
    JButton submit, cancel;
    String formNo;

    public SignUpthree(String formNo) {
        this.formNo = formNo;
        
    }

    public void actionPerformed(ActionEvent ae) {
        new SignUpthree("");
    }
}
