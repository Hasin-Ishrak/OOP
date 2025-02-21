import java.util.Scanner;

abstract class Order {
    protected String customerName;
    protected String customerAddress;
    protected int quantity1;
    protected int quantity2;

    abstract void takeOrder();
    abstract void generateBill();
}

class OrderInput {
    private Scanner sc = new Scanner(System.in);

    public String getCustomerName() {
        System.out.print("Enter your name: ");
        return sc.nextLine();
    }

    public String getCustomerAddress() {
        System.out.print("Enter your address: ");
        return sc.nextLine();
    }

    public int getFoodChoice() {
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.print("Choose item (1 or 2): ");
        return sc.nextInt();
    }

    public int getQuantity() {
        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }
}

class BillGenerator {
    public void generateBill(String customerName, String customerAddress, int quantity1, int quantity2, double price1, double price2) {
        double total = (quantity1 * price1) + (quantity2 * price2);
        System.out.println("\n===== BILL =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        if (quantity1 > 0) {
            System.out.println("Burger x " + quantity1 + " = $" + (quantity1 * price1));
        }
        if (quantity2 > 0) {
            System.out.println("Pizza x " + quantity2 + " = $" + (quantity2 * price2));
        }
        System.out.println("Total Amount: $" + total);
    }
}

class FoodOrderingSystem extends Order {
    private final String foodName1 = "Burger";
    private final String foodName2 = "Pizza";
    private final double price1 = 5.99;
    private final double price2 = 8.99;
    private OrderInput input;
    private BillGenerator bill;

    public FoodOrderingSystem() {
        input = new OrderInput();
        bill = new BillGenerator();
    }
    @Override
    void takeOrder() {
        customerName = input.getCustomerName();
        customerAddress = input.getCustomerAddress();
        int choice = input.getFoodChoice();
        int quantity = input.getQuantity();
    
        switch (choice) {
            case 1 -> quantity1 = quantity;
            case 2 -> quantity2 = quantity;
            default -> System.out.println("Invalid choice!");
        }
    }
    
    @Override
    void generateBill() {
        bill.generateBill(customerName, customerAddress, quantity1, quantity2, price1, price2);
    }
}

public class ClassTask011 {
    public static void main(String[] args) {
        FoodOrderingSystem order = new FoodOrderingSystem();
        order.takeOrder();
        order.generateBill();
    }
}
