import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr2D[][] = new int[2][3];
        for(int i=0; i < arr2D.length; i++) {
            for(int j=0; j < arr2D[i].length; j++) {
                System.out.print("Enter the locate " + i + j + " : ");
                arr2D[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i < arr2D.length; i++) {
            for(int j=0; j < arr2D[i].length; j++) {
                System.out.println("locate is " + i + j + " : " + arr2D[i][j] + " ");
            }
        }
    }
}
