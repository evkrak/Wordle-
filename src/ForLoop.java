public class ForLoop {
    public static void main(String[] args) {
        for(int i= -10;i<3;i++){
            System.out.println("time through loop:" +i);
        }
        String word= "cheese";
        for(int i=0; i<word.length(); i++){
            System.out.println("Letter"+i+":"+ word.charAt(i)) ;
        }
        for(int i=word.length()-1; i>=-0; i--){
            System.out.println("Letter"+i+":"+ word.charAt(i)) ;
        }
    }


}