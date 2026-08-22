import java.util.Scanner;
public class CountMatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());
        int target = Integer.parseInt(sc.nextLine().trim());
        int i=0;
        int count=0;
        while(i<n){
            if(numbers[i] == target) count++;
            i++;
        }
        System.out.print("Count: "+count);
    }
}
