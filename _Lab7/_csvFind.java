import java.io.*;
import java.util.Scanner;

public class _csvFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String _csvFile[] = new String[2];
        System.out.print("Plase input csv file name: ");
        _csvFile[0] = sc.nextLine();
        System.out.print("Plase input string: ");
        _csvFile[1] = sc.nextLine();
        File file = null;
        FileReader reader = null;
        BufferedReader br = null;
        try{
            File _csvFind = new File(_csvFile[0]);
            reader = new FileReader("csv/"+_csvFind+".csv");
            br = new BufferedReader(reader);
            System.out.println();
            String line;
            while((line = br.readLine()) != null){
                if(line.contains(_csvFile[1])){
                    System.out.println(line);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                br.close();
                reader.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
