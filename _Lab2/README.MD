<p align="center"><img src="https://www.img.in.th/images/80e8cffa4d7061b6bbfec486121d92b0.png" alt="80e8cffa4d7061b6bbfec486121d92b0.png" border="0" /></p>

```JAVA
public class _work1{
    public static void main(String[] args) {
        int arrgs[] = new int[100];
        int x = 100;
        for (int i = 0; i < arrgs.length; i++) {
            arrgs[i] = x;
            x += 10;
        }
    }
}
```

```JAVA
import java.util.Scanner;

public class _work2 {
    public static void main(String[] args) {
        String a[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter input nisit["+i+"] : ");
            a[i] = sc.nextLine();
        }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        System.out.println(" ");
        for(String tmp : a){
            System.out.println(tmp);
        }
    }
}

```

```JAVA
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
```

```JAVA
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

```

```JAVA
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
```
 
```JAVA
import java.util.ArrayList;
import java.util.Scanner;

public class _work6 {
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
    }
}
```