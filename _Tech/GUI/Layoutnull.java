import java.awt.*;
import javax.swing.*;

public class Layoutnull {
    public static void main(String[] args) {
        new Form1();
    }

}

class Form1{
    public Form1(){
        JFrame f = new JFrame();
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel l1 = new JLabel("Name");
        l1.setBounds(10, 10, 100, 30);
        cp.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(120, 10, 100, 30);
        cp.add(t1);
        JLabel l2 = new JLabel("Email");
        l2.setBounds(10, 50, 100, 30);
        cp.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(120, 50, 100, 30);
        cp.add(t2);
        JLabel l3 = new JLabel("Password");
        l3.setBounds(10, 90, 100, 30);
        cp.add(l3);
        JPasswordField t3 = new JPasswordField();
        t3.setBounds(120, 90, 100, 30);
        cp.add(t3);
        JButton b1 = new JButton("Submit");
        b1.setBounds(10, 130, 100, 30);
        cp.add(b1);
        JButton b2 = new JButton("Cancel");
        b2.setBounds(120, 130, 100, 30);
        cp.add(b2);
        f.setSize(245, 210);


        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
}
