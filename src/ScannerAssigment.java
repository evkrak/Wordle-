import java.util.Scanner;

public class ScannerAssigment {
    public static void main(String[] args) {

        String name;
        int currentyear;
        int yearofbirth;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        name= sc.nextLine();
        System.out.println("its nice to meet you "+ name);

        System.out.println("What Year were you born?");
        yearofbirth= sc.nextInt();

        System.out.println(" What year is it");
        currentyear= sc.nextInt();
        System.out.println(" Ah, "+ name +" right now you are " + (currentyear - yearofbirth) +  " evaYears Old!");
    }
}
