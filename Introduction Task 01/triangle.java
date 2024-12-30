//Find the area of a triangle : 0.5 * base * height
//Using method for this
import java.util.Scanner;

public class triangle {
  public static void calcu(double base, double height) {
      double area = 0.5 * base * height;
      System.out.println(area);
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The base:");
      double base = sc.nextDouble();
      System.out.println("Enter The height:");
      double height = sc.nextDouble();
      System.out.print("The area of the triangle is: ");
      calcu(base, height);
  }
}