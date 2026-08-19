import java.util.Scanner;

public class Odd_and_Even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
        // Check if even or odd and print
    }
}
