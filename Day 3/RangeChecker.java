public class RangeChecker {
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine().trim());
        int low = Integer.parseInt(sc.nextLine().trim());
        int high = Integer.parseInt(sc.nextLine().trim());
        if(low<=num && num<=high) System.out.print("In range");
        else System.out.print("Out of range");
    }
}
