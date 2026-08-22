import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        // Print the absolute difference
        int difference = a-b;
        System.out.print("Difference: "+Math.abs(difference));
    }
}
