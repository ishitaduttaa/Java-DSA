import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = Double.parseDouble(sc.nextLine().trim());
        double height = Double.parseDouble(sc.nextLine().trim());
        System.out.printf("BMI: %.1f",(weight/(height*height)));
    }
}

