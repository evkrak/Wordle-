import java.util.Scanner;
public class ErrorHandiling {
    public static void main(String[] args) {
        int userNum=0;
        int y=0;
        int x=1;
        while (x==1) {
            try {
                System.out.println("Please enter an integer that isn't 3");
                Scanner sc = new Scanner(System.in);
                userNum = sc.nextInt();//will crash if a non-int provided
                y = 10 / (3 - userNum);//this line could crash
                x=0;
                System.out.println("This is y:" + y);
                //the two lines above won't crash since they are in a "try" block
            } catch (Exception e) {
                x=1;
                System.out.println("That was poor data");
            }//end of catch
        }//end of while
        System.out.println("Ah, we got out of the while loop!");
    }//end of main
}
