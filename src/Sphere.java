import java.util.Arrays;
public class Sphere extends Object implements Comparable<Sphere>{
    private double radius;

    public Sphere(){
        this.radius= 1;
    }
    public Sphere(double r)throws Exception{
        setRadius(r);
    }
    public void setRadius(double r)throws Exception{
        if(r<=0){
            throw new Exception();
        }else{
            this.radius= r;
        }
    }//end of setDiameter

    public double getRadius(){
        return this.radius;
    }

    public double getSurfaceArea(){
        return 4*Math.PI*getRadius()*getRadius();
    }

    public double getVolume(){
        return (4.0/3)*Math.PI*getRadius()*getRadius()*getRadius();
    }

    public double getDiameter(){
        return this.radius*2;
    }

    public String toString(){
        return "Radius:"+this.radius+ "\n"; //"Surface Area:"+getSurfaceArea()+"\nVolume:"+getVolume()+"\nDiameter:"+getDiameter();
    }

    public static void main(String[] args) throws Exception{

       Sphere [] spList= new Sphere[4];
        spList[0]= new Sphere(5);
        spList[1] = new Sphere(8);
        spList[2] = new Sphere(2);
        spList[3] = new Sphere(19);
        System.out.println(Arrays.toString(spList));
        Arrays.sort(spList);
        System.out.println("now sorted");
        System.out.println(Arrays.toString(spList));

    }

    @Override
    public int compareTo(Sphere o) {
        return (int)(this.getRadius()-o.getRadius());
    }
}



