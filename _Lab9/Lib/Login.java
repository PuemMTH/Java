package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    public Login() {
        new LoginPanel();
    }
}

class LoginPanel extends JPanel implements ActionListener {
    JFrame frame;
    Container cp;
    GridBagConstraints c;
    JLabel LableUsername,LablePassword;
    JTextField TextFieldUser;
    JPasswordField TextFieldPass;
    JButton Button;
    
    public LoginPanel() {
        frame = new JFrame("Login");
        cp = frame.getContentPane();
        cp.setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);
        c.gridx = 0;
        c.gridy = 0;

        LableUsername = new JLabel("User : ");
        LablePassword = new JLabel("PASSWORD : ");

        TextFieldUser = new JTextField("",15);
        TextFieldPass = new JPasswordField("",15);
        Button = new JButton("LOGIN");
        Button.setActionCommand("Login");
        TextFieldUser.addActionListener(this);
        TextFieldPass.addActionListener(this);
        Button.addActionListener(this);

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
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void openDialog(String message) {
        JDialog d = new JDialog();
        JLabel l = new JLabel(message);
        d.setLayout(new FlowLayout());
        d.add(l);
        d.pack();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            if(TextFieldUser.getText().trim().equals("admin") && String.valueOf(TextFieldPass.getPassword()).trim().equals("abc123")) {
                openDialog("Login Complete !!!");
            } else {
                openDialog("Login Failed !!!");
            }
        }
    }
}