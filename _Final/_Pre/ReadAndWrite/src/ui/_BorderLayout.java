package ui;
import java.awt.*;
import javax.swing.*;

public class _BorderLayout extends JFrame {

	public _BorderLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("ThaiCreate.Com GUI Tutorial");
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
        JButton button = new JButton("Button 1 (PAGE_START)");
        getContentPane().add(button, BorderLayout.PAGE_START);
      
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        getContentPane().add(button, BorderLayout.CENTER);
        
        button = new JButton("Button 3 (LINE_START)");
        getContentPane().add(button, BorderLayout.LINE_START);
        
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        getContentPane().add(button, BorderLayout.PAGE_END);
        
        button = new JButton("5 (LINE_END)");
        getContentPane().add(button, BorderLayout.LINE_END);

        setVisible(true);

	}
}