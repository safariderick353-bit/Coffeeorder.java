import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to apply discount
    void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price = price - (price * percentage / 100);
        }
    }

    // Method to get price
    double getPrice() {
        return price;
    }
}
public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Product object
        Product product = new Product("Laptop", 1000.00);

        // Ask for discount percentage
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        // Apply the discount
        product.applyDiscount(discount);

        // Display the new price
        System.out.println("New price of the product: $" + product.getPrice());

        scanner.close();
    }
}
