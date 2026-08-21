public class DigitSum {
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int i =0;
        int sum=0;
        while(n>0){
            sum +=n%10;
            n = n/10;
        }
        System.out.print("Digit sum: "+sum);
    }
}
