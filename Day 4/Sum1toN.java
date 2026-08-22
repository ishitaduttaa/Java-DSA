import java.util.Scanner;

public class Sum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        // Calculate and print the sum
        int i=1;
        int sum =0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum: "+sum);
    }
}
