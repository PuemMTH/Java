<img src="https://raw.githubusercontent.com/PuemMTH/Java/master/image/JAVA.png" />


# Lab 1 about moving from c language to java

## __WORK ONE
<hr>

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

## __WORK TWO
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
## __WORK THREE
    
```JAVA
import java.util.Scanner;

public class _work3 {
    static void nextNumbers() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input Yout number: ");
            int _int = sc.nextInt();
            int reverse, tmp = _int;
            System.out.print("Your Encryptin Code: ");
            while(tmp != 0) {
                reverse = tmp%10; // 321%10 = 1
                tmp = tmp/10; // 321/10 = 32
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

```
## __WORK FOUR
```JAVA
import java.util.Scanner;

public class _work4 {
    private static void nextStar() {
        int _count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int _star = sc.nextInt();
            for (int i = 1; i <= _star/2; i++) { // 7/2 = 3.5
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    ++_count;
                }
                System.out.println();
            }
            for (int i = 1; i <= _star/2+1; i++) {
                for (int j = _star/2+1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = _star/2+1; j >= i; j--) {
                    System.out.print("*");
                    ++_count;
                }
                System.out.println();
            }
            System.out.println("Count of star is " + _count);
        }
    }
    public static void main(String[] args) {
        nextStar();
    }
}

```
