import java.util.Scanner;

public class PowerFunction {
    static long power(int base, int exp) {
        long result = 1;
        // Calculate base^exp using a loop
        for(int i=1;i<=exp;i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = Integer.parseInt(sc.nextLine().trim());
        int exp = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Result: " + power(base, exp));
    }
}
