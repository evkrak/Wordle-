import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0;
        ArrayList<Double> scoresList = new ArrayList<>();

        do {
            System.out.println("Please enter your next score (-1 to quit)");
            score = sc.nextDouble();
            if(score!= -1){
                scoresList.add(score);
            }


        } while (score!= -1);

        System.out.println("Size of list: " + scoresList.size());
        System.out.println(scoresList);

        double sum=0;
                for(int i=0; i < scoresList.size(); i++){
                  sum= sum+ scoresList.get(i);

        }
        System.out.println("The sum of the numbers:"+ sum);
        scoresList.remove(71.0);
        System.out.println(scoresList);

    }
}