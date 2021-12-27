import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(1);
        // // Shift all elements to the right by one
        // list.add(2,40);
        // // Change the value index 0 to Value 50
        // list.set(0,50);
        // Remove the element at index 1
        // list.remove(index); ลบ index ที่กำหนด
        // list.remove(Integer.valueOf(0)); ลบ ที่มีค่าเป็น 0

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter position " +list.size()+1 + ": ");
            list.add(sc.nextInt());
        }
        // list.add(index, [vaule]);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Element " + (i+1) + ": " + list.get(i));
        }
    }
}
