
import java.util.Scanner;
public class _work2 {
    static void nextNisit(){
        try (Scanner sc = new Scanner(System.in)) {
            boolean check=true;
            float max = 0 , score,count = 0;
            String STD_ID , position = "";
            while(check==true) {
                    System.out.print("Std ID : ");
                    STD_ID = sc.next();
                    if(STD_ID.equals("Q")) {
                    check=false;
                }else{
                    System.out.print("Score = ");
                    score = sc.nextFloat();
                    count++;
                    if(count == 1) {
                        max = score;
                        position = STD_ID;
                    }else if(score>max) {
                        max = score;
                        position = STD_ID;
                    }
                }
            }
            System.out.println("Maxinum Score is " +max+ " on " +position);
        }
    }
    public static void main(String[] args) {
        nextNisit();
    }
}
