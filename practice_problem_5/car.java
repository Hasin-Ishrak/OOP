
public class car {
    static String owner; static String brand;
     static int serialmumer; boolean ss=true;

     car(String owner,String brand,int serialmumer){
        this.owner=owner;
        this.brand=brand;
        this.serialmumer=serialmumer;
     }
     void start(){
       if(ss){
        System.out.println("The Engine Starts");
       }
       else{
        System.out.println("The Engine is off");
       }
     }

     void fuel(){
        System.out.println("Fuel is low");
     }
    void print(){
        System.out.println("Owner :"+owner+" Brand :"+brand+" Serial number :"+serialmumer);
    }
   public static void main(String[] args) {
      car c1 = new car("Ishrak","HONDA",65733);
      car c2=new car("Jayed","Benz",30055);
      c1.print();
      c1.fuel();
      c1.start();
      c1.ss=false;
      c1.start();
   }
}
