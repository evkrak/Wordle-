public class UsingMdms {
    public static void main(String[] args) {
        String[][] people = new String[10][4];
        people[0][0] = "Chaim";
        people[0][1] = "Goldberg";
        people[0][2] = "16";
        people[0][3] = " 123456789";

        people[1][0] = "Eitan";
        people[1][1] = "Steinberg";
        people[1][2] = "18";
        people[1][3] = "45678983";

        for(int i = 0; i < people.length; i++){

            for(int j = 0; j < people[i].length; j++){
                System.out.print(people[i][j]+"| |");
            }
            System.out.println();



        }
    }
}