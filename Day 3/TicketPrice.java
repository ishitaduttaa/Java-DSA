import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine().trim());
        int price = 0;
        String type = "";
        // Determine ticket type and price
        if(age<12) {price = 5; type = "Child";}
        else if(age>=12 && age<64) {price = 15; type="Adult";}
        else {price = 8; type="Senior";}
        // Print results
        System.out.print(type+"\n$"+price);
    }
}
