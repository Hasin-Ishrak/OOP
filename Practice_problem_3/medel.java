import java.util.Scanner;

public class medel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your letter grade:");
        double g= sc.nextDouble();

        System.out.println("Completed the semester? yes or no");
        String s=sc.next();

        if(g>=3.5){
            if(s.equals("yes")) System.out.println("Congrats for medal!!");
            else System.out.println("Complete the semester");
        }
        else System.out.println("Study Hard!!");
    }
    
}
