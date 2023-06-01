import java.util.Scanner;
public class LowLetters {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter a String of lowercase letters");
            String userWord= sc.nextLine();
            char highest= userWord.charAt(0);//Start with the first letter.
            char lowest= userWord.charAt(0);

            for(int i=0; i< userWord.length();i++){
                //userWord.charAt(i): is the next letter in the String
                if(userWord.charAt(i) > highest){
                    highest= userWord.charAt(i);//replace "highest" with a new, higher letter
                    //trace: lets us peek into the process, see what is highest so far.
                    System.out.println("Highest so far: "+highest);
                }//end of if

                //check for lowest
                if(userWord.charAt(i) < lowest ){
                    lowest= userWord.charAt(i);
                    //trace: lets us peek into the process, see what is lowest so far.
                    System.out.println("lowest so far: "+lowest);
                }

            }//end of for
            System.out.println("The Biggest Gap is" +(highest-lowest));
            System.out.println("The highest letter is: "+highest);
            System.out.println("The lowest letter is: "+lowest);
        }//end of main
    }//end of class


