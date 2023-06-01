package FST;

import java.util.ArrayList;

public class BufferWord {


    ArrayList<String> uncertainLetters= new ArrayList<>();
    char[] certainLetters= new char[5];

    public BufferWord() throws Exception {
        super();

        for (int i = 0; i < 5; i++) {
            this.certainLetters[i]='_';


        }

    }

    public static boolean contains(char value, char[] array){
        for (char element:array){
            if(element==value){
                return true;

            }

        }
        return false;
    }

        public boolean isNotComplete(){

        for(int i=0; i < 5; i++){
            if(certainLetters[i]=='_'){
                return true;
            }
        }
        return false;
        }


        public void cleanUp(){
            for(int i=0; i < this.uncertainLetters.size(); i++){
                if(contains(this.uncertainLetters.get(i).charAt(0), this.certainLetters)) {
                    this.uncertainLetters.remove(i);
                }
            }
        }
}
