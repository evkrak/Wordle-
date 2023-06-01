package FST;

import java.util.Scanner;

public class InputHandler {
    public static GuessWord getInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        GuessWord gw = new GuessWord();
        gw.setWord(input);
        return gw;
    }
}
