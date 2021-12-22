import java.util.ArrayList;
import java.util.Scanner;

public class forEach{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter position " +list.size()+1 + ": ");
            list.add(sc.nextInt());
        }
        // for(int i : list) {
        //     System.out.println("Element " + (list.indexOf(i)) + ": " + i);
        // }

        // for each loop
        for(Integer tmp : list)
            System.out.println("Element " + (list.indexOf(tmp)) + ": " + tmp);
    }
}