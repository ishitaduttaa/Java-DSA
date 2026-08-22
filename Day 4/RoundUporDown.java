import java.util.Scanner;

public class RoundUporDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine().trim());
        // Print rounded
        System.out.print("Rounded: "+Math.round(n));
    }
}
