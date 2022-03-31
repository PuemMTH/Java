package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout {
    public Layout() {
        new menuLayout();
    }
}

class menuLayout extends JPanel implements ActionListener {
    public menuLayout() {
        JFrame frame = new JFrame("FlowLayout");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
        JButton b1 = new JButton("BoarderLayout");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new _BorderLayout();
                frame.dispose();
            }
        });
        JButton b2 = new JButton("CardLayout");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new _CardLayout();
                frame.dispose();
            }
        });
        JButton b3 = new JButton("FlowLayout");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new _FlowLayout();
                frame.dispose();
            }
        });
        JButton b4 = new JButton("GridBagLayout");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new _GridBagLayout();
                frame.dispose();
            }
        });
        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}