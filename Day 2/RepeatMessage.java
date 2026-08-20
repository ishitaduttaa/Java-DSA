import java.util.Scanner;
public class RepeatMessage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            System.out.println(message);
        }
    }
}
