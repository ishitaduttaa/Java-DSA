import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        // Count and print the number of words
        int count=1;
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch == ' ') count++;
        }
        System.out.print(count);
    }
}
