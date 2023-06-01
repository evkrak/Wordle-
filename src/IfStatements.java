import javax.swing.*;
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the value of a");
        a = sc.nextDouble();
        System.out.println("what is the value of b");
        b = sc.nextDouble();


        if (a > b) ;
        { System.out.println("a is greater");}
        if (a < b);
        {System.out.println(" b is greater");}


    }
}