import java.util.Scanner;
public class TaskChallange {
   // Program: TaxChallnge
 //   Author: Evan
  //  Purpose: To compute the tax owed by an individual
 //   Date began:

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter your salary");
            double sal= sc.nextDouble();
            double cat1= 41544;//the max amount that could be taxed 15%
            double cat2= 41544;//the max amount that could be taxed 22%
            double cat3= 45712;//the max amount that could be taxed 26%
            if(sal<=cat1){
                System.out.println(sal*0.15);//tax for somebody earning 41,544 or less (cat1)
            }else if(sal<=cat1+cat2){
                System.out.println(cat1*0.15+(sal-cat1)*0.22);//tax for somebody earning in cat2
            }else if(sal<=cat1+cat2+cat3){
                System.out.println(cat1*0.15+cat2*0.22+(sal-83088)*0.26);//tax for somebody earning in cat3
            }else{
                System.out.println(cat1*0.15+cat2*0.22+cat3*0.26+(sal-128800)*0.29);//tax for somebody earning in cat4
            }

        }//end of main
}
