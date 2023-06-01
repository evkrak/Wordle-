import java.sql.SQLOutput;
import java.util.*;

public class PhoneRecordPMEncapsulation {
    private  String name;
    private long phoneNumber;
    private byte age;

    public PhoneRecordPMEncapsulation(){
        this.name="Bill";

    }

    public PhoneRecordPMEncapsulation(String n, long p, byte a){
        this.name=n;
        this.phoneNumber=p;
        setAge(a);
    }
    public String getName(){
        return this.name;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public byte getAge() {
        return this.age;
    }

    public void setAge(byte a) {
       if(a<0){
           do {
               System.out.println("invalid Entry:");
               Scanner sc = new Scanner(System.in);
               System.out.println("please Re-enter age:");
               this.age = sc.nextByte();
           }while(this.age<0);
       }else {
           this.age = a;
       }
    }
}
