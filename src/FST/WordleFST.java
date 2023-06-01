package FST;

import java.util.ArrayList;

public class WordleFST {
    public static void main(String[] args)throws Exception {

//        String userName, userGuess;
//        int guessNumber=1;


        ArrayList<GuessWord> roundGuesses= new ArrayList<GuessWord>();



        // Get user's name
        // display Instruction on game play
        // tell how to exit game
        AnswerWord aw = new AnswerWord();
        // TODO: random choice from file of words
        aw.setWord("WORDS");


        for(int i = 0; i < 6; i++) {
            BufferWord bw= new BufferWord();
            GuessWord gw = InputHandler.getInput();
            gw.compareGuess(aw,bw);
            bw.cleanUp();
            OutputHandler.output(bw);
        }
        // TODO: check if player has one or lost and give appropriate message

    }
}