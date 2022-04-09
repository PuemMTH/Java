import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new Temperature();
    }
}

class Temperature extends JPanel implements ActionListener {
    private int tem = 25;
    JLabel Tem; 
    public Temperature() {
        JFrame frame = new JFrame("Temperature");
        Container cp = frame.getContentPane();
        cp.setLayout(null);

        Tem = new JLabel(tem + " Celsius");
        Tem.setFont(new Font("Verdana", Font.PLAIN, 20));
        Tem.setHorizontalAlignment(SwingConstants.CENTER);
        Tem.setBounds(0, 0, 300, 50);
        cp.add(Tem);

        JButton down = new JButton("-");
        JButton up = new JButton("+");

        down.setActionCommand("down");
        down.addActionListener(this);
        down.setBounds(60, 50, 70, 40);

        up.setActionCommand("up");
        up.addActionListener(this);
        up.setBounds(160, 50, 70, 40);

        cp.add(up);
        cp.add(down);

        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("up")) {
            tem++;
            Tem.setText(tem + " Celsius");
        } else if (e.getActionCommand().equals("down")) {
            tem--;
            Tem.setText(tem + " Celsius");
        }
    }
}