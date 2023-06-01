import java.util.Scanner;
    public class TestAssigment {
        public static void main(String[] args) {
            String test1;
            String test2;
            String test3;
            String name;
            double testscore1;
            double testscore2;
            double testscore3;
            double total1;
            double total2;
            double total3;
            double avg1;
            double avg3;
            double avg2;
            double avg;


            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Your Name");
            name = sc.nextLine();

            System.out.println("test 1 results ");
            System.out.println(" What test subject was it?");
            test1 = sc.nextLine();
            System.out.println("how many points were avalible on the test");
            total1 = sc.nextDouble();
            System.out.println("how many points did you get on the test?");
            testscore1 = sc.nextDouble();
            avg1 = testscore1 / total1 * 100;
            System.out.println("Your Averge was " + avg1);
             Scanner sc1 = new Scanner(System.in);

            System.out.println("test 2 results ");
            System.out.println(" What test subject was it?");
            test2 = sc1.nextLine();
            System.out.println("how many points were avalible on the test");
            total2 = sc1.nextDouble();
            System.out.println("how many points did you get on the test?");
            testscore2 = sc1.nextDouble();
            avg2 = testscore2 / total2 * 100;
            System.out.println("Your Averge was " + avg2);

            Scanner sc2 = new Scanner(System.in);
            System.out.println("test 3 results ");
            System.out.println(" What test subject was it?");
            test3 = sc2.nextLine();
            System.out.println("how many points were avalible on the test");
            total3 = sc2.nextDouble();
            System.out.println("how many points did you get on the test?");
            testscore3 = sc2.nextDouble();
            avg3 = testscore3 / total3 * 100;
            System.out.println("Your Averge was " + avg3);

            System.out.println(name+ " Grade Book");
            System.out.println("Subject          Mark              Out of             Average             ");
            System.out.println(" " + test1 + "\t\t\t\t  " + testscore1 + " \t\t\t\t " + total1 + "\t\t\t\t" + avg1+"%");
            System.out.println(" " + test2 + "\t\t\t\t  " + testscore2 + " \t\t\t\t " + total2 + "\t\t\t\t" + avg2+"%");
            System.out.println(" " + test3 + "\t\t\t\t  " + testscore3 + " \t\t\t\t " + total3 + "\t\t\t\t" + avg3+"%");
           avg = (avg1 + avg2 + avg3) /3 ;
            System.out.println("Your Average was " + avg + ("%"));
        }

    }
