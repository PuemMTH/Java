import java.util.ArrayList;
import java.util.Scanner;
import jung.Teacher;
import jung.Subject;

public class _Main {
    public static void main(String[] args) {
        System.out.println("=========MENU=========");
        System.out.println("1. Add Teacher");
        System.out.println("2. Add Subject");
        System.out.println("3. Remove Teacher");
        System.out.println("4. Remove Subject");
        System.out.println("5. Show Teacher");
        System.out.println("6. Show Subject");
        System.out.println("7. Exit");
        System.out.println("=====================");
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        // listTeacher.add(new Teacher("2", "Nguyen Van B", "Thailand", new Subject("Fundamentals of Computing", "02708102-64")));
        while(true){
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=========ADD TEACHER=========");
                    System.out.print("Enter id: ");
                    String id = sc.next();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter address: ");
                    String address = sc.next();
                    System.out.print("Enter subject: ");
                    String subject = sc.next();
                    Teacher teacher = new Teacher(id, name, address, new Subject(subject));
                    listTeacher.add(teacher);
                    System.out.println("=============================");
                    break;
                case 2:
                    System.out.println("=========ADD SUBJECT=========");
                    System.out.print("Enter ID Teacher to Add Subject : ");
                    String FindID = sc.next();
                    for(int i = 0; i < listTeacher.size(); i++){
                        if(listTeacher.get(i).getId().equalsIgnoreCase(FindID)){
                            System.out.println("Find Teacher Name: " + listTeacher.get(i).getName());
                            System.out.print("Enter Subject: ");
                            String subject2 = sc.next();
                            listTeacher.get(i).getSubject().getListSubjects().add(subject2);
                        }
                    }
                    System.out.println("=====================");
                    break;
                case 3:
                    System.out.println("=========REMOVE TEACHER=========");
                    System.out.print("Enter ID Teacher to Remove: ");
                    String FindID2 = sc.next();
                    for(int i = 0; i < listTeacher.size(); i++){
                        if(listTeacher.get(i).getId().equalsIgnoreCase(FindID2)){
                            System.out.println(listTeacher.get(i).getName() + " has been removed.");
                            listTeacher.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("=========REMOVE SUBJECT=========");
                    System.out.print("Enter ID Teacher to Remove Subject: ");
                    String FindID3 = sc.next();
                    for(int i = 0; i < listTeacher.size(); i++){
                        if(listTeacher.get(i).getId().equalsIgnoreCase(FindID3)){
                            System.out.println("Find Teacher Name: " + listTeacher.get(i).getName());
                            System.out.println("Find Subject Name: " + listTeacher.get(i).getSubject().getListSubjects());
                            System.out.print("Enter Subject to Remove: ");
                            String subject3 = sc.next();
                            for(int j = 0; j < listTeacher.get(i).getSubject().getListSubjects().size(); j++){
                                if(listTeacher.get(i).getSubject().getListSubjects().get(j).equalsIgnoreCase(subject3)){
                                    System.out.println(listTeacher.get(i).getSubject().getListSubjects().get(j) + " has been removed.");
                                    listTeacher.get(i).getSubject().getListSubjects().remove(j);
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("=========SHOW TEACHER=========");
                    for (Teacher teacher1 : listTeacher) {
                        System.out.println(teacher1);
                    }
                    System.out.println("=====================");
                    break;
                case 6:
                    System.out.println("=========SHOW SUBJECT=========");
                    for (Teacher teacher2 : listTeacher) {
                        System.out.println(teacher2.getSubject());
                    }
                    System.out.println("=====================");
                    break;
                case 7:
                    System.out.println("=========EXIT=========");
                    System.exit(0);
                    break;
                default:
                    System.out.println("=========INVALID=========");
                    break;
            }
        }
    }
}
