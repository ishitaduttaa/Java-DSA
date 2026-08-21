public class TipCalculator {
}

import java.util.Scanner;

public class Main {
    public static void calculateTip(double bill, int tipPercent) {
        double tip = bill * tipPercent/100;
        System.out.printf("Bill: $%.2f %nTip: $%.2f %nTotal: $%.2f",bill,tip,bill+tip);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = Double.parseDouble(sc.nextLine().trim());
        int tipPercent = Integer.parseInt(sc.nextLine().trim());
        calculateTip(bill, tipPercent);
    }
}
