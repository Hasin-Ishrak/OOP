import java.util.Scanner;

public class average {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Give size of the array :");
     int n= sc.nextInt();
     int[] a = new int[n];
     int sum=0;
      for(int i=0;i<n;i++){
        a[i]= sc.nextInt();
        sum+=a[i];
      }
     
      double avg= (double) sum/n;
      System.out.println("The Average is :"+avg);
   }
}
