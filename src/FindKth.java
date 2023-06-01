import java.util.Scanner;

public class FindKth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a String");
        String userWord= sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("Which Lowest letter would you like to see. 1st 2nd and 3rd");
        int k= sc.nextInt();

        char lowest=1000;
        for(int j=0; j<k ; j++) {
            lowest= userWord.charAt(0);
            for (int i = 0; i < userWord.length(); i++) {
                //check for lowest
                if (userWord.charAt(i) < lowest) {
                    lowest = userWord.charAt(i);

                    System.out.println("lowest so far: " + lowest);
                }else if (userWord. charAt(i)==lowest);
                }
            }
            userWord = userWord.replace(lowest, 'z');
            System.out.println(userWord);

        }

            }





