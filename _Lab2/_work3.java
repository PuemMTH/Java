public class _work3 {
    public static void main(String[] args) {
        int arr2d[][] = new int[3][4];
        int num = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                num+=10;
                arr2d[i][j] = num;
            }
        }
    }
}
