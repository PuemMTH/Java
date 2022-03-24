package com.puem.gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainFrame {
    JFrame f;
    Container cp;
    JMenuBar mb;
    JMenu menu, submenu;  
    JMenuItem i1, i2, i3, i4, i5;
    ImageIcon bg_star = new ImageIcon(getClass().getClassLoader().getResource("com/puem/gui/image/ganyu.jpg"));
    static Point compCoords;

    public mainFrame() {
        f = new JFrame();
        cp = f.getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(12,12,12));

        JLabel closeButton = new JLabel("X");
        closeButton.setBounds(560+20, 10, 20, 20);
        closeButton.setForeground(Color.WHITE);
        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
            public void mouseEntered(MouseEvent e) {
                f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {
                f.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }

        });
        f.add(closeButton);

        JLabel minimizeButton = new JLabel("_");
        minimizeButton.setBounds(530+20, 10, 20, 20);
        minimizeButton.setForeground(Color.WHITE);
        minimizeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f.setState(JFrame.ICONIFIED);
            }
            public void mouseEntered(MouseEvent e) {
                f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {
                f.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }

        });
        f.add(minimizeButton);

        JLabel title = new JLabel("Terminal");
        title.setBounds(10, 10, 100, 20);
        title.setForeground(Color.WHITE);
        f.add(title);

        // add top panel
        JPanel topPanel = new JPanel();
        topPanel.setBounds(0, 0, 800, 40);
        // topPanel.setBackground(Color.BLACK);
        topPanel.setForeground(Color.blue);
        topPanel.setBackground(Color.black);
        cp.add(topPanel);
        compCoords = null;
        topPanel.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                compCoords = null;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                compCoords = e.getPoint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

        });
        topPanel.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
               Point p = e.getLocationOnScreen();
                f.setLocation(p.x - compCoords.x, p.y - compCoords.y);
            }
            public void mouseMoved(MouseEvent e) {
                
            }
        });

        // ImageIcon imageIcon = new ImageIcon("com/puem/gui/image/ganyu.jpg");
        JLabel Background = new JLabel(bg_star);
        Background.setBounds(0, 0, bg_star.getIconWidth(), bg_star.getIconHeight());
        cp.add(Background);

        f.setTitle("Terminal");
        f.setSize(600, 600);
        f.setUndecorated(true);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
}