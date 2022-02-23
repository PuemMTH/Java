package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe {
    public TicTacToe() {
        new TicTacToePanel();
    }
}

class TicTacToePanel extends JPanel implements ActionListener, MouseListener{
    JFrame frame;
    JButton B[];
    JLabel L;
    String T = "X";
    int count = 0;
    public TicTacToePanel(){
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        L = new JLabel("Tic Tac Toe");
        L.setFont(new Font("Arial",Font.BOLD,20));
        L.setPreferredSize(new Dimension(200,30));
        L.setHorizontalAlignment(SwingConstants.CENTER);
        L.addMouseListener(this);
        frame.add(L, BorderLayout.NORTH);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3,3));
        B = new JButton[9];
        for (int i = 0; i < B.length; i++) {
            B[i] = new JButton("");
            B[i].addActionListener(this);
            B[i].setActionCommand(""+i);
            p.add(B[i]);
        }
        frame.add(p, BorderLayout.CENTER);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void Clear() {
        for (int i = 0; i < B.length; i++) {
            B[i].setEnabled(true);
            B[i].setText("");
        }
        T = "X";
        L.setText("Tic Tac Toe");
        count = 0;
    }
    private boolean checkWin() {
        if(B[0].getText().equals(B[1].getText()) && B[1].getText().equals(B[2].getText()) && !B[0].getText().equals("")) return true;
        if(B[3].getText().equals(B[4].getText()) && B[4].getText().equals(B[5].getText()) && !B[3].getText().equals("")) return true;
        if(B[6].getText().equals(B[7].getText()) && B[7].getText().equals(B[8].getText()) && !B[6].getText().equals("")) return true;
        if(B[0].getText().equals(B[3].getText()) && B[3].getText().equals(B[6].getText()) && !B[0].getText().equals("")) return true;
        if(B[1].getText().equals(B[4].getText()) && B[4].getText().equals(B[7].getText()) && !B[1].getText().equals("")) return true;
        if(B[2].getText().equals(B[5].getText()) && B[5].getText().equals(B[8].getText()) && !B[2].getText().equals("")) return true;
        if(B[0].getText().equals(B[4].getText()) && B[4].getText().equals(B[8].getText()) && !B[0].getText().equals("")) return true;
        if(B[2].getText().equals(B[4].getText()) && B[4].getText().equals(B[6].getText()) && !B[2].getText().equals("")) return true;
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        String s = e.getActionCommand();
        int i = Integer.parseInt(s);
        switch (s) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
                if(B[i].getText().equals("")){
                    count++;
                    if(count == 8){
                        for (int j = 0; j < B.length; j++) {
                            L.setText("Click to play");
                            B[j].setEnabled(false);
                        }
                        JOptionPane.showMessageDialog(null, "Draw");
                        break;
                    }
                    B[i].setText(T);
                    if(T.equals("X")) T = "O";
                    else T = "X";
                    L.setText(T+" Turn");
                }
                if(checkWin()){
                    if(T=="X") T="O";
                    else T = "X";
                    JOptionPane.showMessageDialog(null, T+" Win");
                    for (int j = 0; j < B.length; j++) {
                        L.setText("Click to play");
                        B[j].setEnabled(false);
                    }
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        Clear();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}