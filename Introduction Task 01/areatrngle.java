//Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c))  where s = (a+b+c) / 3
import java.util.Scanner;

public class areatrngle {
    public static void area(double a ,double b,double c){
        double s = (a+b+c)/2;
        double ar= s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(ar);
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a:");
        double a=sc.nextDouble();
        System.out.println("Enter b :");
        double b =sc.nextDouble();
        System.out.println("Enter c :");
        double c=sc.nextDouble();
        System.out.print("The Area is : ");
        area(a,b,c);
    }   
}
