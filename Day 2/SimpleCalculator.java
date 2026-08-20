import java.util.Scanner;
public class SimpleCalculator  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        System.out.print(a +" + "+ b + " = "+(a+b)+"\n" + a + " - "+ b + " = "+(a-b)+"\n"+a +" * "+ b + " = "+(a*b)+"\n"+a+ " / " + b + " = "+(a/b));
    }
}
