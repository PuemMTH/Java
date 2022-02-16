package lib;
import javax.swing.*;
import java.awt.*;
public class Form1 {
    public Form1(){
        JFrame frame = new JFrame("Login");
        Container cp = frame.getContentPane();
        cp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);
        c.gridx = 0;
        c.gridy = 0;

        JLabel LableUsername = new JLabel("User : ");
        JLabel LablePassword = new JLabel("PASSWORD : ");

        JTextField TextFieldUser = new JTextField("",15);
        JPasswordField TextFieldPass = new JPasswordField("",15);
        JButton Button = new JButton("LOGIN");

        cp.add(LableUsername,c);
        c.gridx = 1;
        cp.add(TextFieldUser,c);
        c.gridx = 0;
        c.gridy = 1;
        cp.add(LablePassword,c);
        c.gridx = 1;
        cp.add(TextFieldPass,c);
        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.WEST;
        cp.add(Button,c);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
