import java.util.Scanner;

public class _work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int num = sc.nextInt();
        int numar[][] = new int[num][];
        for (int i = 0; i < numar.length; i++) {
            numar[i] = new int[num--];
        }
        
        int tmp = 1;
        for (int i = 0; i < numar.length; i++) {
            for (int j = 0; j < numar[i].length; j++) {
                numar[i][j] = tmp++;
            }
        }

        for (int i = 0; i < numar.length; i++) {
            for (int j = 0; j < numar[i].length; j++) {
                System.out.print(numar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
