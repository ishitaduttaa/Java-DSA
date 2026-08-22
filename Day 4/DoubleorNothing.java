import java.util.Scanner;

public class DoubleorNothing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        // Double if positive, otherwise print 0
        if(n>0) System.out.print(n*2);
        else System.out.print(0);
    }
}

