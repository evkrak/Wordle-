public class UsingTeamRecord {
    public static void main(String[] args) {
        TeamRecord[] trList= new TeamRecord[3];
        trList[0]= new TeamRecord("Flynn", 38);
        trList[1]= new TeamRecord("Chamberlain",100);
        trList[2]= new TeamRecord("Jordan",69);

        for(int i=0;i<trList.length;i++){
            System.out.println(trList[i]);
        }
    }
}