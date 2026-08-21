public class FirstandLast {
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        System.out.print("First: "+first+"\nLast: "+last);
    }
}
