package FST;
import java.io.*;
import java.util.Random;

public class ReadFile {
    public static String readFile() throws Exception {
        // Reads our words.txt file and returns random word from it
        FileReader fr = new FileReader("src/FST/words.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        Random rand = new Random();
        int lineNumber = rand.nextInt(90);
        // IF MORE WORDS ARE ADDED Change NUMBER
        int counter = 0;
        do {
            line = br.readLine();
            counter++;
        } while (line != null && lineNumber != counter);
        return line;
    }
}

