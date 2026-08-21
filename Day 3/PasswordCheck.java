
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine().trim();
        // Check length and print
        int n = password.length();
        if(n>=8) System.out.print("Valid");
        else System.out.print("Invalid");
    }
}
