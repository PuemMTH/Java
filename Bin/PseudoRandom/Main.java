import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Pseudo-Random Number");
        int m,a,c,x=0,n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Modulus number   (m) : ");
        m = sc.nextInt(); 
        System.out.print("Multiple number  (a) : ");
        a = sc.nextInt(); 
        System.out.print("Increment number (c) : ");
        c = sc.nextInt();
        System.out.print("Seed number      (x) : ");
        x = sc.nextInt(); 
        System.out.print("Number of numbers to generate : ");
        n = sc.nextInt(); 

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
        if(n<0){
            System.out.println("n must be greater than 0");
            count++;
        }

        if(count > 0){
            return;
        }

        String load = Integer.toString(m);
        String load_catch = "1";
        for(int i = 0; i < load.length()-1; i++){
            load_catch += "0";
        }
        
        m = Integer.parseInt(load_catch);

        int ans;
        for(int i = 0; i < n; i++){
            ans = ((a * x) + c) % m;
            System.out.println("Output Number = " + ans);
            x = ans;
        }

    }
}