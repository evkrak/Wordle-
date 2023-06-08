package FST;

import FST.AnswerWord;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class GuessWord extends Word {

    public GuessWord() throws Exception {
        super();
    }

    public boolean containsChar(char value, char[] array){
        for (char element:array){
            if(element==value){
                return true;

            }

        }
        return false;
    }

    public boolean containsStr(char value, ArrayList<String> array){
        for (String element:array){
            if (Objects.equals(element, String.valueOf(value))){
                return true;
            }
        }
        return false;
    }

    public void compareGuess(AnswerWord aw, BufferWord bw) {
        for (int i = 0; i < 5; i++) {
            if(containsChar(this.letters[i], aw.letters)){
                if(aw.letters[i]==this.letters[i]){
                    if(containsStr(this.letters[i], bw.uncertainLetters)){
                        bw.uncertainLetters.remove(String.valueOf(this.letters[i]));
                    }
                    bw.certainLetters[i]= this.letters[i];
                } else{
                    if(!containsChar(this.letters[i], bw.certainLetters) && !containsStr(this.letters[i], bw.uncertainLetters)){
                        // if in certain letters {}
                        bw.uncertainLetters.add(String.valueOf(this.letters[i]));
                    }
                }
            }
        }
    }
}
