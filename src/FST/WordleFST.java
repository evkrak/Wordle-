// Name: Evan Krakower
// Class: Grade 11 com Sci
// Teacher: Mr. Rottman
// Code Purpose: Create a Wordle like game in java that follows project requirments



package FST;

import java.sql.SQLOutput;
import java.util.*;

public class WordleFST {
    public static void main(String[] args)throws Exception {

//        String userName, userGuess;
//        int guessNumber=1;



        System.out.println("Hi, Welcome To Wordle");
        System.out.println("Here is how to play:");
        System.out.println("1.You have six tries to guess the five-letter Wordle word.");
        System.out.println("2.Type in your guess and submit your word by hitting the “enter” key on the key board.");
        System.out.println("3.Letters in the right spot will in between the Underlines . ex: W _ _ D _  ");
        System.out.println("4.Letters in the word but not in the right spot will appear in brackets. ex: (W,E)...");
        System.out.println("5 If the letter is not in the word an Underline('_') will remain ");
        System.out.println("6.Continue until you solve the Wordle or run out of guesses.");
        System.out.println("WOULD YOU LIKE TO PLAY: Y= Yes, N=N0");

        Scanner sc = new Scanner(System.in);
        String wannaPlay = sc.nextLine();
        if(Objects.equals(wannaPlay, "y") || Objects.equals(wannaPlay, "Y")|| Objects.equals(wannaPlay, "Yes")|| Objects.equals(wannaPlay, "yes")) {
            AnswerWord aw = new AnswerWord();
//            aw.setWord(ReadFile.readFile());
            aw.setWord("LUNGE");
            // Get user's name
            // display Instruction on game play
            // tell how to exit game


            for (int i = 0; i < 6; i++) {
                System.out.println("Guess Number " + (i + 1) + ":");
                BufferWord bw = new BufferWord();
                GuessWord gw = InputHandler.getInput();
                gw.compareGuess(aw, bw);
                bw.cleanUp();
                OutputHandler.output(bw);
                if(Arrays.equals(bw.certainLetters, aw.letters)){
                    System.out.println("Congratulations! You have won!");
                    break;
                }
                if (i == 5) {
                    System.out.println("Game Over!");
                    System.out.println("you lost");
                    System.out.println("The Word Was:");
                    System.out.println(aw.letters);

                }
            }
        }


    }
}