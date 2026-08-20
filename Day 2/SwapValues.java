import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        String c = a;
        a=b;
        b=c;
        // Print them swapped
        System.out.print(a+"\n"+b);
    }
}
