import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double avg =0;
        int no=0;
        // Read scores and calculate average
        for(int i=0;i<n;i++){
            no = sc.nextInt();
            avg +=no;
        }
        // Print the average
        double total = avg/n;
        System.out.printf("Average: %.1f",total);
    }
}
