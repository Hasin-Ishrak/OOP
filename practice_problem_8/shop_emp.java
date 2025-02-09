
class employee{
    static String name; static int id;
    static String department;
    void calculatePay(){
     System.out.println("Name -:"+name);
     System.out.println("Id -:"+id);
     System.out.println("Department -:"+department);
     System.out.println("He can calculate for payment !");
    }
 }
 
 class FullTimeEmployee extends employee{
     static double fixedSalary;
 
     FullTimeEmployee(String name,String department,int id,double Salary){
         this.name=name;
         this.department=department;
         this.id=id;
         this.fixedSalary=Salary;
     }
     void Salary(){
         System.out.println("Salary -:"+fixedSalary);
 
     }
 }
 class partTimeEmployee extends employee{
     static double hourlyRate; static int hourWorked;

     partTimeEmployee(String name,String department,int id,double hourlyRate,int hourWorked){
        this.name=name;
        this.department=department;
        this.id=id;
        this.hourlyRate=hourlyRate;
        this.hourWorked=hourWorked;
     }
 
     void partime(){
         System.out.println("Hour rate -:"+hourlyRate+ " Hour worked -::"+hourWorked);
     }
 }
 
 class contractEmployee extends employee{

     static String projectName; static double contactAmount;

     contractEmployee(String name,String department,int id,String projectname,double contactAmount){
        this.name=name;
        this.department=department;
        this.id=id;
        this.projectName=projectname;
        this.contactAmount=contactAmount;
     }
     void cemp(){
         System.out.println("Project name -:"+projectName+" Ammount -:"+contactAmount);
     }
 }
 
 public class shop_emp {
     public static void main(String[] args) {
 
         FullTimeEmployee e1=new FullTimeEmployee("Alom","Cashier",1345,1000.90);
         e1.calculatePay(); e1.Salary();
        
         partTimeEmployee e2=new partTimeEmployee("Bolom"," Traffic",420, 50.50, 5);
         e2.calculatePay(); e2.partime();

         contractEmployee e3=new contractEmployee("Lily","Food",2324,"Hunger garage",500.50);
         e3.calculatePay(); e3.cemp();
     }
 }
 