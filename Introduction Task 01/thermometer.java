//Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9
import java.util.Scanner;

public class thermometer {

    public static void tempa(double celcius){
       double far = (celcius * 9/5)+32;
       System.out.println(far);
       System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Temparature in Celcius:");
        double celcius =sc.nextDouble();
        System.out.print("The Temparature in Farenhite is: ");
        tempa(celcius);
    }
}
