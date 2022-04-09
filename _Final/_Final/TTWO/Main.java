import java.io.*;
public class Main{
    public static void main(String[] args){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            String File  = "CarMPG.csv";
            fr = new FileReader(File);
            br = new BufferedReader(fr);
        
            String File2 = "Output.csv";
            fw = new FileWriter(File2);
            bw = new BufferedWriter(fw);
            
            String line = "";
            while((line =  br.readLine()) != null){
                String[] arr_s = line.split(",");
                bw.write(arr_s[0] + "," + arr_s[8]);
                bw.newLine();
                line = br.readLine();
            }
        } catch (Exception e) {
                System.out.println(e);
        } finally {
            try {
                br.close(); fr.close();
                bw.close(); fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}