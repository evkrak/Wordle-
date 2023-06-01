import java.util.Scanner;
public class LoopingPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Word;
        System.out.println("Please Enter A Word With Only Lower Case Letters");
        Word= sc.nextLine();
        char highest= 'a';
        char lowest= 'z';

        for(int i=0; i<Word.length(); i++) {
            if(highest<Word.charAt(i)){
                highest = Word.charAt(i);
            }
            if (lowest > Word.charAt(i)) {
                lowest = Word.charAt(i);
            }
        }

        System.out.println("Highest letter is: " + highest);
        System.out.println("Lowest letter is: " + lowest);
    }
}
