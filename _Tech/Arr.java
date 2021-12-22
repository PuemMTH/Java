import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[30];
        // int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+" | "+arr[i]);
        }
    }
}
