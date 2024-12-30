//Find the volume of a ball: 4/3 * pi * radius^3
import java.util.Scanner;

public class ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the ball:");
        double radi = sc.nextDouble();
        double volume = 4.0/3.0 * Math.PI * Math.pow(radi, 3);
        System.out.println("The volume of the ball is: " + volume);
    }
}
