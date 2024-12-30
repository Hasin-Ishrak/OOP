//Find the area of a circle: pi * radius^2
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The radius:");
        double radi = sc.nextDouble();
        double area =Math.PI * Math.pow(radi,2);
        System.out.println("Area is: "+area);
    }
}
