import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.Date;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fastcash extends JFrame implements ActionListener {
    String pinnumber;
    JButton hundred, twohundred, fivehundred, thousand, twothoudsand, fivethousand, tenthousand, back;

    public Fastcash(String pinnumber) {
        this.pinnumber = pinnumber;
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new Fastcash("");
    }
}
