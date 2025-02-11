
class Restaurant {
     String name;
    double food_price;
    Restaurant(String name,double food_price){
        this.name=name;
        this.food_price=food_price;
    }
    double bill(){
        return food_price+(food_price*0.10);
    }
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
        System.out.println(name +" Price of the food "+bill()+" Taka");
    }
}
class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name,double food_price){
        super(name,food_price);
    }
    double bill(){
        return food_price+(food_price*0.15);
    }
    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(String name,double food_price){
      super(name,food_price);
    }
    int estimateDeliveryTime() {
        return 60;
    }
}
public class Restaurent {
    public static void main(String[] args) {
      Restaurant r1=new Restaurant("Softwre Foodies",120);
      FastFoodRestaurant r2=new FastFoodRestaurant("Fast Foodzz",120);
      FineDiningRestaurant r3=new FineDiningRestaurant("The IICT",120);
      r1.displayInfo(); r2.displayInfo();r3.displayInfo();
    }
}