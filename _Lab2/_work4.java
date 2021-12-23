import java.util.Scanner;

public class _work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float arr2d[][] = new float[4][4];
        System.out.println("Input arr2d : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextFloat();
            }
        }

        float arr2dTran[][] = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2dTran[j][i] = arr2d[i][j];
            }
        }

        System.out.println(" ");
        System.out.println("Transpose arr2d : ");
        for (int i = 0; i < arr2dTran.length; i++) {
            for (int j = 0; j < arr2dTran[i].length; j++) {
                System.out.print(arr2dTran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
