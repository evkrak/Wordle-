import java.io.*;
import java.util.ArrayList;

public class UsingFiles {
    //File type extensions
//.txt, .doc, .xls
        public static void main(String[] args)throws Exception {
            String fileName= "Hmmm.txt";
            FileWriter fw= new FileWriter(fileName);
            BufferedWriter bw= new BufferedWriter(fw);
            //The program is now connected to the file named: "file.txt"
            bw.write("This is our first line\n");// \n new line
            bw.write("Hello line 2\n");// \t will tab over
            bw.write("65");
            bw.close();
            System.out.println("now time to read this file");
            FileReader fr= new FileReader(fileName);
            BufferedReader br= new BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            br.close();
            br= new BufferedReader(new FileReader(fileName));
            String line;
            ArrayList<String> aList= new ArrayList<>();
            FileWriter fw2 = new FileWriter("NBAstats.txt");
            BufferedWriter bw2= new BufferedWriter(fw2);
            do {
                line = br.readLine();
                if(line!=null){
                    bw2.write(line+ "#");
                    System.out.println(line);
                    aList.add(line);
                }
            } while(line!=null);
            System.out.println(aList);
        }
    }

