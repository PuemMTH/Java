import java.util.Scanner;

public class _Exception {
    public static void main(String[] args) {
        int number;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            number = 1;
        } catch (Exception e) {
            System.out.println("Invalid input");
            number = 1;
        } finally{
            System.out.println("The number is ");
        }
        System.out.println("You entered " + number);
    }
}
