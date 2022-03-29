import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        System.out.println("Euclid's Algorithm!");
        System.out.println("Enter two numbers to find the greatest common divisor.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);
        sc.next();
    }

    private static void gcd(int a, int b) {
        int count = 0;
        while (b != 0) {
            count++;
            int temp = b;
            b = a % b;
            System.out.println("#"+count+" "+a+" mod "+temp+" = "+b);
            a = temp;
            System.out.println("\ta = "+a);
            System.out.println("\tb = "+b);
        }
        System.out.println("GCD = "+a);
    }
}