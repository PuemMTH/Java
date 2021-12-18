# This is a Lab 1
## Lab 1 about moving from c language to java

```JAVA
import java.util.Scanner;

public class _work1 {
    static void nextDelively(){
        Float nisit_score;
        try (Scanner sc = new Scanner(System.in)) {
            // boolean condition = true;
            // while(condition == true) {
                System.out.print("Input Distance(km): ");
                nisit_score = sc.nextFloat();
                if(nisit_score <= 4){
                    System.out.println("Delivery Fee = Free!!");
                }else if(nisit_score > 4 && nisit_score <= 10){
                    System.out.println("Delivery Fee = " + (nisit_score - 4) * 10 + "Bath.");
                }else if(nisit_score > 10){
                    System.out.println("Delivery Fee = " + (60 + (nisit_score - 10) * 12) + "Bath.");
                }
            // }
        }
    }
    public static void main(String[] args) {
        nextDelively();
    }
}
```