package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button {
    public Button() {
        new ButtonPanel();
    }
}

class ButtonPanel extends JPanel implements KeyListener {
    JFrame frame;
    Container cp;
    JButton Button;
    private int x, y;
    public ButtonPanel() {
        frame = new JFrame("Login");
        cp = frame.getContentPane();
        cp.setLayout(null);

        Button = new JButton("Hello");
        Button.setBounds(x, y, 80, 50);
        cp.add(Button);
        Button.addKeyListener(this);

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 10;
            Button.setBounds(x, y, 80, 50);
        }
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 10;
            Button.setBounds(x, y, 80, 50);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
            Button.setBounds(x, y, 80, 50);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // x += 10;
            // Button.setBounds(x, y, 80, 50);
            x += 10;
            Button.setBounds(x, y, 80, 50);
        }
    }

}