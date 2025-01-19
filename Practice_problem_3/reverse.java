import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i =0;i<n;i++) a[i]=sc.nextInt();

        System.out.println("Reverse order :");
        for(int i =n-1;i>=0;i--) System.out.print(a[i]+" ");
    }
}
