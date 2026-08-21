import java.util.Scanner;

public class SplittheBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = Double.parseDouble(sc.nextLine().trim());
        int people = Integer.parseInt(sc.nextLine().trim());
        // Calculate and print
        System.out.printf("Each pays: %.2f",(total/people));
    }
}
