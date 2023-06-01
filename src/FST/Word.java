package FST;

public class Word extends Object {

    protected char[] letters = new char[5];

    public Word() throws Exception {
    }

    public String getWord() {
        //Returns the word for the round
        return null;
    }

    public void setWord(String word) {
        // Pre-condition word already has exaclty 5 letters
        for (int i = 0; i < 5; i++) {
            this.letters[i]=word.charAt(i);

        }

    }
}
