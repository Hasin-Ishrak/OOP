
public class dog {
    static String name;static String breed;
    static int age;

    dog(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    void spin(){
        System.out.println("The Dog is happy and spinning");
    }
    void run(){
        System.out.println("The Dog is running");
    }
    void berk(){
        System.out.println("The dog is upset and not berking");
    }
    void print(){
        System.out.println("Name of the Dog is :" +name);
        System.out.println("Breed :"+breed+" Age: "+age);
    }
    public static void main(String[] args) {
        dog d1=new dog("Coco","German",4);
       d1.print(); d1.berk();
         d1.spin();
        d1.run(); 
    }
}
