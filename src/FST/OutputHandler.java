package FST;

public class OutputHandler {

    public static void output(BufferWord bw){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < 5; i++){
            stringBuilder.append(bw.certainLetters[i]);
            stringBuilder.append(' ');
        }
        stringBuilder.append('(');
        for(int i=0; i < bw.uncertainLetters.size(); i++){
            stringBuilder.append(bw.uncertainLetters.get(i));
            stringBuilder.append(',');
        }
        stringBuilder.append(')');
        System.out.println(stringBuilder);
    }

}
