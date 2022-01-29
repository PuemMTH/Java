import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a text : ");
        String inputLine = sc.nextLine();
        String ansString = "";
        for(int i = inputLine.length(); i > 0; i--) {
            if(Character.isDigit(inputLine.charAt(i-1))) {
                ansString += inputLine.charAt(i-1);
            }
        }
        System.out.println("Number in text is : " + ansString);
        System.out.println("Number in text *3 is : " + Integer.parseInt(ansString)*3);
    }
}