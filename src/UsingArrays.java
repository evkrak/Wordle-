import java.util.Scanner;

public class UsingArrays {
    public static void main(String[] args) {
        String[] ourWords = new String[5];
        System.out.println(ourWords);
        System.out.println(ourWords[3]);
        ourWords[0] = "not Null";
        ourWords[1] = "this the next";
        ourWords[2] = "ah the middle word";
        ourWords[4] = "the final word";
        System.out.println(" word in postion two"+ ourWords[2]);
        System.out.println(" word in postion three"+ ourWords[3]);

        for(int i=0; i< ourWords.length; i++){
            System.out.println(ourWords[i]);
        }

        int [] numbers= {3,56,98,27};
        System.out.println(numbers.length);

        System.out.println("how long should our list be");
        Scanner sc= new Scanner(System.in);
        int howLong= sc.nextInt();
        double [] listOfNums= new double[howLong];
        for(int i=0; i<listOfNums.length; i++){
            listOfNums[i]= Math.random();
            System.out.println("number#"+(i+1)+":"+ listOfNums[i]); //Not Working for some reason
        }

    }}