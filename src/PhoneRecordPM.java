public class PhoneRecordPM {
    //Since they are declared in a class but not in a method
    //they are accessible by every method in this class
    //Since they are "public" they can be accessed by other classes
    public String name;
    public long phoneNumber;
    public byte age;

    //Constructor Method: it will build up an instance of PhoneRecordPM
    //Has the same name as the class: PhoneRecordPM
    public PhoneRecordPM(){
        name= "Bill";
        phoneNumber= 4165551234l;
        age= 12;
    }
    //Overloading the constructor method: same name, different parameters
    public PhoneRecordPM(String name, long p, byte a){
        this.name= name;
        this.phoneNumber= p;
        this.age= a;
    }
}
