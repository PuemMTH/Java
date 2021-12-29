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