import java.util.Scanner;

public class find_maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i =1;i<n;i++){
            if(a[i]>a[i-1]) max=a[i];
        }
        System.out.println("Greatest element is : "+max);
    }
}
