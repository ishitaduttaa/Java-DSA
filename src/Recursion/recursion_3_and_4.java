package Recursion;
import java.util.Scanner;
//3. Print even numbers from 1 to N
//4. Print odd numbers from 1 to N
public class recursion_3_and_4 {
    static void even(int n){
        if(n==0) return;
        else if(n%2==0){
            even(n-2);
            System.out.println(n);
        }
    }
    static int odd(int n){
        if (n==1) return 1;
        else if (n%2!=0) {
           odd(n-2);
            System.out.println(n);
        }
        return n;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even(n);
        odd(n);
    }
}
