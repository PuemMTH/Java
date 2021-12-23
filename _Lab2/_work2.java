import java.util.Scanner;

public class _work2 {
    public static void main(String[] args) {
        String a[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter input nisit["+i+"] : ");
            a[i] = sc.nextLine();
        }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        System.out.println(" ");
        for(String tmp : a){
            System.out.println(tmp);
        }
    }
}
