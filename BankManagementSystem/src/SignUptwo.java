import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class SignUptwo extends JFrame implements ActionListener {
    JLabel Religion, Category, Occuption, Education, Income, Citizen, Existing, Pan, Aaddhar;
    JRadioButton syes, sno, eyes, eno;
    JTextField PanTextField, AAdharTextField;
    JComboBox creligion, ccategory, coccuption, ceducation, cincome;
    JButton next;
    String formNo;

    public SignUptwo(String formNo) {
        this.formNo = formNo;
        // Random Number
        setTitle("Additional Details Page - 2 ");
        // FirstName Label
        Religion = new JLabel("Religion: ");
        Religion.setBounds(100, 70, 130, 30);
        Religion.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Religion);
        // TextField
        String Dharam[] = { "Sanatan", "Muslim", "Sikh", "Christian", "Other" };
        creligion = new JComboBox(Dharam);
        creligion.setBounds(370, 70, 300, 30);
        creligion.setFont(new Font("Outfit", Font.BOLD, 20));
        creligion.setBackground(Color.white);
        add(creligion);
        // LastName Label
        Category = new JLabel("Category: ");
        Category.setBounds(100, 130, 120, 30);
        Category.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Category);
        // TextField
        String Caste[] = { "General", "OBC", "SC", "ST", "Other" };
        ccategory = new JComboBox(Caste);
        ccategory.setBounds(370, 130, 300, 30);
        ccategory.setFont(new Font("Outfit", Font.BOLD, 20));
        ccategory.setBackground(Color.white);
        add(ccategory);
        // FatherName
        Occuption = new JLabel("Occuption: ");
        Occuption.setBounds(100, 190, 180, 30);
        Occuption.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Occuption);
        // TextField
        String occup[] = { "Student", "Self-Employed", "Salaried", "Bussinessman", "Other" };
        coccuption = new JComboBox(occup);
        coccuption.setBounds(370, 190, 300, 30);
        coccuption.setFont(new Font("Outfit", Font.BOLD, 20));
        coccuption.setBackground(Color.white);
        add(coccuption);
        // Email
        Education = new JLabel("Education: ");
        Education.setBounds(100, 230, 120, 30);
        Education.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Education);
        // TextField
        String educate[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctarate", "Other" };
        ceducation = new JComboBox(educate);
        ceducation.setBounds(370, 230, 300, 30);
        ceducation.setFont(new Font("Outfit", Font.BOLD, 20));
        ceducation.setBackground(Color.white);
        add(ceducation);
        // Address
        Income = new JLabel("Income: ");
        Income.setBounds(100, 290, 120, 30);
        Income.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Income);
        // TextField
        String aamdani[] = { "0", "< 1,00,000", "< 2,50,000", "< 5,00,000", "> 10,00,000" };
        cincome = new JComboBox(aamdani);
        cincome.setBounds(370, 290, 300, 30);
        cincome.setFont(new Font("Outfit", Font.BOLD, 20));
        cincome.setBackground(Color.white);
        add(cincome);
        // City
        Aaddhar = new JLabel("Aaddhar: ");
        Aaddhar.setBounds(100, 350, 120, 30);
        Aaddhar.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Aaddhar);
        // TextField
        AAdharTextField = new JTextField();
        AAdharTextField.setBounds(370, 350, 300, 30);
        AAdharTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(AAdharTextField);
        // Gender
        Existing = new JLabel("Existing Account: ");
        Existing.setBounds(100, 470, 180, 30);
        Existing.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Existing);
        // Button
        syes = new JRadioButton("Yes");
        syes.setBounds(370, 470, 100, 20);
        syes.setFont(new Font("Outfit", Font.BOLD, 20));
        syes.setBackground(Color.white);
        add(syes);
        // Female
        sno = new JRadioButton("No");
        sno.setBounds(520, 470, 100, 20);
        sno.setFont(new Font("Outfit", Font.BOLD, 20));
        sno.setBackground(Color.white);

        add(sno);
        // Maratial Status
        Citizen = new JLabel("Senior Citizen: ");
        Citizen.setBounds(100, 520, 180, 30);
        Citizen.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Citizen);
        // Button
        eyes = new JRadioButton("Yes");
        eyes.setBounds(370, 520, 150, 20);
        eyes.setFont(new Font("Outfit", Font.BOLD, 20));
        eyes.setBackground(Color.white);

        add(eyes);
        // Female
        eno = new JRadioButton("No");
        eno.setBounds(520, 520, 180, 20);
        eno.setFont(new Font("Outfit", Font.BOLD, 20));
        eno.setBackground(Color.white);
        add(eno);
        // Button Group
        ButtonGroup group = new ButtonGroup();
        group.add(syes);
        group.add(sno);
        ButtonGroup GroupTwo = new ButtonGroup();
        GroupTwo.add(eyes);
        GroupTwo.add(eno);
        // PinCode
        Pan = new JLabel("Pan: ");
        Pan.setBounds(100, 570, 100, 30);
        Pan.setFont(new Font("Josefin sans", Font.BOLD, 20));
        add(Pan);
        // TextField
        PanTextField = new JTextField();
        PanTextField.setBounds(370, 570, 300, 30);
        PanTextField.setFont(new Font("Outfit", Font.BOLD, 20));
        add(PanTextField);
        // Next
        next = new JButton("NEXT");
        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.setForeground(Color.white);
        next.setBounds(600, 650, 100, 30);
        next.setBackground(Color.black);
        add(next);
        next.addActionListener(this);
        setLocation(450, 100);
        setTitle("REGISTRATION FORM");
        setLayout(null);
        setSize(800, 850);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) creligion.getSelectedItem();
        String scategory = (String) ccategory.getSelectedItem();
        String seducation = (String) ceducation.getSelectedItem();
        String scitizen = null;
        String sexistng = null;
        String sincome = (String) cincome.getSelectedItem();
        String soccuption = (String) coccuption.getSelectedItem();
        String span = PanTextField.getText();
        String saadhar = AAdharTextField.getText();
        if (eyes.isSelected()) {
            scitizen = "Yes";
        } else if (eno.isSelected()) {
            scitizen = "No";
        }
        if (syes.isSelected()) {
            sexistng = "Yes";
        } else if (sno.isSelected()) {
            sexistng = "No";
        }
        try {

            BankDataBase conn = new BankDataBase();
            String query = "Insert into Signuptwo values('" + formNo + "','" + sreligion + "','" + scategory + "','" + seducation
                    + "','" + soccuption + "','" + sincome + "','" + scitizen + "','" + sexistng + "','" + span + "','"
                    + saadhar + "')";
            conn.statem.executeUpdate(query);
            JOptionPane.showMessageDialog(Pan, "Data Inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SignUptwo so = new SignUptwo("");
    }
}
