public class PhoneRecordPMUsing {
    public static void main(String[] args) {
        //Creates an instance/variable of PhoneRecordPM
        PhoneRecordPM prp= new PhoneRecordPM();
        System.out.println(prp.name);
        System.out.println(prp.phoneNumber);
        System.out.println(prp.age);

        prp.name= "Susan";

        System.out.println(prp.name);

        PhoneRecordPM prp1= new PhoneRecordPM("Susan",3451234567l,(byte)28);
        System.out.println(prp1.name);
        System.out.println(prp1.phoneNumber);
        System.out.println(prp1.age);
    }

}
