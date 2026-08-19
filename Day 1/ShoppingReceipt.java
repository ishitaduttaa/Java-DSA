import java.util.Scanner;

public class ShoppingReceipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine().trim();
        double price = Double.parseDouble(sc.nextLine().trim());
        int quantity = Integer.parseInt(sc.nextLine().trim());
        Double total = price*quantity;
        // Calculate total and print receipt
        System.out.println("Item: "+item);
        System.out.printf("Price: $%.2f",price);
        System.out.println();
        System.out.println("Quantity: "+quantity);
        System.out.printf("Total: $%.2f",total);
    }
}
