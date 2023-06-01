// Name: Evan Krakower
// Teacher: Mr.Rottmann
// Due Date: November 18th
// Task: Create a code than can find the prime factors of any postive integer
import java.util.Scanner;

public class PrimeFactors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number=0;
        do {
            System.out.println("Please Input a Positive Integer greater than one");
            try {
                sc = new Scanner(System.in);
                number = sc.nextInt();

            } catch (Exception e) {
                System.out.println("That is invalid Data");
            }
        }while(number<2);

        long startTime= System.nanoTime();
        System.out.println(" The Prime Factors of "+ number +" are:");
        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
        }
        if (number < 2) {
            System.out.println(number);

        }
        }
        long endTime= System.nanoTime();
        long totalTime= (endTime-startTime);
        System.out.println("Nano Time to run code: "+totalTime);
    }

}

