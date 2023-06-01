import java.util.Scanner;

public class ArrayICT {
    public static void main(String[] args) {
        int num = 0;

        char[] ek = {'E', 'v', 'a', 'n', 'K', 'r', 'a', 'k', 'o', 'w', 'e', 'r'};
        System.out.println(" My name spelt back wards is:");
        for (int i = 11; i > -1; i--) {
            System.out.println(ek[i]);

        }
        Scanner sc = new Scanner(System.in);

            System.out.println("Please Input a number between 0 and 11 and to end code input a number that does not meet the requirments");
            num = sc.nextInt();

                System.out.println(" in postion " + num + " is the letter: " + ek[num]);
         System.out.println("code is finished ");


        }
    }

