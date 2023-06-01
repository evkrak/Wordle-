import java.util.Random;
import java.util.Scanner;

public class KartPlayer {
    public static void main(String[] args) {
        MarioKartPlayer players[] = new MarioKartPlayer[5];

        // make variables to store the scores
        int player1Score = 0;
        int player2Score = 0;

        // set the players with their values from the table, for example:
        players[0] = new MarioKartPlayer("Mario",1,200,150,2.5,"It's a-me, Mario!");
        players[1] = new MarioKartPlayer("Luigi", 2, 150, 170, 3.0, "Yahoo! Luigi time!");
        players[2] = new MarioKartPlayer("Peach", 3, 100, 180, 2.3, "Here I come!");
        players[3] = new MarioKartPlayer("Bowser", 4, 400, 100, 2.9, "Raaah!");
        players[4] = new MarioKartPlayer("Toadstool", 5, 80, 140, 1.7, "I'm the best!");

        Scanner input = new Scanner(System.in);

        // make an outer game while loop
        String playAgain;
        do {
            // get user characters (make sure appropriate input)
            System.out.println("Player 1 choose your player:");
            System.out.println("(M)ario, (L)uigi, (P)each, (B)owser, or (T)oadstool");
            char player1Choice = input.next().toLowerCase().charAt(0);

            System.out.println("Player 2 choose your player:");
            System.out.println("(M)ario, (L)uigi, (P)each, (B)owser, or (T)oadstool");
            char player2Choice = input.next().toLowerCase().charAt(0);

            while (player1Choice == player2Choice) {
                System.out.println("Both players cannot choose the same character. Player 2, please choose again:");
                System.out.println("(M)ario, (L)uigi, (P)each, (B)owser, or (T)oadstool");
                player2Choice = input.next().toLowerCase().charAt(0);
            }

            MarioKartPlayer player1 = null;
            MarioKartPlayer player2 = null;

            for (MarioKartPlayer player : players) {
                if (player.getName().toLowerCase().charAt(0) == player1Choice) {
                    player1 = player;
                }
                if (player.getName().toLowerCase().charAt(0) == player2Choice) {
                    player2 = player;
                }
            }

            // use the compareTo() method to determine the output
            int result = player1.compareTo(player2);

            if (result > 0) {
                player1Score++;
                System.out.println("The winner is ...");
                System.out.println("Player 1: " + player1.getName());
                System.out.println(player1.getCheer());
            } else {
                player2Score++;
                System.out.println("The winner is ...");
                System.out.println("Player 2: " + player2.getName());
                System.out.println(player2.getCheer());
            }

            // keep looping and show the running scores
            System.out.println("The score is: Player 1: " + player1Score + ", Player 2: " + player2Score);
            System.out.println("Do you want to play again (y/n)");
            playAgain = input.next().toLowerCase();

        } while (playAgain.equals("y"));

        input.close();
    }
}

class GamePlayer{
    private String name;
    private int level;

    public GamePlayer(){
    }

    public GamePlayer(String name, int level){
        setName(name);
        setLevel(level);
    }

    public void setLevel(int level){
        if (level >= 1 && level <= 5) {
            this.level = level;
        }
    }

    public int getLevel(){
        return this.level;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class MarioKartPlayer extends GamePlayer implements Comparable <MarioKartPlayer>{
    private double weight, maxSpeed, acceleration;
    private String cheer;

    public MarioKartPlayer(String name, int level, double weight, double maxSpeed, double acceleration, String cheer){
        super(name, level);
        setWeight(weight);
        setMaxSpeed(maxSpeed);
        setAcceleration(acceleration);
        setCheer(cheer);
    }

    public void setWeight(double weight){
        if (weight >= 20 && weight <= 1000) {
            this.weight = weight;
        }
    }

    public double getWeight(){
        return this.weight;
    }

    public void setMaxSpeed(double maxSpeed){
        if (maxSpeed >= 100 && maxSpeed <= 300) {
            this.maxSpeed = maxSpeed;
        }
    }

    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setAcceleration(double acceleration){
        if (acceleration >= 1 && acceleration <= 5) {
            this.acceleration = acceleration;
        }
    }

    public double getAcceleration(){
        return this.acceleration;
    }

    public void setCheer(String cheer){
        this.cheer = cheer;
    }

    public String getCheer(){
        return this.cheer;
    }

    public int compareTo(MarioKartPlayer MKP){
        double scoreA = calculateScore(this);
        double scoreB = calculateScore(MKP);

        if (scoreA >= scoreB) {
            return 1;
        } else {
            return -1;
        }
    }

    private double calculateScore(MarioKartPlayer MKP) {
        Random rand = new Random();
        /*
         * Generate a random decimal value between -1 and 1:
         * Multiply rand.nextDouble() by 2 to expand the range to (0,2),
         * then subtract 1 to shift the range to (-1,1).
         * rand.nextDouble() returns a value between (0.0 and 1.0).
         */
        double randomVal = 2 * rand.nextDouble() - 1;

        // score = (1+level/5.0)
        return (1 + MKP.getLevel() / 5.0)
                // * sqrt(weight)
                * Math.sqrt(MKP.getWeight())
                // * (maxspeed/200.0)^(1.5)
                * Math.pow((MKP.getMaxSpeed() / 200.0), 1.5)
                // / acceleration + randomVal
                / MKP.getAcceleration() + randomVal;
    }
}


