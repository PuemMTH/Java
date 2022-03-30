package ui;

import java.util.Scanner;

public class Layout {
    public Layout() {
        System.out.println("Select Layout");
        System.out.println("1. GridBagLayout");
        System.out.println("2. BorderLayout");
        System.out.println("3. FlowLayout");
        System.out.println("4. CardLayout");
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        // int choice = sc.nextInt();
        // switch (choice) {
        //     case 1:
        //         new _GridBagLayout();
        //         break;
        //     case 2:
                new _BorderLayout();
        //         break;
        //     case 3:
                // new _FlowLayout();
        //         break;
        //     case 4:
        //         new _CardLayout();
        //         break;
        //     default:
        //         System.out.println("Invalid choice");
        //         break;
        // }
    }
}
