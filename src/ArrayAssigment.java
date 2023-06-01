// Name: Evan Krakower
// Teacher: Mr.Rottmann
// Due Date: December 23th
import java.util.*;
public class ArrayAssigment {
    public static void main(String[] args) {
        int ArrayLength;
        int high = 0;
        int low = 0;
        int sum = 0;
        double average = 0;
        int halfEven = 0;
        int EvenOne = 0;
        int EvenTwo = 0;
        double median1 = 0;
        int numcount= 0;
        int maxNumCount=0;
        List <Integer> theMode = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input what the size of the array you would like? (must be whole and Postive numbers)");
        ArrayLength = sc.nextInt();
        System.out.println(" ");
        int[] RandomNumber = new int[ArrayLength];
        System.out.println("your Array will have " + RandomNumber.length + " Places");
        System.out.println("what is the highest number you would like on the array ");
        high = sc.nextInt();
        System.out.println("what is the lowest number you would like on the array");
        low = sc.nextInt();
        for (int i = 0; i < ArrayLength; i++) {
            RandomNumber[i] = (int) (Math.random() * (high - low + 1) + low);
            System.out.println("Value " + i + " In The array is: " + RandomNumber[i]);
            sum = sum + RandomNumber[i];// uses big O (n) beacuase it only vists the number in the array one time
        }
        System.out.println("the Sum of all values in the array is: " + sum);
        average = sum / (double) ArrayLength;
        System.out.println("the average value of the array is: " + average);

        Arrays.sort(RandomNumber);


        if (ArrayLength % 2 == 0) { // uses big O (n) beacuase it only vists the number in the array one time
            halfEven = ArrayLength / 2;
            EvenOne = RandomNumber[halfEven];
            EvenTwo = RandomNumber[halfEven + 1];

            median1 = (EvenTwo + EvenOne) / 2.0;
            System.out.println("The Two Median Values are: " + EvenOne + "," + EvenTwo + " Meaning the median value is: " + median1);
        }else{
            System.out.println("The mode is: " + RandomNumber[ArrayLength/2]);
        }


        for (int i = 0; i < ArrayLength; i++) {    // Uses Big O n Squared I believe constantly revisited in the double for loop to check in they are the same
            numcount=0;
            for (int j = 0; j < ArrayLength; ++j) {
                if (RandomNumber[j] == RandomNumber[i])
                    ++numcount;
            }
            if (numcount > maxNumCount) {
                maxNumCount = numcount;
                theMode.clear();
                theMode.add(RandomNumber[i]);
            } else if (numcount == maxNumCount) {
                theMode.add(RandomNumber[i]);
            }
        }
        System.out.println("The Diffrent Mode's are"+theMode);
        }
    }
