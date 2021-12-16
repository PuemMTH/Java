import java.util.Scanner;

public class _work4 {
    private static void nextStar() {
        int _count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int _star = sc.nextInt();
            for (int i = 1; i <= _star/2; i++) { // 7/2 = 3.5
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    ++_count;
                }
                System.out.println();
            }
            for (int i = 1; i <= _star/2+1; i++) {
                for (int j = _star/2+1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = _star/2+1; j >= i; j--) {
                    System.out.print("*");
                    ++_count;
                }
                System.out.println();
            }
            System.out.println("Count of star is " + _count);
        }
    }
    public static void main(String[] args) {
        nextStar();
    }
}
