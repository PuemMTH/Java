import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Full Name : ");
            String n = sc.nextLine();
            String[] arr = n.split(" ");
            System.out.println("First Name : " + arr[0]);
            System.out.println("Last Name : " + arr[1]);
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
}