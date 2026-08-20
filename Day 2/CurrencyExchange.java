import java.util.Scanner;
public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = Double.parseDouble(sc.nextLine().trim());
        double rate = Double.parseDouble(sc.nextLine().trim());
        System.out.printf("Result: %.2f",(amount*rate));
    }
}
