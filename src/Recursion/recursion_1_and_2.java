package Recursion;
import java.util.*;

public class recursion_1_and_2 {
    static int  count(int n){
    if(n==0){
        return 0;
    }
        System.out.print(n);  // 1 to n
        count(n-1);
        System.out.print(n);  // n to 1
        return n;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no.:");
      int n = sc.nextInt();
      count(n);
    }
}
