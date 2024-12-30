//Find the area of a equilateral triangle: (√3 / 4) * arm^2
import java.util.Scanner;

public class eqtriangle {

    public static void area(double side){
       double area = (Math.sqrt(3) /4) * Math.pow(side, 2);
       System.out.println("Area Of The Triangle is: " +area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle:");
        double side =sc.nextDouble();
        area(side);

    }
}
