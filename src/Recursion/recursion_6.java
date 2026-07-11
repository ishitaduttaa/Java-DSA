package Recursion;
//6. Factorial of a number
public class recursion_6 {
    static int factorial(int n) {
        if (n < 0) return 0;
        else if (n == 0 || n==1) return 1;
        return n*factorial(n-1); //factorial

    }

    static void main(String[] args) {
        int n = 7;
        System.out.println(factorial(n));
    }
}
