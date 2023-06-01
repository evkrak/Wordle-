public class DataConversions {
    public static void main(String[] args) {
        byte byteOne=12;
        int intOne= 620;
       // intOne= byteOne;
      double doubleOne;
        byteOne= (byte) intOne;
        System.out.println(byteOne);
        String x= "6.7";
         doubleOne = Double.parseDouble(x);
        System.out.println( doubleOne + 3);
        
    }




}



