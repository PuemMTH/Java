# This is a Lab 1
## Lab 1 about moving from c language to java
| Lab 1
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

```java
import java.util.Scanner;

public class _work2 {
    static void nextNisit(){
        try (Scanner sc = new Scanner(System.in)) {
            boolean check=true;
            float max = 0 , score,count = 0;
            String STD_ID , position="";
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
```