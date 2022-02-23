import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        new Form1();
    }
}


class Form1 implements ActionListener, MouseListener, KeyListener, TextListener {
    JFrame f;
    Container cp;
    JButton b1,b2;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    TextField t;
    JPasswordField t3;
    public Form1(){
        f = new JFrame();
        cp = f.getContentPane();
        cp.setLayout(null);
        l1 = new JLabel("Name");
        l1.setBounds(10, 10, 100, 30);
        cp.add(l1);
        t1 = new JTextField();
        t1.setBounds(120, 10, 100, 30);
        t1.addKeyListener(this); // add KeyListener
        // t = new TextField();
        // t.setBounds(120, 10, 100, 30);
        // t.addTextListener(this); // add TextListener
        // cp.add(t);
        
        
        cp.add(t1);
        l2 = new JLabel("Email");
        l2.setBounds(10, 50, 100, 30);
        cp.add(l2);
        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 30);
        cp.add(t2);
        l3 = new JLabel("Password");
        l3.setBounds(10, 90, 100, 30);
        cp.add(l3);
        t3 = new JPasswordField();
        t3.setBounds(120, 90, 100, 30);
        cp.add(t3);
        b1 = new JButton("Submit");
        b1.setBounds(10, 130, 100, 30);
        b1.addActionListener(this); // ActionListener
        b1.setActionCommand("Sb1"); // ActionCommand
        b1.addMouseListener(this); // MouseListener
        cp.add(b1);
        b2 = new JButton("Cancel");
        b2.addActionListener(this); // ActionListener
        b2.setActionCommand("Ca1"); // ActionCommand
        b2.addMouseListener(this); // MouseListener
        b2.setBounds(120, 130, 100, 30);
        cp.add(b2);


        f.setSize(245, 210);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    // ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {

       if (e.getActionCommand() == "Sb1"){
            
       }
       if (e.getActionCommand() == "Ca1"){
            t1.setText("");
            t2.setText("");
            t3.setText("");
       }

    }

    // MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {

        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource() == b1){
            System.out.println("Enter");
        }
        if (e.getSource() == b2){
            // close the JFrame
            f.dispose();
        }
        
    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getSource() == b1){
            System.out.println("Out");
        }
        
    }

    // KeyListener
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource() == t1){
            System.out.println(e.getKeyChar());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        
    }

    @Override
    public void keyReleased(KeyEvent e) {

        
    }

    // TextListener
    @Override
    public void textValueChanged(TextEvent e) {
        // System.out.println();
        // b1.setText(t.getText());
    }
}
