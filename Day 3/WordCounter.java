import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        // Count and print the number of words
        char[] ch= sentence.toCharArray();
        int n = ch.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(ch[i]==' ') count++;
            else if(i==n-1) {count++; break;}
        }
        System.out.print(count+" words");
    }
}
