public class TeamRecord {
    private String name;
    private int pointsScored;

    public TeamRecord(){
        this.name="Chaim";
        this.pointsScored= 10;
    }//end of constructor

    public TeamRecord(String n, int p){
        this.name= n;
        setPointsScored(p);
    }//end of constructor

    public String getName(){
        return this.name;
    }

    public int getPointsScored(){
        return this.pointsScored;
    }

    public void setPointsScored(int p){
        if(p<0 || p>100){
            this.pointsScored= 0;
        }else{
            this.pointsScored= p;
        }
    }//end of setPointsScored

    public String toString(){
        return "Name: " + name + "\nPoints Scored: "+pointsScored+"\n";
    }
}
