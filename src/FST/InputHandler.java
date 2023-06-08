package FST;

import java.util.Scanner;

public class InputHandler {
    public static GuessWord getInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter your guess:");
        input = sc.nextLine().toUpperCase();
        while (!isValidWord(input)) {
            System.out.println("Please enter a five-letter alphabetical word:");
            input = sc.nextLine().toUpperCase();
        }
        GuessWord gw = new GuessWord();
        gw.setWord(input);
        return gw;
    }
    public static boolean isValidWord(String word) {
        return word.matches("[a-zA-Z]+") && word.length()==5; //the next stage is to incorparate this to see if the user enters a valid word (5 lettesr)
    }
}
