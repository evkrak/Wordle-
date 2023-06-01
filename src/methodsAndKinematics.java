//Name: Evan Krakower
// Teacher: Mr.Rottmann
// Task: Create a kinematics calculator.

import java.util.*;

public class methodsAndKinematics {
    public static void main(String[] args) {
        int userChoice = 0;
        String Squared = ("\u00B2");
        Scanner sc = new Scanner(System.in);

        while (userChoice < 1 || userChoice > 4) {
            sc = new Scanner(System.in);
            try {
                System.out.println(" Enter 1 to solve for Displacement:" + " Enter 2 to solve for Velocity:" + " Enter 3 to solve for Time:" + " Enter 4 to solve for Acceleration: Enter 5 to BREAK");
                userChoice = sc.nextInt();

            } catch (Exception e) {
                System.out.println("this is invalid data, Please enter a number!");
            }

            if (userChoice == 1) {
                double disp = 0;
                System.out.println("What is the velocity");
                double velo = sc.nextDouble();
                System.out.println("What is the Acceleration");
                double acc = sc.nextDouble();
                System.out.println("What is the Time");
                double time = sc.nextDouble();
                double x = displacement(disp, velo, acc, time);
                System.out.println("The displacement is: " + x + " meters");
                int userChoice1 = 0;
                System.out.println("would you like to convert meters to a different unit? 1=yes 2=no");
                userChoice1 = sc.nextInt();
                if (userChoice1 == 1) {
                    int userChoice2 = 0;
                    System.out.println("Would u like to convert meters to Km=1 Mm=2 Cm==3 4= Never mind");
                    userChoice2 = sc.nextInt();
                    if (userChoice2 == 1) {
                        System.out.println(" The dispalcement is " + (x / 100) + " Km");
                    } else if (userChoice2 == 2) {
                        System.out.println(" The dispalcement is " + (x * 1000) + " Mm");
                    } else if (userChoice2 == 3) {
                        System.out.println(" The dispalcement is " + (x * 100) + " Cm");
                    } else if (userChoice2 == 4) {
                        System.out.println("Ok!");
                    } else
                        break;
                } else if (userChoice1 == 2) {
                    System.out.println("Ok!");
                } else
                    break;

            } else if (userChoice == 2) {
                double velo = 0;
                System.out.println("What is the time");
                double tim = sc.nextDouble();
                System.out.println("What is the Acceleration");
                double acc = sc.nextDouble();
                System.out.println("What is the Displacement");
                double disp = sc.nextDouble();
                double x = velocity(disp, velo, tim, acc);
                System.out.println("the velocity is: " + x + " M/s");
                int userChoice1 = 0;
                int userchoice4 = 0;
                System.out.println("would you like to convert meters to a different unit? 1=yes 2=no");
                userChoice1 = sc.nextInt();
                System.out.println("would you like to convert seconds to a different unit? 1=yes 2=no");
                userchoice4 = sc.nextInt();
                if (userchoice4 == 1 && userChoice1 == 0) {
                    int userChoice2 = 0;
                    System.out.println("Would u like to convert meters to Km=1 Mm=2 Cm==3 4= Never mind");
                    userChoice2 = sc.nextInt();
                    if (userChoice2 == 1) {
                        System.out.println(" The velocity  is " + (x / 100) + " Km/s");
                    } else if (userChoice2 == 2) {
                        System.out.println(" The velocity  is " + (x * 1000) + " Mm/s");
                    } else if (userChoice2 == 3) {
                        System.out.println(" The velocity  is " + (x * 100) + " Cm/s");
                    } else if (userChoice2 == 4) {
                        System.out.println("Ok!");
                    } else
                        break;

                    if (userchoice4 == 0 && userChoice1 == 1) {
                        int userChoice3 = 0;
                        System.out.println("Would u like to convert seconds to hours=1 Minutes=2 Days==3 4= Never mind");
                        userChoice3 = sc.nextInt();
                        if (userChoice3 == 1) {
                            System.out.println(" The velocity  is " + (x / 3600) + " m/hour");
                        } else if (userChoice3 == 2) {
                            System.out.println(" The velocity  is " + (x / 60) + " m/minute");
                        } else if (userChoice3 == 3) {
                            System.out.println(" The velocity  is " + (x / 43200) + " m/day");
                        } else if (userChoice3 == 4) {
                            System.out.println("Ok!");
                        } else
                            break;


                    }

                }
                String unitName = null;
                if (userchoice4 == 1 && userChoice1 == 1) {
                    int userChoice3 = 0;
                    System.out.println("Would u like to convert seconds to hour=1 Minute=2 Day==3 4= Never mind");
                    userChoice3 = sc.nextInt();
                    double Numeber = 0;
                    if (userChoice3 == 1) {
                        unitName = "Hour";
                        Numeber = 3600;
                    } else if (userChoice3 == 2) {
                        unitName = "minute";
                        Numeber = 60;
                    } else if (userChoice3 == 3) {
                        unitName = "day";
                        Numeber = 43200;
                    } else if (userChoice3 == 4) {
                        break;
                    } else
                        break;
                    String unitName1 = null;


                    int userChoice2 = 0;
                    System.out.println("Would u like to convert meters to Km=1 Mm=2 Cm==3 4= Never mind");
                    userChoice2 = sc.nextInt();
                    double number1 = 0;
                    if (userChoice2 == 1) {
                        unitName1 = "km";
                        number1 = 0.01;
                    } else if (userChoice2 == 2) {
                        unitName1 = "Mm";
                        number1 = 1000;
                    } else if (userChoice2 == 3) {
                        unitName1 = "Cm";
                        number1 = 100;
                    } else if (userChoice2 == 4) {
                        break;
                    } else
                        break;

                    double finalNumber = (number1 / Numeber * x); //fix

                    System.out.println("The Velocity is: "+ finalNumber + " " + unitName1 + "/" + unitName);


                    // finnish this

                }


            } else if (userChoice == 3) {
                double tim = 0;
                System.out.println("What is the Acceleration");
                double acc = sc.nextDouble();
                System.out.println("What is the Displacement");
                double disp = sc.nextDouble();
                System.out.println("What is the velocity");
                double velo = sc.nextDouble();
                double x = time1(disp, velo, tim, acc);
                System.out.println("the first time is:" + x + " seconds");
                double y = time2(disp, velo, tim, acc);
                System.out.println("the second time is:" + y + " seconds");
                int userChoice3 = 0;
                int userChoice4 = 0;
                System.out.println("would you like to convert seconds to a different unit? 1=yes 2=no");
                userChoice4 = sc.nextInt();
                if (userChoice4 == 1) {
                    int userChoice2 = 0;
                    System.out.println("Would u like to convert seconds to hours=1 Minutes=2 Days==3 4= Never mind");
                    userChoice2 = sc.nextInt();
                    if (userChoice2 == 1) {
                        System.out.println(" The time is:" + (x / 3600) + " hour");
                    } else if (userChoice2 == 2) {
                        System.out.println(" The time is: " + (x / 60) + " minute");
                    } else if (userChoice2 == 3) {
                        System.out.println(" The time is: " + (x / 43200) + " day");
                    } else if (userChoice2 == 4) {
                        System.out.println("Ok!");
                    } else
                        break;
                } else if (userChoice4 == 2) {
                    System.out.println("Ok!");
                } else
                    break;



            } else if (userChoice == 4) {
            double acc = 0;
            System.out.println("What is the Displacement");
            double disp = sc.nextDouble();
            System.out.println("What is the velocity");
            double velo = sc.nextDouble();
            System.out.println("What is the time");
            double tim = sc.nextDouble();
            double x = acceleration(disp, velo, tim, acc);
            System.out.println("The acceleration is:" + x + " M" + Squared);
                int userChoice1 = 0;
                int userchoice4 = 0;
                System.out.println("would you like to convert meters to a different unit? 1=yes 2=no");
                userChoice1 = sc.nextInt();
                System.out.println("would you like to convert seconds to a different unit? 1=yes 2=no");
                userchoice4 = sc.nextInt();
                if (userchoice4 == 1 && userChoice1 == 0) {
                    int userChoice2 = 0;
                    System.out.println("Would u like to convert meters to Km=1 Mm=2 Cm==3 4= Never mind");
                    userChoice2 = sc.nextInt();
                    if (userChoice2 == 1) {
                        System.out.println(" The  acceleration is " + (x / 100) + " Km/s"+Squared);
                    } else if (userChoice2 == 2) {
                        System.out.println(" The acceleration  is " + (x * 1000) + " Mm/s"+Squared);
                    } else if (userChoice2 == 3) {
                        System.out.println(" The acceleration  is " + (x * 100) + " Cm/s"+Squared);
                    } else if (userChoice2 == 4) {
                        System.out.println("Ok!");
                    } else
                        break;

                    if (userchoice4 == 0 && userChoice1 == 1) {
                        int userChoice3 = 0;
                        System.out.println("Would u like to convert seconds to hours=1 Minutes=2 Days==3 4= Never mind");
                        userChoice3 = sc.nextInt();
                        if (userChoice3 == 1) {
                            System.out.println(" The acceleration  is " + (x / 3600) + " m/hour" +Squared);
                        } else if (userChoice3 == 2) {
                            System.out.println(" The acceleration  is " + (x / 60) + " m/minutes"+Squared);
                        } else if (userChoice3 == 3) {
                            System.out.println(" The acceleration  is " + (x / 43200) + " m/days"+Squared);
                        } else if (userChoice3 == 4) {
                            System.out.println("Ok!");
                        } else
                            break;


                    }

                }
                String unitName = null;
                if (userchoice4 == 1 && userChoice1 == 1) {
                    int userChoice3 = 0;
                    System.out.println("Would u like to convert seconds to hours=1 Minutes=2 Days==3 4= Never mind");
                    userChoice3 = sc.nextInt();
                    double Numeber = 0;
                    if (userChoice3 == 1) {
                        unitName = "Hours";
                        Numeber = 3600;
                    } else if (userChoice3 == 2) {
                        unitName = "minutes";
                        Numeber = 60;
                    } else if (userChoice3 == 3) {
                        unitName = "days";
                        Numeber = 43200;
                    } else if (userChoice3 == 4) {
                        break;
                    } else
                        break;
                    String unitName1 = null;


                    int userChoice2 = 0;
                    System.out.println("Would u like to convert meters to Km=1 Mm=2 Cm==3 4= Never mind");
                    userChoice2 = sc.nextInt();
                    double number1 = 0;
                    if (userChoice2 == 1) {
                        unitName1 = "km";
                        number1 = 0.01;
                    } else if (userChoice2 == 2) {
                        unitName1 = "Mm";
                        number1 = 1000;
                    } else if (userChoice2 == 3) {
                        unitName1 = "Cm";
                        number1 = 100;
                    } else if (userChoice2 == 4) {
                        break;
                    } else
                        break;

                    double finalNumber = (number1 / Numeber * x); //fix

                    System.out.println("the acceleration is:" + finalNumber + " " + unitName1 + "/" + unitName+Squared);


                    // finnish this

                }


        } else if (userChoice==5){
            break;
        }

        }
    }

        public static double displacement ( double disp, double velo, double tim, double acc){
            disp = ((velo * tim) + (0.5 * acc * (tim * tim)));
            return disp;


        }

        public static double velocity ( double disp, double velo, double tim, double acc){
            velo = (disp / tim - (0.5 * acc * tim));
            return velo;
        }
        public static double acceleration ( double disp, double velo, double tim, double acc){
            acc = (2.0 * (disp - velo * tim) / (tim * tim));
            return acc;
        }

        public static double time1 ( double disp, double velo, double tim, double acc){
            tim = (-(velo + Math.sqrt(velo * velo + 2.0 * acc * disp) / acc));
            return tim;
        }

        public static double time2 ( double disp, double velo, double tim, double acc){
            tim = (-(velo - Math.sqrt(velo * velo + 2.0 * acc * disp) / acc));
            return tim;

        }
    }




