import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        // Count down from n to 1
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
        System.out.print("Go!");
        // Print Go!
    }
}
