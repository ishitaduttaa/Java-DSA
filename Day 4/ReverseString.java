import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        // Reverse the string without using StringBuilder.reverse()
       /*char[] ch = s.toCharArray();
      for(int i=s.length()-1;i>=0;i--){
      System.out.print(ch[i]);
      } */

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            System.out.print(ch);
        }
    }
}

