import java.util.*;
public class PersonPM extends Object {
    private String name, address;
    private double yearOfBirth;

    public PersonPM(String name, String address, double yearOfBirth) throws Exception {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public void setYearOfBirth(double y) throws Exception {
        if (y < 0) {
            Exception e = new Exception();
            throw e;

        } else if (y > 2023) {
            throw new Exception();
        } else {
            this.yearOfBirth = y;
        }

       /* if (y<0){
            this.yearOfBirth=y*(-1);
        } else if (y>2023) {
            this.yearOfBirth=2023;

        }else{
            this.yearOfBirth=y;
        }

        */
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public String getAddress() {
        return this.address;
    }

    public double getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public double getAge() {
        return 2023 - this.yearOfBirth;
    }

    public String toString() {
        return "Name: " + this.name + "\n Address: " + this.address + "\n Age: " + getAge();
    }

    public static void main(String[] args) {
        PersonPM p = null;
        Scanner sc;
        double yob;

        do {
            System.out.println(" please enter a value >=0 and <=2023 for year of brith");
            sc = new Scanner(System.in);

            try {
                yob = sc.nextDouble();
                p = new PersonPM("Josh", "64 Castle Rock", yob);
                break;
            } catch (Exception e) {
                System.out.println("That is an invlaid year");
            }
        } while (true) ;
        System.out.println(p);



    }

}

