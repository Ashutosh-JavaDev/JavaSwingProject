import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PinChange {
    String pinnumber;
    JButton Change,Back;
    JPasswordField pin,repin;

    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
    }
    public static void main(String[]args){
        new PinChange("");
    }
}
