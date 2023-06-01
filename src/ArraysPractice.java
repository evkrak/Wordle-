import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] TwentyNumbers= new int[20];
        for(int i=0; i>20; i++){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter 20 number that are not zero ");
            int userNum= sc.nextInt();
        if(userNum==0) {
            break;
            }
         else{
                TwentyNumbers[i]= userNum;

            }
        }
    }

}
