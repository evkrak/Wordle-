//Name: Evan Krakower
// Teacher: Mr.Rottmann
// Task; Create 3 different methods that output Strings and ints

public class MethodsICT {
    public static void main(String[] args) {

        String word3="";
        String word1= "Evan";
        String word2= "Krakower";
        String x= yourName1(word1,word2,word3);
        System.out.println(x);

        int sum=0;
        int num1= 10;
        int num2= 20;
        int y= youName2(num1,num2,sum);
        System.out.println(y);

        String name="Krak";
        int nameValue=0;
        int totalValue=0;
        int z= youName3(name,nameValue,totalValue);
        System.out.println(z);
    }


    public static String yourName1(String word1, String word2, String word3) {
        word3= (word1+" ** "+word2);
        return word3;
    }

    public static int youName2(int num1, int num2, int sum) {
        num1=10;
        num2=20;
        sum= num1+num2;
        return sum;
    }

    public static int youName3(String name, int totalValue, int nameValue) {
        nameValue= name.length();
        totalValue= nameValue*3;
        return totalValue;
    }

}