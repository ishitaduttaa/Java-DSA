import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int sum =0;
        int temp =n;
        while (n>0){
            sum +=n%10;
            n=n/10;
        }
        System.out.print(sum);
    }
}
