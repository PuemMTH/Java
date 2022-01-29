import java.util.ArrayList;
import java.util.Scanner;

public class Store_numbers {
    static void allNumbers(ArrayList<Integer> nums){
        System.out.print("All numbers = ");
        for (Integer inte : nums) {
            System.out.print(inte+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int lineInt;
        while(true){
            try{
                System.out.print("Please input a number : ");
                lineInt = sc.nextInt();
                if(lineInt >= 0 && !list.contains(lineInt)){
                    list.add(lineInt);
                }else{
                    System.out.println("The number already exists.");
                }
                if(lineInt < 0){ 
                    System.out.println("Think you.");
                    break;
                }
            }catch(Exception e){
                System.out.println(e);
            }
            allNumbers(list);
        }
    }
}