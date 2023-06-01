public class VariblesMiniAssigment {
    public static void main(String[] args) {
        // Name
        String name= "Jamie";
        // Settinhg up first varibles
        double massA= 7.8;
        double massB= 36.1;
        double massC= 1.8;
        double volA= 1.0;
        double volB= 4.6;
        double volC=0.23;

        //calculating density
        double densityA= massA/volA;
        double densityB= massB/volB;
        double densityC= massC/volC;

        // averge density

        double AvergeDensity= (densityA+densityB+densityC)/3;
        System.out.println("Jamie's diffrent samples of iron all averaged out to a density of "+AvergeDensity);
    }

}