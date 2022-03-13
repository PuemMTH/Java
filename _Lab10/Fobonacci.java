import java.util.Scanner;

public class Fobonacci {
    public static void main(String[] args) {
        System.out.println("Fobonacci");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number: ");
        double n = sc.nextDouble();
        System.out.println("Value of " + n + "'th Fibonacci number = " + fobonacci(n));
    }

    private static double fobonacci(double n) {
        // System.out.print(n + " ");
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fobonacci(n-1) + fobonacci(n-2);
    }
}