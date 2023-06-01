import java.sql.SQLOutput;
import java.util.Scanner;
public class UsingScanner {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        name= sc.nextLine();
        System.out.println("its nice to meet you "+ name);
        System.out.println(" How Old Are You");
        age= sc.nextInt();
        System.out.println(" Ah, "+ name +" right now you are " + age + " In ten years you will be "+(age+10)+" Years Old!");
    }
}
