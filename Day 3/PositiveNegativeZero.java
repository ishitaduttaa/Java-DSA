import java.util.Scanner;

public class PositiveNegativeZero  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        if(n>0) System.out.println("Positive");
        else if(n==0) System.out.print("Zero");
        else System.out.print("Negative");
    }
}
