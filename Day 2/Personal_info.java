import java.util.Scanner;

public class Personal_info  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        String age = sc.nextLine().trim();
        String city = sc.nextLine().trim();

        // Print the info
        System.out.print("Name: "+name+"\nAge: "+age+"\nCity: "+city);
    }
}
