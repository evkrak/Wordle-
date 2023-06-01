import java.util.*;
public class ArrayLoading {
    public static void main(String[] args) {
        double userNum= 0;
        double [] numList=new double[20];
        double largest=0, smallest=0,sum=0, average=0;
        int counter=0;
        for(int i=0; i<numList.length; i++) {// length of array is 20
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input "+( 20-counter)+" more numbers, if you would like to stop input 0");
            userNum = sc.nextDouble();
            if(userNum==0){
                System.out.println("The Code Has Been Ended");
                break;

            }else{
                numList[i]=userNum;
                System.out.println("Numeber "+(i+1)+": "+numList[i] );
                counter++;
            }
            // following two lines for the First time though loop we are going to set the frist value to the largest and smallest varible
            if(i==0) {
                smallest = numList[i];
                largest = numList[i];
            }else{
                if(numList[i]<smallest){
                    smallest= numList[i];

                }
                if(numList[i]>largest){
                   largest= numList[i];
                }//end of setting biggest and smallest

                sum= sum+numList[i];



            }


        }

        System.out.println("smallest number: "+ smallest);
        System.out.println("largest number: "+ largest);
        System.out.println("Sum of all Number: "+sum);
        System.out.println("amount of numbers given: " +counter);
        average= sum/counter;
        System.out.println("Average value of all number: "+ average);

    }

}
