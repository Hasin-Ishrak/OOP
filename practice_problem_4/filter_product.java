import java.util.Scanner;

 class filter_product {

     static void filter(String category){
        System.out.println("Category : "+category);
    }

    static void filter(double minprice,double maxprice){
        System.out.println("Price range  is "+maxprice+" to "+minprice);
    }

    static void filter_by_brand(String brand){
       System.out.println("Brand name is "+brand);
    }

    static void filter(String category, double minprice,double maxprice ){
      System.out.print("Categor is : "+category+" ");
      System.out.println("Price range is "+maxprice+" to "+minprice);
    }

    static void filter(String category,double maxprice,double minprice ,String brand){
        System.out.println("Categor is  "+category+" ");
        System.out.println("Price range is "+minprice+" to "+maxprice);
        System.out.println("Brand is "+brand);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Enter filter type(1:Category,2: Price Range,3: Brand,4:Category & Price Range,5:Category,Price Range & Brand):");
        int n= sc.nextInt();
        sc.nextLine();

        if(n==1){
          System.out.println("Enter The Categor");
          String s=sc.nextLine();
          filter(s);
        }

        else if(n==2){
            System.out.println("Enter the minimum and maximum price :");
            double mx=sc.nextDouble();
            double mn=sc.nextDouble();
            filter(mx, mn);
        }

        else if(n==3){
            System.out.println("Enter the brand name :");
            String ss=sc.nextLine();
            filter_by_brand(ss);
        }

        else if(n==4){
            System.out.println("Enter the category and price range :");
            String sss=sc.nextLine();
            double mxx=sc.nextDouble();
            double mnn=sc.nextDouble();
            filter(sss, mxx, mnn);
        }

        else{
           System.out.println("Enter category , price range and brand name ");
           String s=sc.nextLine();
           double mn=sc.nextDouble();
           double mx=sc.nextDouble();
           sc.nextLine();
           String ss=sc.nextLine();
           filter(s, mn, mx,ss);
        }
    }
}
