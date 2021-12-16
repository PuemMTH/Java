import java.util.Scanner;

public class _work3 {
    static void nextNumbers() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input Yout number: ");
            int _int = sc.nextInt();
            int reverse, tmp = _int;
            System.out.print("Your Encryptin Code: ");
            while(tmp != 0) {
                reverse = tmp%10;
                tmp = tmp/10;
                if(reverse==10){
                    System.out.print(1);
                }else if(reverse%2==0){
                    System.out.print(reverse+1);
                }else if(reverse%2==1){
                    System.out.print(reverse-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        nextNumbers();
    }
}
