package Node;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class _Tree {
    public _Tree(){
        new mainTree();
    }
}

class mainTree implements ActionListener, MouseListener {
    JFrame f;
    Container cp;
    JButton edit, save;
    JTextArea ShowTree,InputTree;
    JLabel InOrder,PreOrder,PostOrder;
    JLabel ButtonEdit,ButtonUpdate, OnClick_BTEdits, OnClick_BTUpdates;
    JLabel BTEdits,BTUpdates;
    JButton BTEdits_Button,BTUpdates_Button;

    ImageIcon bg = new ImageIcon("./img/Background.png");

    ImageIcon BTEdit = new ImageIcon("./img/BTEdit.png");
    ImageIcon OnClick_BTEdit = new ImageIcon("./img/OnClick_BTEdit.png");
    ImageIcon OnEntered_BTEdit = new ImageIcon("./img/OnEntered_BTEdit.png");

    ImageIcon BTUpdate = new ImageIcon("./img/BTUpdate.png");
    ImageIcon OnClick_BTUpdate = new ImageIcon("./img/OnClick_BTUpdate.png");
    ImageIcon OnEntered_BTUpdate = new ImageIcon("./img/OnEntered_BTUpdate.png");

    int count = 0;

// setFont(font.deriveFont(Font.BOLD, 12f))
    
    BinaryTree tree = null;

    public mainTree(){
        f = new JFrame();
        cp = f.getContentPane();
        cp.setLayout(null);

        BTEdit.setImage(BTEdit.getImage().getScaledInstance(BTEdit.getIconWidth()-550, BTEdit.getIconHeight()-550, Image.SCALE_REPLICATE));
        OnClick_BTEdit.setImage(OnClick_BTEdit.getImage().getScaledInstance(OnClick_BTEdit.getIconWidth()-550, OnClick_BTEdit.getIconHeight()-550, Image.SCALE_REPLICATE));
        OnEntered_BTEdit.setImage(OnEntered_BTEdit.getImage().getScaledInstance(OnEntered_BTEdit.getIconWidth()-550, OnEntered_BTEdit.getIconHeight()-550, Image.SCALE_REPLICATE));
       
        BTUpdate.setImage(BTUpdate.getImage().getScaledInstance(BTUpdate.getIconWidth()-550, BTUpdate.getIconHeight()-550, Image.SCALE_REPLICATE));
        OnClick_BTUpdate.setImage(OnClick_BTUpdate.getImage().getScaledInstance(OnClick_BTUpdate.getIconWidth()-550, OnClick_BTUpdate.getIconHeight()-550, Image.SCALE_REPLICATE));
        OnEntered_BTUpdate.setImage(OnEntered_BTUpdate.getImage().getScaledInstance(OnEntered_BTUpdate.getIconWidth()-550, OnEntered_BTUpdate.getIconHeight()-550, Image.SCALE_REPLICATE));

        // Button
        BTEdits_Button = new JButton(BTEdit);
        BTEdits_Button.setBounds(140,490,BTEdit.getIconWidth(),BTEdit.getIconHeight());
        BTEdits_Button.setBorder(null);
        BTEdits_Button.setContentAreaFilled(false);
        BTEdits_Button.setFocusPainted(false);
        BTEdits_Button.addActionListener(this);
        BTEdits_Button.addMouseListener(this);
        cp.add(BTEdits_Button);

        BTUpdates_Button = new JButton(BTUpdate);
        BTUpdates_Button.setBounds(340,490,BTUpdate.getIconWidth(),BTUpdate.getIconHeight());
        BTUpdates_Button.setBorder(null);
        BTUpdates_Button.setContentAreaFilled(false);
        BTUpdates_Button.setFocusPainted(false);
        BTUpdates_Button.addActionListener(this);
        BTUpdates_Button.addMouseListener(this);
        cp.add(BTUpdates_Button);
        try {
            // InputStream inputStream = new BufferedInputStream(
            //         new FileInputStream("./Font/BetterTogetherSpaced.ttf"));
            // Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);

            InOrder = new JLabel("NULL");
            PreOrder = new JLabel("NULL");
            PostOrder = new JLabel("NULL");
            InOrder.setFont(new Font("Arial", Font.ITALIC, 15));
            InOrder.setBackground(Color.BLACK);
            PreOrder.setFont(new Font("Arial", Font.ITALIC, 15));
            PreOrder.setBackground(Color.BLACK);
            PostOrder.setFont(new Font("Arial", Font.ITALIC, 15));
            PostOrder.setBackground(Color.BLACK);
            InOrder.setBounds(255, 142, 300, 50);
            PreOrder.setBounds(255, 186, 300, 50);
            PostOrder.setBounds(255, 232, 300, 50);
            cp.add(InOrder);
            cp.add(PreOrder);
            cp.add(PostOrder);

            // TextArea
            InputTree = new JTextArea();
            InputTree.setBounds(62, 335, 455, 120);
            InputTree.append("T:a,TL:b,TLR:e,TLL:d,TLLR:h,TR:c,TRL:f,TRR:g");
            InputTree.setEditable(true);
            // InputTree.setFont(font.deriveFont(Font.ITALIC, 30f));
            InputTree.setFont(new Font("Arial", Font.ITALIC, 15));
            InputTree.setForeground(Color.BLACK);
            cp.add(InputTree);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Background
        bg.setImage(bg.getImage().getScaledInstance(590, 590, Image.SCALE_REPLICATE));
        JLabel Background = new JLabel(bg);
        Background.setBounds(-5,-20,bg.getIconWidth(),bg.getIconHeight());
        cp.add(Background);

        f.setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
        cp.setBackground(Color.gray);
        f.setTitle("Mochi");
        f.setSize(600, 600);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    public void getOrder(String args){
        count++;
        System.out.println("==============>"+count+"<==============");
        tree = new BinaryTree();
        // tree.NodeClear(tree.root);
        HashMap<String, String> map = new HashMap<>();
        // Delete all space
        for (int i = 0; i < args.length(); i++) {
            if (args.charAt(i) == ' ') {
                args = args.substring(0, i) + args.substring(i + 1);
            }
        }
        // Delete all \\n
        for (int i = 0; i < args.length(); i++) {
            if (args.charAt(i) == '\n') {
                args = args.substring(0, i) + args.substring(i + 1);
            }
        }
        // Split
        String[] str = args.split(",");
        String[] str2 = new String[2];
        
        for (String string : str) {
            str2 = string.split(":");
            map.put(str2[0], str2[1]);
        }
        // map.forEach((k, v) -> {
        //     System.out.println(k + ":" + v + ":");
        // });
        tree.insert(tree, map);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == BTEdits_Button){
            InputTree.setEditable(true);
        }
        if(e.getSource() == BTUpdates_Button){
            InputTree.setEditable(false);
            BTEdits_Button.setIcon(OnClick_BTEdit);
            getOrder(InputTree.getText());
            InOrder.setText(tree.inorder(tree.root));
            PreOrder.setText(tree.preorder(tree.root));
            PostOrder.setText(tree.postorder(tree.root));
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == BTEdits_Button){
            BTEdits_Button.setIcon(OnClick_BTEdit);

        }
        if(e.getSource() == BTUpdates_Button){
            BTUpdates_Button.setIcon(OnClick_BTUpdate);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == BTEdits_Button){
            BTEdits_Button.setIcon(OnEntered_BTEdit);
            // InputTree.setEditable(true);
        }
        if(e.getSource() == BTUpdates_Button){
            BTUpdates_Button.setIcon(OnEntered_BTUpdate);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == BTEdits_Button){
            BTEdits_Button.setIcon(OnEntered_BTEdit);
        }
        if(e.getSource() == BTUpdates_Button){
            BTUpdates_Button.setIcon(OnEntered_BTUpdate);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == BTEdits_Button){
            BTEdits_Button.setIcon(BTEdit);
        }
        if(e.getSource() == BTUpdates_Button){
            BTUpdates_Button.setIcon(BTUpdate);
        }
    }
}