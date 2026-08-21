public class RepeatString {
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            System.out.print(word);
        }
        // Print the word repeated n times
    }
}
