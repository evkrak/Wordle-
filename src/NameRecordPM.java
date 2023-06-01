import java.util.Arrays;

public class NameRecordPM implements Comparable<NameRecordPM> {
    private String name;
    private int age;
    public NameRecordPM(String name, int age) {
        this.name= name;
        this.age= age;
    }//end of NameRecord
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }


    public String toString() {
        return ("age: "+age+" years old, and name: "+ name);
    }




    public static void main(String[] args) {
        NameRecordPM[] nrList= new NameRecordPM[4];
        nrList[0]= new NameRecordPM("aaa",50);
        nrList[1]= new NameRecordPM("ccc",10);
        nrList[2]= new NameRecordPM("bbb",10);
        nrList[3]= new NameRecordPM("aaaa",50);

        //System.out.println(Arrays.toString(nrList));
        for(int i=0; i<nrList.length;i++){
            System.out.println(nrList[i]);
        }
        Arrays.sort(nrList);
        System.out.println("Sorted");
        // System.out.println(Arrays.toString(nrList));
        for(int i=0; i<nrList.length;i++){
            System.out.println(nrList[i]);
        }

    }

    //sort in order of ascending age (low to high)
    //if tied in age: sort in order of ascending name
    @Override
    public int compareTo(NameRecordPM o) {
        if(this.getAge()==o.getAge()){
            //tiebreaker if ages are the same
            return this.getName().compareTo(o.getName());
        }else{//compares ages against each other if they are not the same
            return this.getAge() - o.getAge();
        }
    }//end of compareTo
}//end of class