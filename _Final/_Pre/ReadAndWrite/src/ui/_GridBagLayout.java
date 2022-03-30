package ui;
import javax.swing.*;
import java.awt.*;

public class _GridBagLayout {
    public _GridBagLayout() {
        JFrame f = new JFrame("Register");
        Container cp = f.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(new TopPanel() , BorderLayout.NORTH);
        cp.add(new LeftPanel() , BorderLayout.WEST);
        cp.add(new CenterPanel() , BorderLayout.CENTER);
        cp.add(new RightPanel() , BorderLayout.EAST);
        // cp.add(new BottomPanel() , BorderLayout.SOUTH);
        f.pack();
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class TopPanel extends JPanel {
    public TopPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.CENTER;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        JLabel lbl = new JLabel("Register");
        lbl.setFont(new Font("Arial", Font.BOLD, 15));
        lbl.setBackground(Color.RED);
        add(lbl, gbc);
    }
}
class LeftPanel extends JPanel {
    public LeftPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("Name"), gbc);
        gbc.gridy = 1;
        add(new JLabel("Email"), gbc);
        gbc.gridy = 2;
        add(new JLabel("Phone"), gbc);
        gbc.gridy = 3;
        add(new JLabel("Address"), gbc);
    }
}
class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(new JTextField(20), gbc);
        gbc.gridy = 1;
        add(new JTextField(20), gbc);
        gbc.gridy = 2;
        add(new JTextField(20), gbc);
        gbc.gridy = 3;
        add(new JTextField(20), gbc);
    }
}

class RightPanel extends JPanel {
    public RightPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(new JButton("Edit"), gbc);
        gbc.gridy = 1;
        add(new JButton("Update"), gbc);
        gbc.gridy = 2;
        add(new JButton("List"), gbc);
        gbc.gridy = 3;
        add(new JButton("Delete"), gbc);
    }
}
