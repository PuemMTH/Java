import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My First Swing App");
        // frame.setIconImages(new ImageIcon("images.jpg"));
        Container cp = frame.getContentPane();
        
        // cp.setLayout(new FlowLayout());
        // cp.setLayout(new BorderLayout());
        // cp.setLayout(new GridLayout(3, 3));
        cp.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        
        // contentPan Add image
        // ImageIcon image = new ImageIcon("C:\\Users\\User\\Desktop\\Java\\Java_Swing\\src\\images\\java.png");
        // SetSize
        
        
        // MenuBar
        // MenuBar add JMenuItem add JMenu add JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("New");
        JMenuItem menuItem2 = new JMenuItem("Open");
        JMenuItem menuItem3 = new JMenuItem("Save");
        JMenuItem menuItem4 = new JMenuItem("Exit");
        menu.add(menuItem);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menuBar.add(menu);


        JMenu Edit = new JMenu("Edit");
        JMenuItem EditItem = new JMenuItem("Cut");
        JMenuItem EditItem2 = new JMenuItem("Copy");
        JMenuItem EditItem3 = new JMenuItem("Paste");
        Edit.add(EditItem);
        Edit.add(EditItem2);
        Edit.add(EditItem3);
        menuBar.add(Edit);

        frame.setJMenuBar(menuBar);


        cp.add(new JLabel("Hello World"));
        cp.add(new JButton("Click Me"));
        cp.add(new JToggleButton("Toggle Button"));
        
        cp.add(new JCheckBox("Check Box", true));
        cp.add(new JCheckBox("Check Box", false));

        String[] arr = {"Java", "C++", "C#", "Python", "Ruby", "PHP", "JavaScript", "Swift", "Kotlin", "Go", "Scala" };
        JComboBox<String> combo1 = new JComboBox<>(arr);
        combo1.setSelectedIndex(2);
        cp.add(combo1);
        
        JComboBox<String> combo2 = new JComboBox<String>();
        combo2.addItem("Item 1");
        combo2.addItem("Item 2");
        combo2.addItem("Item 3");
        combo2.addItem("Item 4");
        combo2.addItem("Item 5");
        combo2.setSelectedIndex(2);
        cp.add(combo2);

        JList<String> list = new JList<String>(arr);
        cp.add(list);
        
        JTextField text = new JTextField(
            "This is a text field", 20);
        cp.add(text);

        JTextArea textArea = new JTextArea(
            "This is a text area", 5, 20);
        cp.add(textArea);

        cp.add(new JTextField("Text Field"));
        cp.add(new JTextArea("Text Area"));
        cp.add(new JPasswordField("Password Field"));
        cp.add(new JProgressBar(0, 100));
        cp.add(new JSlider(0, 100));
        cp.add(new JSpinner());

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Are you sure you want to exit?");
        panel.add(label);
        JButton button = new JButton("Yes");
        panel.add(button);
        JButton button2 = new JButton("No");
        panel.add(button2);
        cp.add(panel);



        // size windows
        // 720p = 1280x720
        // 1080p = 1920x1080
        frame.setSize(700, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // frame.setSize(1280, 720);
        // frame.pack();
    }
} 