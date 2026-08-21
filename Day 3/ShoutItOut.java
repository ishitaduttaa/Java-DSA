import java.util.Scanner;
public class ShoutItOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        System.out.println(word.toUpperCase());
        System.out.println("Length: "+word.length());
    }
}
