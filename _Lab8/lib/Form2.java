package lib;
import javax.swing.*;
import java.awt.*;

public class Form2 {
    public Form2(){
        JFrame frame = new JFrame("Calculator");
        Container cp = frame.getContentPane();
        cp.setLayout(new BorderLayout());
        JTextField T = new JTextField("0",20);
        T.setPreferredSize(new Dimension(250,30));
        cp.add(T, BorderLayout.NORTH);

        cp.add(new BTJPanel(), BorderLayout.SOUTH);

        // frame.pack();
        frame.setSize(250,170);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class BTJPanel extends JPanel{
    public BTJPanel(){
        setLayout(new GridLayout(4,4));
        add(new JButton("7"));
        add(new JButton("8"));
        add(new JButton("9"));
        add(new JButton("/"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
        add(new JButton("*"));
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("-"));
        add(new JButton("="));
        add(new JButton("0"));
        add(new JButton("."));
        add(new JButton("+"));
    }
}