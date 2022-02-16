import java.io.*;
import java.util.Scanner;

public class _csvSpit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String _csvSpit[] = new String[2];
        System.out.print("Input Java file: ");
        _csvSpit[0] = sc.nextLine();
        System.out.print("Output Text File: ");
        _csvSpit[1] = sc.nextLine();

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fr = new FileReader("csv/"+_csvSpit[0]+".java");
            br = new BufferedReader(fr);
            fw = new FileWriter("csv/"+_csvSpit[1]+".txt");
            bw = new BufferedWriter(fw);
            String line;
            while((line = br.readLine()) != null){
                
                String[] arr_s = line.split(" ");
                for (String c : arr_s) {
                    int j = 0;
                    if (c.equals("public") || c.equals("private") || c.equals("prtected")) {
                        for (j = 0; j < line.length(); j++) {
                            if (line.charAt(j) == '{') {
                                break;
                            }
                        }
                        bw.write(line.substring(0, j) + "\n");
                        break;
                    }
                }
                }
                System.out.println("Complete!");
        }catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
                fr.close();
                bw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}
