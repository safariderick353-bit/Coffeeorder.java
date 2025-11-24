class CoffeeOrder {
    String size;
    double price;

    // Constructor
    CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }
}
public class CoffeeShop {
    public static void main(String[] args) {
        // Create two CoffeeOrder objects
        CoffeeOrder order1 = new CoffeeOrder("Large", 4.50);
        CoffeeOrder order2 = new CoffeeOrder("Small", 2.25);

        // Display details
        System.out.println("Order 1: Size - " + order1.size + ", Price - $" + order1.price);
        System.out.println("Order 2: Size - " + order2.size + ", Price - $" + order2.price);
    }
}
