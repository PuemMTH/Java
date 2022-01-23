import java.util.ArrayList;
import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        System.out.println("=========MENU=========");
        System.out.println("1) Add new student");
        System.out.println("2) Remove student");
        System.out.println("3) Find student");
        System.out.println("4) Edit Score");
        System.out.println("5) Show all student");
        System.out.println("6) Exit");
        System.out.println("======================");

        ArrayList<String[]> list = new ArrayList<String[]>();
        // Example: Student List
        // list.add(new String[]{"AMBER", "1"});
        // list.add(new String[]{"AYAKA", "2"});
        // list.add(new String[]{"CHONGYUN", "3"});
        // list.add(new String[]{"DILUC", "4"});
        // list.add(new String[]{"DIONA", "5"});
        // list.add(new String[]{"EULA", "6"});
        // list.add(new String[]{"FISCHL", "7"});
        // list.add(new String[]{"GABRIELA", "8"});
        // list.add(new String[]{"HANNAH", "9"});
        // list.add(new String[]{"ISABELLA", "10"});
        // list.add(new String[]{"JESSICA", "11"});
        // list.add(new String[]{"KARINA", "12"});
        // list.add(new String[]{"LUCY", "13"});
        // list.add(new String[]{"MADELINE", "14"});
        // list.add(new String[]{"NANCY", "15"});
        // list.add(new String[]{"OLIVIA", "16"});
        // list.add(new String[]{"PATRICIA", "17"});
        // list.add(new String[]{"QIAN", "18"});
        // list.add(new String[]{"ROSA", "19"});
        // list.add(new String[]{"SARAH", "20"});
        // list.add(new String[]{"TINA", "21"});
        // list.add(new String[]{"VICTORIA", "22"});
        // list.add(new String[]{"WENDY", "23"});
        // list.add(new String[]{"XIAO", "24"});
        // list.add(new String[]{"YAN", "25"});
        // list.add(new String[]{"ZHANG", "26"});
        // list.add(new String[]{"ZHEN", "27"});
        // list.add(new String[]{"ZHONG", "28"});
        // list.add(new String[]{"ZHU", "29"});
        list.add(new String[]{"A", "1"});
        list.add(new String[]{"B", "2"});
        list.add(new String[]{"C", "3"});
        list.add(new String[]{"D", "4"});
        list.add(new String[]{"E", "5"});
        list.add(new String[]{"F", "6"});
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Select -> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add new student");
                    System.out.print("Enter student name: ");
                    String Student = sc.next();
                    System.out.print("Enter student score: ");
                    String score = sc.next();
                    list.add(new String[]{Student, score});
                    System.out.println("Add new student successfully!");
                    break;
                case 2:
                    System.out.println("Remove student");
                    System.out.print("Enter student name: ");
                    String RemoveStudent = sc.next();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i)[0].equalsIgnoreCase(RemoveStudent)) {
                            System.out.println("Remove "+ list.get(i)[0] +" success");
                            list.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Find student");
                    System.out.print("Enter student name: ");
                    String FindStudent = sc.next();
                    // for (int i = 0; i < list.size(); i++) {
                    //     if (list.get(i)[0].equals(FindStudent)) {
                    //         System.out.println("Student name: " + list.get(i)[0] + " - Student score: " + list.get(i)[1]);
                    //     }
                    // }
                    for (String[] strings : list) {
                        if(strings[0].equalsIgnoreCase(FindStudent)) {
                            System.out.println("- Student name: " + strings[0] + ", Student score: " + strings[1]);
                            break;
                        }
                    }
                    // System.out.println("Not Find student " + FindStudent);
                    break;
                case 4:
                    System.out.println("Edit Score");
                    System.out.print("Edit Score student name: ");
                    String FindStuden = sc.next();
                    System.out.print("Enter student name: ");
                    String NewStudent = sc.next();
                    System.out.print("Enter student score: ");
                    String NewScore = sc.next();
                    // for (int i = 0; i < list.size(); i++) {
                    //     if (list.get(i)[0].equalsIgnoreCase(name4)) {
                    //         list.get(i)[1] = score4;
                    //         System.out.println("Edit "+ list.get(i)[0] +" success");
                    //         break;
                    //     }
                    // }
                    for (String[] strings : list) {
                        if(strings[0].equalsIgnoreCase(FindStuden)) {
                            strings[0] = NewStudent;
                            strings[1] = NewScore;
                            System.out.println("Edit "+ strings[0] +" success");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Show all student");
                    for (String[] strings : list) {
                        System.out.println(strings[0] + " " + strings[1]);
                    }
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}