import java.util.Scanner;
public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = Double.parseDouble(sc.nextLine().trim());
        int discountPercent = Integer.parseInt(sc.nextLine().trim());
        double discount = price * discountPercent/100;
        double finalp = price - discount;
        System.out.printf("Discount: %.2f",discount);
        System.out.println();
        System.out.printf("Final price: %.2f",finalp);
    }
}
