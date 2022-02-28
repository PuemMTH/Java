import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Pseudo-Random Number");
        int m,a,c,x=0,n;
        int count = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Modulus number   (m) : ");
        m = sc.nextInt(); // m < a c x 
        System.out.print("Multiple number  (a) : ");
        a = sc.nextInt(); // a >= 2 < m
        System.out.print("Increment number (c) : ");
        c = sc.nextInt(); // c >= 0 < m
        System.out.print("Seed number      (x) : ");
        x = sc.nextInt(); // x >= 0 < m

        if(m<a || m<c || m<x){
            if(m<a){
                System.out.println("a must be less than m");
            }
            if(m<c){
                System.out.println("c must be less than m");
            }
            if(m<x){
                System.out.println("x must be less than m");
            }
            count++;
        }
        if(a<2 || a>m){
            if(a<2){
                System.out.println("a must be greater than 2");
            }
            if(a>m){
                System.out.println("a must be less than m");
            }
            count++;
        }
        if(c<0 || c>m){
            if(c<0){
                System.out.println("c must be greater than 0");
            }
            if(c>m){
                System.out.println("c must be less than m");
            }
            count++;
        }
        if(x<0 || x>m){
            if(x<0){
                System.out.println("x must be greater than 0");
            }
            if(x>m){
                System.out.println("x must be less than m");
            }
            count++;
        }
        // Pseudo-Random Number
        // Modulus number   (m) : 123
        // Multiple number  (a) : 12
        // Increment number (c) : 1
        // Seed number      (x) : 4
        // (m): 1000
        // Output Number = 49
        // Output Number = 97
        // Output Number = 58
        // Output Number = 82
        if(count > 0){
            return;
        }

        String load = Integer.toString(m);
        String load_catch = "1";
        for(int i = 0; i < load.length(); i++){
            load_catch += "0";
        }
        System.out.println("(m): " + load_catch);

        int x_catch = x;
        for(int i = 0; i < x_catch; i++){
            n = ((a * x) + c) % m;
            System.out.println("Output Number = " + n);
            x = n;
        }

    }
}