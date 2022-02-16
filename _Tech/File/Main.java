import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("txt/Univercity.txt");
        File out = new File("txt/out.txt");
        FileReader Fs2 = null;
        BufferedReader br2 = null;
        FileWriter Fs3 = null;
        BufferedWriter bw3 = null;

        try {
            // // Reader
            // FileReader Fs = new FileReader(f); // Road
            // BufferedReader br = new BufferedReader(Fs); // Reader  
            // String line;
            //     while ((line = br.readLine()) != null) {
            //         System.out.println(line.trim());
            //     }
            // br.close();
            // Fs.close();
            // // Writer
            // // FileWriter Fw = new FileWriter(f); // Road
            // // BufferedWriter bw = new BufferedWriter(Fw); // Writer
            // // bw.write("Kasetsart University \n (Computer Science) \n Student -> TabNine:: \n");
            // // bw.close();
            // // Fw.close();
            // // Writer Next Line
            // FileWriter Fw2 = new FileWriter(f, true); // Road
            // BufferedWriter bw2 = new BufferedWriter(Fw2); // Writer
            // bw2.write("1");
            // bw2.newLine();
            
            // bw2.close();
            // Fw2.close();
            
            // Reader Next Line
            Fs2 = new FileReader(f); // Road
            br2 = new BufferedReader(Fs2); // Reader

            Fs3 = new FileWriter(out); // Road
            bw3 = new BufferedWriter(Fs3); // Writer

            String s;
            int i = 0 ;
            while((s = br2.readLine()) != null) {
                bw3.write("Line " + i + " : " + s);
                System.out.println("Line " + i + " : " + s);
                i++;
                bw3.newLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }finally{
            try {
                br2.close();
                Fs2.close();
                bw3.close();
                Fs3.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        
    }
}
