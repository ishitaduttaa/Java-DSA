
import java.util.Scanner;

public class Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int total=0;
        for(int i=0;i<n;i++){
            int sum = sc.nextInt();
            total+=sum;
        }
        System.out.println("Sum: "+total);
    }
}
