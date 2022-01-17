import java.beans.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class _work5 {
    public static void ShowArr(ArrayList<Integer> arr) {
        System.out.print("My ArrayList = ");
        for(int i = 0 ;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void ln(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("=====MENT=====");
        System.out.println("1) Add to back");
        System.out.println("2) Add at index");
        System.out.println("3) Edit");
        System.out.println("4) Remove by index");
        System.out.println("5) Remove by value");
        System.out.println("6) Exit");

        while(true){
            try {
                Scanner sc = new Scanner(System.in);
                ln(1);
                System.out.print("Select ---> ");
                int menuSwitch = sc.nextInt();
                switch(menuSwitch){
                    case 1:
                        // add to back
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        arr.add(value);
                        ShowArr(arr);
                        break;
                    case 2:
                        // add to index
                        System.out.print("Enter value: ");
                        int value2 = sc.nextInt();
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();
                        arr.add(index,value2);
                        ShowArr(arr);
                        break;
                    case 3:
                        // edit by index
                        System.out.print("Enter index: ");
                        int index2 = sc.nextInt();
                        System.out.print("Enter new value: ");
                        int value3 = sc.nextInt();
                        arr.set(index2,value3);
                        ShowArr(arr);
                        break;
                    case 4:
                        // Remove by index
                        System.out.print("Enter index: ");
                        int index3 = sc.nextInt();
                        arr.remove(index3);
                        ShowArr(arr);
                        break;
                    case 5:
                        // Remove by value
                        System.out.print("Enter value: ");
                        int value4 = sc.nextInt();
                        arr.remove(value4);
                        ShowArr(arr);
                        break;
                    case 6:
                        // Exit
                        System.exit(0);
                    default:
                        // default case err
                        System.out.println("Invalid input");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
    }
}