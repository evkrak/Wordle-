
import java.util.Scanner;
    public class MethodsPractice
    {
        public static void main (String [] args)
        {
            //you fill in the remainder of this method.
        } //end of main method


        public static int truncate (double dblNum1)
        {
            int retNum1= (int) dblNum1; /* casting a 'double' to 'int' will remove the numbers after the decimal */
            return retNum1;
        }// end of 'truncate' method


        public static double add3Num (double dblNum1, double dblNum2, int intNum1)
        {
            double retNum2= dblNum1 + dblNum2 + intNum1;
            return retNum2;
        }// end of 'add3Num' method


        public static double getNumFromUser ()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter a number"); //requesting number
            double userNum= sc.nextDouble();
            return userNum;/*hand the value back to the line from which the method was called.*/
        }//end of 'getNumFromUser' method

    } //end of 'MethodTest' class

