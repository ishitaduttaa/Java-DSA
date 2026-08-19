import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = Integer.parseInt(sc.nextLine().trim());
        // Calculate fahrenheit
        float fahrenheit = (float)(celsius * 9/5 +32);
        // Print the results
        System.out.println(celsius+" Celsius = "+fahrenheit+" Fahrenheit");
    }
}
