public class sum_of_odd {
    public static void main(String[] args) {
        int sum=0;
        int n=1;
        while(n<20){
            sum+=n;
            n+=2;
        }
        System.out.println("Sum is : "+sum);
    }
}
