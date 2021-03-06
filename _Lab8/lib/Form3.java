package lib;
import javax.swing.*;
import java.awt.*;

// public class Form3 {
//     public Form3(){
//         JFrame f = new JFrame("Register");
//         Container cp = f.getContentPane();
//         cp.add(new p1(), BorderLayout.NORTH);
//         cp.add(new p2(), BorderLayout.SOUTH);
//         f.pack();
//         f.setVisible(true);
//         f.setResizable(false);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

// class p1 extends JPanel {
//     public p1(){
//         setLayout(new GridBagLayout());
//         GridBagConstraints c = new GridBagConstraints();
//             c.insets = new Insets(5,5,5,5);
//             c.gridx = 0;
//             c.gridy = 0;
//             c.anchor = GridBagConstraints.EAST;
//         add(new JLabel("Title : "), c);
//             c.gridy = 1;
//         add(new JLabel("First name : "), c);
//             c.gridy = 2;
//         add(new JLabel("TEL : "), c);
//             c.gridy = 3;
//         add(new JLabel("Address : "), c);
//             c.gridx = 1;
//             c.gridy = 0;
//             c.anchor = GridBagConstraints.WEST;
//             String address[] = {"Mr.", "Mrs.", "Miss", "Dr.", "Prof.", "Rev.", "Rev. Fr."};
//             JComboBox<String> cb = new JComboBox<>(address);
//         add(cb, c);
//             c.gridy = 1;
//         add(new JTextField("", 15), c);
//             c.gridy = 2;
//         add(new JTextField("", 15), c);
//             c.gridy = 3;
//             c.gridwidth = 2;
//             c.fill = GridBagConstraints.HORIZONTAL;
//         add(new JTextField("", 30), c);
//         c.fill = GridBagConstraints.NONE;
//             c.gridwidth = 1;
//             c.gridx = 2;
//             c.gridy = 0;
//             c.anchor = GridBagConstraints.EAST;
//         add(new JLabel("Sex : "), c);
//             c.gridy = 1;
//         add(new JLabel("Last name : "), c);
//             c.gridx = 3;
//             c.gridy = 0;
//             c.anchor = GridBagConstraints.WEST;
//             JRadioButton r1 = new JRadioButton("Male",false);
//             JRadioButton r2 = new JRadioButton("Female",true);
//             ButtonGroup bt = new ButtonGroup();
//             bt.add(r1); bt.add(r2);
//             JPanel tmp = new JPanel();
//             tmp.add(r1);
//             tmp.add(r2);  
//             add(tmp,c);
//             c.gridx = 3 ;
//             c.gridy = 1 ;
//         add(new JTextField("", 15), c);
//     }
// }

// class p2 extends JPanel {
//     public p2(){
//         setLayout(new GridBagLayout());
//         GridBagConstraints c = new GridBagConstraints();
//             c.insets = new Insets(5,5,5,5);
//             c.gridx = 0;
//             c.gridy = 0;
//             JButton b1 = new JButton("Select File");
//         add(b1, c);
//             c.gridx = 1;
//             c.gridy = 0;
//         add(new JTextField("",30), c);
//             c.gridx = 0;
//             c.gridy = 1;
//             c.anchor = GridBagConstraints.FIRST_LINE_END;
//         add(new JLabel("Note : "), c);
//             c.gridx = 1;
//             c.anchor = GridBagConstraints.FIRST_LINE_START;
//         add(new JTextArea("",7,30),c);
//             c.gridx = 1;
//             c.gridy = 3;
//             c.anchor = GridBagConstraints.CENTER;
//             JPanel tmp = new JPanel();
//             JButton b2 = new JButton("Register");
//             tmp.add(b2, c);
//             JButton b3 = new JButton("Cancel");
//             tmp.add(b3, c);
//         add(tmp, c);
//     }
// }




public class Form3 {
    public Form3(){
        JFrame f = new JFrame("Register");
        Container cp = f.getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(new Panel1() , BorderLayout.NORTH);
        cp.add(new Panel2() , BorderLayout.SOUTH);

        f.pack();
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    }
class Panel1 extends JPanel{
    public Panel1(){

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);

        c.gridx = 0 ; c.gridy =0 ;
        add(new JLabel("Title : "),c);

        c.gridx = 0 ; c.gridy =1 ;
        add(new JLabel("First name : "),c);

        c.gridx = 0 ; c.gridy =2 ;
        add(new JLabel("TEL: : "),c);

        c.gridx = 0 ; c.gridy =3 ;
        add(new JLabel("Address : "),c);

        String[] arr = {"Prof. ","Dr.","Miss.","Mr."};
        JComboBox<String> cb = new JComboBox<>(arr);

        c.gridx = 1 ; c.gridy =0 ; c.anchor = GridBagConstraints.WEST;
        add(cb,c);

        c.gridx = 1 ; c.gridy =1 ;
        add(new JTextField("",15),c);

        c.gridx = 1 ; c.gridy =2 ;c.anchor = GridBagConstraints.EAST;
        add(new JTextField("",15),c);

        c.gridx = 1 ; c.gridy =3 ; c.gridwidth = 3 ; c.fill = GridBagConstraints.HORIZONTAL;
        add(new JTextField("",30),c);

        c.gridx = 2 ; c.gridy =1 ; c.gridwidth = 1 ; c.fill = GridBagConstraints.NONE;
        add(new JLabel("Last Name : "),c);

        c.gridx = 3 ; c.gridy =1 ;
        add(new JTextField("",15),c);

        c.gridx = 2 ; c.gridy =0 ;
        add(new JLabel("sex : "),c);

        JRadioButton r1 = new JRadioButton("Male",false);
        JRadioButton r2 = new JRadioButton("Female",true);

        ButtonGroup bt = new ButtonGroup();
        bt.add(r1);bt.add(r2);

        JPanel tmp = new JPanel();
        tmp.add(r1);
        tmp.add(r2);

        c.gridx = 3 ; c.gridy =0 ;
        add(tmp,c);
    }

}

class Panel2 extends JPanel{

    public Panel2(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);

        c.gridx = 0 ; c.gridy = 0;
        add(new JButton("Select File"),c);

        c.gridx = 1 ; c.gridy = 0;
        add(new JTextField("",25),c);

        c.gridx = 0 ; c.gridy = 1;c.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel("Note : "),c);

        c.gridx = 0 ; c.gridy = 1; c.gridwidth = 3; c.anchor = GridBagConstraints.LINE_END;
        add(new JTextArea(10,30),c);

        JButton b1 = new JButton("Regis");
        JButton b2 = new JButton("Cancel");

        ButtonGroup bt = new ButtonGroup();
        bt.add(b1);bt.add(b2);

        JPanel tmp = new JPanel();
        tmp.add(b1);
        tmp.add(b2);

        c.gridx = 1 ; c.gridy =2 ;c.anchor = GridBagConstraints.CENTER;
        add(tmp,c);

    }

}