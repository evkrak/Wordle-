//name: Evan Krakower
//Date: October 24
import java.sql.SQLOutput;
import java.util.Scanner;
public class ChaimTest {
    public static void main(String[] args) {
        int people=0;
        int bear=0;
        int granola=0;
        int apple=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" How many of your peers are coming");
        people = sc.nextInt();

        if (people <= 12) {
            granola = 1;
        } else if (people <= 24 ) {
            granola = 2;
        } else if (people <=34) {
           granola=2;
            bear = people-24;
        } else {
           granola=2;
           bear=10;
           apple = people - 34;
        }

        System.out.println("he will have "+ granola+" Granola bars and " +bear +" bear paws and "+ apple+"   apples");


    }

        }


