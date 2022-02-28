package Lib;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Frame {
    // public Frame() {
        
    // }
    // public void newFrame() {
    //     new MainFrame();
    // }
    public void newEventListener() {
        new newEventListener();
    }
    public void newTest() {
        new test();
    }
}

class test extends javax.swing.JFrame{
    // public test() {

    // }
}

class newEventListener implements KeyListener {
    JFrame f;
    Container cp;
    JLabel l1, l2;
    JTextField t1;
    JButton b1;
    JTextArea t;
    JScrollPane sp;

    public newEventListener() {
        f = new JFrame();
        cp = f.getContentPane();
        cp.setLayout(null);

        // set Background color red
        cp.setBackground(Color.green);

        l1 = new JLabel("Text");
        l1.setBounds(10, 10, 100, 30);
        cp.add(l1);

        t1 = new JTextField();
        t1.setBounds(50, 10, 100, 30);
        t1.addKeyListener(this); // Add addKeyListener
        t1.setSize(320,30);
        t1.setActionCommand("t1"); // ActionCommand
        cp.add(t1);

        l2 = new JLabel("Hash");
        l2.setBounds(10, 50, 100, 30);
        cp.add(l2);

        t = new JTextArea();
        t.setBounds(50 , 50, 100, 30);
        t.setSize(320, 250);
        t.setEditable(false);

        f.add(t);

        // f.setSize(245, 210);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == t1) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String args = t1.getText();
                Count A = new Count(args);
                t.setText("");
                for (HashMap.Entry<Character, Integer> key: A.getNum().entrySet()) {
                    // System.out.print(key.getKey() + ": " + key.getValue() + " ");
                    t.append(key.getKey() + ": " + key.getValue() + " " + "\n");
                }
                
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    // if (e.getActionCommand().equals("t1")) {
        // String s = t1.getText();
        // int hash = s.hashCode();
        // t.setText(hash + "");
    // }
    // System.out.println("Action Command: " + e.getActionCommand());
}



// class MainFrame {
//     public MainFrame() {

//         JFrame f = new JFrame();
//         Container cp = f.getContentPane();
//         cp.setLayout(null);
//         JLabel l1 = new JLabel("Name");
//         l1.setBounds(10, 10, 100, 30);
//         cp.add(l1);
//         JTextField t1 = new JTextField();
//         t1.setBounds(120, 10, 100, 30);
//         cp.add(t1);
//         JLabel l2 = new JLabel("Email");
//         l2.setBounds(10, 50, 100, 30);
//         cp.add(l2);
//         JTextField t2 = new JTextField();
//         t2.setBounds(120, 50, 100, 30);
//         cp.add(t2);
//         JLabel l3 = new JLabel("Password");
//         l3.setBounds(10, 90, 100, 30);
//         cp.add(l3);
//         JPasswordField t3 = new JPasswordField();
//         t3.setBounds(120, 90, 100, 30);
//         cp.add(t3);
//         JButton b1 = new JButton("Submit");
//         b1.setBounds(10, 130, 100, 30);
//         cp.add(b1);
//         JButton b2 = new JButton("Cancel");
//         b2.setBounds(120, 130, 100, 50);
//         cp.add(b2);

//         f.setSize(245, 210);
//         f.setVisible(true);
//         f.setResizable(false);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         f.setLocationRelativeTo(null);
//     }
// }