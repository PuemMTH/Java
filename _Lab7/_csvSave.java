import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _csvSave {
    public static void main(String[] args) {
        boolean check = true;
        ArrayList<String> _scanUser = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while(check){
            System.out.print("Plase input string: ");
            String _scan = sc.nextLine();
            if(_scan.equalsIgnoreCase("q")){
                check = false;
                // save to file
                try{
                    FileWriter fw = new FileWriter("csv/Text1.txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    int count = 1;
                    for(int i = 0; i < _scanUser.size(); i++){
                        System.out.println("Name["+count+"] : "+_scanUser.get(i));
                        bw.write("Name["+count+"] : "+_scanUser.get(i));
                        bw.newLine();
                        count++;
                    }
                    bw.close();
                    fw.close();
                }catch(Exception e){
                    System.out.println(e);
                }
                // end save to file
            }else{
                _scanUser.add(_scan);
            }
        }
        
    }
}
