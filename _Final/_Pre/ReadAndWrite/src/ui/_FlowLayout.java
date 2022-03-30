package ui;
import java.awt.*;
import javax.swing.*;

public class _FlowLayout extends JFrame {
    public _FlowLayout() {
        JFrame frame = new JFrame("FlowLayout");
        Container contentPane = frame.getContentPane();
        Container contentPane2 = frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("Button 2"));
        contentPane.add(new JButton("Button 3"));
        contentPane.add(new JButton("Button 4"));
        contentPane2.add(new JButton("Button 5"));
        contentPane2.add(new JButton("Button 6"));
        contentPane2.add(new JButton("Button 7"));
        contentPane2.add(new JButton("Button 8"));
        contentPane2.add(new JButton("Button 9"));
        contentPane2.add(new JButton("Button 10"));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}