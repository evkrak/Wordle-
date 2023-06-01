package FST;

import FST.AnswerWord;

public class GuessWord extends Word {

    public GuessWord() throws Exception {
        super();
    }
    public boolean contains(char value, char[] array){
        for (char element:array){
            if(element==value){
                return true;

            }

        }
        return false;
    }
    public void compareGuess(AnswerWord aw, BufferWord bw) {
        for (int i = 0; i < 5; i++) {
            if(contains(this.letters[i], aw.letters)){
                if(aw.letters[i]==this.letters[i]){
                    bw.certainLetters[i]= this.letters[i];
                } else{
                    if(!contains(this.letters[i], bw.certainLetters)){
                        // if in certain letters {}
                        bw.uncertainLetters.add(String.valueOf(this.letters[i]));
                    }
                }
            }
        }
    }
}
