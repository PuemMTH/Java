package File;

import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
    FileReader fr = null;
    BufferedReader br = null;
    FileWriter fw = null;
    BufferedWriter bw = null;
    Scanner sc = null;
    public ReadAndWrite(){
        try {
            String File  = "src/File/csv/DATA.csv";
            fr = new FileReader(File);
            br = new BufferedReader(fr);

            String File2 = "src/File/csv/DATA2.txt";
            fw = new FileWriter(File2);
            bw = new BufferedWriter(fw);
            
            String line = br.readLine();
            while(line != null){
                String[] arr_s = line.split(",");
                for(int i = 0; i < arr_s.length ; i++){
                    // System.out.print(arr_s[i] + " ");
                    bw.write(arr_s[i] + "\t");
                }
                bw.newLine();
                // System.out.println(arr_s);
                // System.out.println();
                line = br.readLine();
            }
            System.out.println("Done!");
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

