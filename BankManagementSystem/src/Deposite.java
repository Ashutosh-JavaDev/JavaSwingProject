import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposite {
    String pinField;

    public Deposite(String pinField) {
        this.pinField = pinField;
    }

    public static void main(String[] args) {
        new Deposite("");
    }
}
