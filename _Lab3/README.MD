<img src="https://raw.githubusercontent.com/PuemMTH/Java/master/image/JAVA.png" />

## _work1
```JAVA
import java.util.Scanner;

public class _work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A[] = new String[2];
        for (int i = 0 ; i < 2 ; i++) {
            System.out.print("Input String " + i + " : ");
            A[i] = sc.nextLine();
            // A[i] = sc.nextLine().toLowerCase();
        }
        // System.out.println(A[0].equalsIgnoreCase(A[1]));
        System.out.println("The two strings are " + (A[0].equalsIgnoreCase(A[1]) ? "equal." : "not equal."));
    }
}
```
## _work2
```JAVA
import java.util.Scanner;

public class _work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input yout E-mail : ");
        String email = sc.nextLine();
        
        int start = 0;
        for (int i = email.length() - 1; i >= 0; i --){
            if(email.charAt(i) == '@'){
                start = i;
                break;
            }
        }
        System.out.println("Your domain name is \"" + email.substring(start + 1) + "\"");
    }
}

```
## _work3
```JAVA
import java.util.Scanner;
public class _work3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First Number : ");
        String Number1 = sc.nextLine();
        System.out.print("Input Second Number : ");
        String Number2 = sc.nextLine();

        int max = (Number1.length() > Number2.length())? Number1.length() : Number2.length();
        int NumIndex1 = Number1.length()-1, NumIndex2 = Number2.length()-1, tod = 0;
        String ans = "";
        for(int i = 0; i < max ; i++){
            int first = Integer.parseInt(Number1.charAt(NumIndex1)+"");
            int second = Integer.parseInt(Number2.charAt(NumIndex2)+"");
            int tmp_sum = first + second + tod;
            if(tmp_sum > 9){
                tod = 1;
                tmp_sum = tmp_sum % 10;
            }else{
                tod = 0;
            }
            ans = tmp_sum + ans;
            NumIndex1--;
            NumIndex2--;
            if(NumIndex1 < 0){
                Number1 = "0";
                NumIndex1 = 0;
            }else if(NumIndex2<0){
                Number2 = "0";
                NumIndex2 = 0;
            }
        }
        if(tod == 1){
            ans = 1 + ans;
        }
        System.out.println("Summation = " + ans);
    }
}
```
## _work4
```JAVA
import java.util.Scanner;

public class _work4 {
    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Input A : ");
                String A = input.nextLine();
                int num1 = Integer.parseInt(A);
                System.out.print("Input B : ");
                String B = input.nextLine();
                int num2 = Integer.parseInt(B);
                System.out.println("A/B = "+ num1/num2);
                break;
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
```
## _work5
```JAVA
import java.util.ArrayList;
import java.util.Scanner;

public class _work5 {
    public static void ShowArr(ArrayList<Integer> arr) {
        System.out.print("My ArrayList = ");
        for(int i = 0 ;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void ln(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("=====MENT=====");
        System.out.println("1) Add to back");
        System.out.println("2) Add at index");
        System.out.println("3) Edit");
        System.out.println("4) Remove by index");
        System.out.println("5) Remove by value");
        System.out.println("6) Exit");

        while(true){
            try {
                Scanner sc = new Scanner(System.in);
                ln(1);
                System.out.print("Select ---> ");
                int menuSwitch = sc.nextInt();
                switch(menuSwitch){
                    case 1:
                        // add to back
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        arr.add(value);
                        ShowArr(arr);
                        break;
                    case 2:
                        // add to index
                        System.out.print("Enter value: ");
                        int value2 = sc.nextInt();
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();
                        arr.add(index,value2);
                        ShowArr(arr);
                        break;
                    case 3:
                        // edit by index
                        System.out.print("Enter index: ");
                        int index2 = sc.nextInt();
                        System.out.print("Enter new value: ");
                        int value3 = sc.nextInt();
                        arr.set(index2,value3);
                        ShowArr(arr);
                        break;
                    case 4:
                        // Remove by index
                        System.out.print("Enter index: ");
                        int index3 = sc.nextInt();
                        arr.remove(index3);
                        ShowArr(arr);
                        break;
                    case 5:
                        // Remove by value
                        System.out.print("Enter value: ");
                        int value4 = sc.nextInt();
                        arr.remove(value4);
                        ShowArr(arr);
                        break;
                    case 6:
                        // Exit
                        System.exit(0);
                    default:
                        // default case err
                        System.out.println("Invalid input");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
```
