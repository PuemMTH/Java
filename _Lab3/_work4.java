import java.util.Scanner;

public class _work4 {
    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Input A : ");
                String A = input.nextLine();
                int num1 = Integer.parseInt(A);
                System.out.print("Input B : ");
                String B = input.nextLine();
                int num2 = Integer.parseInt(B);
                System.out.println("A/B = "+ num1/num2);
                break;
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
