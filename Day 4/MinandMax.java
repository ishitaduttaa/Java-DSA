import java.util.Scanner;
public class MinandMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());
        // Find and print min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max) max = numbers[i];
            if (numbers[i]<min) min = numbers[i];
        }
        System.out.print("Min: "+min+"\nMax: "+max);
    }
}

