public class EmployeePM extends PersonPM{
    //EmployeePM has all variables and methods of PersonPM
    //We can add more details to EmployeePM
    private String position;
    private double salary;

    public EmployeePM()throws Exception{
        //super();
        super("Jonah","SkyDome",2006);
        this.position= "cashier";
        this.salary= 25000;
    }//end of EmployeePM

    public String toString(){
        return super.toString()+"\nPosition:"+position+"\nSalary:"+salary;
    }
    public static void main(String[] args) {
       try {
           EmployeePM emp = new EmployeePM();

           System.out.println(emp.position);
           System.out.println(emp.getName());
           System.out.println(emp);
       }catch(Exception e) {
       }
       }
    }
