import java.io.*;

public class FileICT {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("StringsAndNumbers.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("JustStrings.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int num;
        String Phrase;
        int sum = 0;

        do {

            try {
                Phrase = br.readLine();
                num = Integer.parseInt(br.readLine());
            } catch (NumberFormatException name) {
                break;
            }
            if (num != 0 && Phrase != null) {
                bw.write(Phrase + "\n");
                sum = num + sum;


            }

        }while(num!=0 && Phrase != null);
        br.close();
        bw.close();
        System.out.println("the Sum is:"+sum);
    }
}