
import java.util.Scanner;

public class Factorial {
    static long factorial(int n) {
        // Return the factorial of n
        if(n==1 || n==0) return 1;
        else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine().trim());
        System.out.println(num + "! = " + factorial(num));
    }
}
