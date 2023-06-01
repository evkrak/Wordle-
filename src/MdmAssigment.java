import java.util.*;
public class MdmAssigment {
    public static void main(String[] args) {
        String[][] nickNames = new String[2][15];
        nickNames[0][0]= "Jeff";
        nickNames[0][1]= "Bob";
        nickNames[0][2]= "Joe";
        nickNames[0][3]= "Moe";
        nickNames[0][4]= "Hugh";
        nickNames[0][5]= "Ben ";
        nickNames[0][6]= " Evan";
        nickNames[0][7]= " Boaz";
        nickNames[0][8]= " Noah";
        nickNames[0][9]= "Zachary";
        nickNames[0][10]= "Craig";
        nickNames[0][11]= "Micheal";
        nickNames[0][12]= "Donald";
        nickNames[0][13]= "Kim";
        nickNames[1][0]= "Krakower";
        nickNames[1][1]= "Jordan";
        nickNames[1][2]= "Hitler";
        nickNames[1][3]= "Janus";
        nickNames[1][4]= "Hitler";
        nickNames[1][5]= "Jung-Un";
        nickNames[1][6]= "Glazer";
        nickNames[1][7]= "Trump";
        nickNames[1][8]= "Granovsky";
        nickNames[1][9]= "Goldberg";


        String userFirstName;
        String userLastName;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name (must be longer than 2 letters)?");
        userFirstName = sc.nextLine();
        System.out.println("What is your Last name?(must be longer than two letters");
        userLastName = sc.nextLine();

        String userFirstNameL;
        String userLastNameL;

        userLastNameL= userLastName.toLowerCase();
       userFirstNameL= userFirstName.toLowerCase();




        int  firstNameValue =0;
        int secondNameValue=0;
        int totalFirstValue=0;
        int lastNameOneValue=0;
        int lastNameTwoValue=0;
        int totalLastValue=0;
        firstNameValue= (int)userFirstNameL.charAt(0);
        secondNameValue= (int)userFirstNameL.charAt(1);
        lastNameOneValue= (int)userLastNameL.charAt(0);
        lastNameTwoValue= (int)userLastNameL.charAt(1);


      totalFirstValue= firstNameValue+ secondNameValue;
      totalLastValue= lastNameOneValue+ lastNameTwoValue;


        System.out.println(" Your NickName is:");





        if (totalFirstValue >= 194 && totalFirstValue <= 196) {
            System.out.println(nickNames[0][0]);
        }
        if (totalFirstValue >= 197 && totalFirstValue <= 199) {
            System.out.println(nickNames[0][1]);
        }
        if (totalFirstValue >= 200 && totalFirstValue <= 202) {
            System.out.println(nickNames[0][2]);
        }
        if (totalFirstValue >= 203 && totalFirstValue <= 205) {
            System.out.println(nickNames[0][3]);
        }
        if (totalFirstValue >= 206 && totalFirstValue <= 208) {
            System.out.println(nickNames[0][4]);
        }
        if (totalFirstValue >= 209 && totalFirstValue <= 211) {
            System.out.println(nickNames[0][5]);
        }
        if (totalFirstValue >= 212 && totalFirstValue <= 214) {
            System.out.println(nickNames[0][6]);
        }
        if (totalFirstValue >= 215 && totalFirstValue <= 217) {
            System.out.println(nickNames[0][7]);
        }
        if (totalFirstValue >= 218 && totalFirstValue <= 220) {
            System.out.println(nickNames[0][7]);
        }
        if (totalFirstValue >= 221 && totalFirstValue <= 223) {
            System.out.println(nickNames[0][8]);
        }
        if (totalFirstValue >= 224 && totalFirstValue <= 226) {
            System.out.println(nickNames[0][9]);
        }
        if (totalFirstValue >= 227 && totalFirstValue <= 229) {
            System.out.println(nickNames[0][10]);
        }
        if (totalFirstValue >= 230 && totalFirstValue <= 232) {
            System.out.println(nickNames[0][11]);
        }
         if (totalFirstValue >= 233 && totalFirstValue <= 235) {
             System.out.println(nickNames[0][12]);
         }
         if (totalFirstValue >= 236 && totalFirstValue <= 239) {
             System.out.println(nickNames[0][13]);
         }
         if (totalFirstValue >= 240 && totalFirstValue <= 244) {
                        System.out.println(nickNames[0][14]);
                    }




                    if (totalLastValue >= 194 && totalLastValue <= 198) {
                        System.out.println(nickNames[1][0]);
                    }
                    if (totalLastValue >= 199 && totalLastValue <= 203) {
                        System.out.println(nickNames[1][1]);
                    }
                    if (totalLastValue >= 204 && totalLastValue <= 209) {
                        System.out.println(nickNames[1][2]);
                    }
                    if (totalLastValue >= 210 && totalLastValue <= 214) {
                        System.out.println(nickNames[1][3]);
                    }
                    if (totalLastValue >= 215 && totalLastValue <= 219) {
                        System.out.println(nickNames[1][4]);
                    }
                    if (totalLastValue >= 220 && totalLastValue <= 224) {
                        System.out.println(nickNames[1][5]);
                    }
                    if (totalLastValue >= 225 && totalLastValue <= 229) {
                        System.out.println(nickNames[1][6]);
                    }
                    if (totalLastValue >= 230 && totalLastValue <= 234) {
                        System.out.println(nickNames[1][7]);
                    }
                    if (totalLastValue >= 235 && totalLastValue <= 239) {
                        System.out.println(nickNames[1][8]);
                    }
                    if (totalLastValue >= 240 && totalLastValue <= 244) {
                        System.out.println(nickNames[1][9]);
                    }






                }
            }


