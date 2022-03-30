package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _CardLayout extends JFrame {
	
	CardLayout cards;
    JPanel cardPanel;

	public _CardLayout() {
		
		setBounds(100, 100, 450, 300);
		setTitle("ThaiCreate.Com GUI Tutorial");
		
		JPanel mainPanel = new JPanel();
        
        // Button Next
        JButton btnNext = new JButton("Next Panel");
        btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cards.next(cardPanel);
        	}
        });
        mainPanel.add(btnNext);
        
        getContentPane().add(mainPanel,BorderLayout.NORTH);
        
        cards = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cards);
        
        // Panel 1
        JPanel panel1 = new JPanel();
		JButton btn1 = new JButton("Button in Panel 1");
		panel1.add(btn1);

        
        // Panel 2
        JPanel panel2 = new JPanel();
		JButton btn2 = new JButton("Button in Panel 2");
		panel2.add(btn2);	 
		JButton btn3 = new JButton("Button in Panel 2");
		panel2.add(btn3);

        
        // Panel 3
        JPanel panel3 = new JPanel();
		JButton btn4 = new JButton("Button in Panel 3");
		panel3.add(btn4);	  
		JButton btn5 = new JButton("Button in Panel 3");
		panel3.add(btn5);
		JButton btn6 = new JButton("Button in Panel 3");
		panel3.add(btn6);	    
        
        cardPanel.add(panel1, "Panel 1");
        cardPanel.add(panel2, "Panel 2");
        cardPanel.add(panel3, "Panel 3");
        
        getContentPane().add(mainPanel,BorderLayout.NORTH);
        getContentPane().add(cardPanel,BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
}