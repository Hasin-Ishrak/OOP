import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the target sales: ");
        int s=sc.nextInt();
        System.out.println("Enter the attendence: ");
        int a=sc.nextInt();

        if(s>=95 && a==100) System.out.println("60% Bonus ");

        else if((s>=95 && a==90) || (s>=80 && a==100)) System.out.println("40% bonus ");

        else if(s>=80 && a==90) System.out.println("20% bonus ");

        else System.out.println("5% bonus ");
    }
    
}
