public class RandomNumber {
    public static void main(String[] args) {
        double randNum = Math.random();

        int randInt= (int)(randNum*3+4);// Multiply randnumber and turn it into whole number generator rather then decimal
        // it can only be done if it is converted into a int
        System.out.println(randInt);

    }
}
