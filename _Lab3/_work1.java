import java.util.Scanner;

public class _work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A[] = new String[2];
        for (int i = 0 ; i < 2 ; i++) {
            System.out.print("Input String " + i + " : ");
            A[i] = sc.nextLine();
            // A[i] = sc.nextLine().toLowerCase();
        }
        // System.out.println(A[0].equalsIgnoreCase(A[1]));
        System.out.println("The two strings are " + (A[0].equalsIgnoreCase(A[1]) ? "equal." : "not equal."));
    }
}