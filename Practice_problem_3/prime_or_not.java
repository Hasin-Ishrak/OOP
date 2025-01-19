import java.util.Scanner;

public class prime_or_not {
    public static boolean is_prime(int n){
        if(n<=1) return false;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        if(is_prime(n)){
            System.out.println(n+" " +"is prime .");
        }
        else{
            System.out.println(n+" " +"is not prime .");
        }
    }
}
