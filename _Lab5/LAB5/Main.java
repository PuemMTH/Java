import java.util.Scanner;
import Lib.Number;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my Program.");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            Number cal = new Number(sc.nextInt());
            System.out.println("Value of n " + cal.getN());
            System.out.println(" 1 " + "isZero       -> " + cal.isZero());
            System.out.println(" 2 " + "isPositive   -> " + cal.isPositive());
            System.out.println(" 3 " + "isNegative   -> " + cal.isNegative());
            System.out.println(" 4 " + "isEven       -> " + cal.isEven());
            System.out.println(" 5 " + "isOdd        -> " + cal.isOdd());
            System.out.println(" 6 " + "isPrime      -> " + cal.isPrime());
            System.out.println(" 7 " + "Factorial    -> " + cal.Factorial());
            System.out.println(" 8 " + "powTwo       -> " + cal.powTwo());
            System.out.println(" 9 " + "sqrt         -> " + cal.sqrt());
            System.out.println("10 " + "sumOfDigits  -> " + cal.sumOfDigits());
            System.out.println("11 " + "Reverse      -> " + cal.Reverse());
            System.out.println("12 " + "divisibleBy  -> " + cal.divisibleBy());
            System.out.println("13 " + "Too Binary   -> " + cal.toBinary());
            System.out.println("14 " + "To Hex       -> " + cal.toHex());
            System.out.println("15 " + "To Octal     -> " + cal.toOctal());
            System.out.println("16 " + "To Decimal   -> " + cal.toDecimal());
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
