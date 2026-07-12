package Recursion;
//11. Sum of digits 2318

public class recursion_11 {
    static int rev = 0;
    static int sumofd(int n){
        if(n == 0) return 0;
        return n%10 + sumofd(n / 10);
    }
    static int reverse(int n){
        if(n==0) return rev;
        rev *= 10 + n%10;
        System.out.println("the rev is"+rev);
        return reverse(n/10);
    }


    static void main(String[] args) {
        int n = 2127;
        System.out.println(sumofd(n));
        System.out.println(reverse(n));
    }
}
