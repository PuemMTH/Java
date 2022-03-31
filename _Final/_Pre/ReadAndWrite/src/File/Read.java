package File;
import java.io.*;

public class Read {
    //  = null;
    //  = null;
    // FileWriter fw = null;
    // BufferedWriter bw = null;
    public Read(){
        try {
            String File  = "src/File/csv/DATA.csv";
            FileReader fr = new FileReader(File);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            // System.out.println(line);
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

            br.close(); fr.close();
         
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}