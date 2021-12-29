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
