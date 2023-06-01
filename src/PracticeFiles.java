import java.io.*;
public class PracticeFiles {
    public static void main(String[] args)throws Exception {
        FileReader fr= new FileReader("rawdata.txt");
        BufferedReader br= new BufferedReader(fr);
        String line="";
        int hours=0;
        int rate =0;

        do{
                line = br.readLine();
            if(line!=null) {
                hours = Integer.parseInt(br.readLine());
                rate = Integer.parseInt(br.readLine());
                System.out.println(line);
                System.out.println(hours);
                System.out.println(rate);
            }
        }while(line!=null);

        br.close();

        fr= new FileReader("rawdata.txt");
        br= new BufferedReader(fr);
        FileWriter fw= new FileWriter(("calcdata.txt"));
        BufferedWriter bw= new BufferedWriter(fw);


        do {
       line= br.readLine();
       if(line!=null) {
           hours = Integer.parseInt(br.readLine());
           rate = Integer.parseInt(br.readLine());
           bw.write(line + "\n");
           bw.write(hours * rate + "\n");
       }
        }while (line!=null);
        bw.close();
        br.close();
        }
    }

