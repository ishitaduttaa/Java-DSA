import java.util.Scanner;
public class CircleProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = Double.parseDouble(sc.nextLine().trim());
        double area = Math.PI*radius*radius;
        double cim = Math.PI*2*radius;
        System.out.printf("Area: %.2f%n Circumference: %.2f",area,cim);
    }
}

