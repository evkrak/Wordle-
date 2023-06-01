public class UsingMethods {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld(4);
        //double mealTotal= calcTax(15,1.13);
    }//End of Main method
    public static void sayHelloWorld(){
        System.out.println("Hello World");
    }//End of hello World


    public static void sayHelloWorld(int numTimes){
        for (int i=0; i< numTimes; i++){
            System.out.println("Hello World 4 times");
        }
    }// End Of sayHelloWorld(int)


   // public static void calcTax(double itemPrice, double taxRate){
       // return itemPrice * taxRate;
    }
//}//End Of class
